package controlador;

import bd.Conexion;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class Cuenta {


   
public Cliente buscarPorRut(String rutCliente, String dvCliente, String clave) {
    Cliente cliente = null;

    try {
        Connection cnx = new Conexion().obtenerConexion();

        String query = "SELECT rut, dv, nombre, apellido_paterno, apellido_materno, domicilio, comuna, telefono, tipo_cuenta, numero, saldo FROM clientes WHERE rut=? and dv=? and clave=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, rutCliente);
        stmt.setString(2, dvCliente);
        stmt.setString(3, clave);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            cliente = new Cliente();
            cliente.setRut(rs.getString("rut"));
            cliente.setDv(rs.getString("dv"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setApellidoPaterno(rs.getString("apellido_paterno"));
            cliente.setApellidoMaterno(rs.getString("apellido_materno"));
            cliente.setDomicilio(rs.getString("domicilio"));
            cliente.setComuna(rs.getString("comuna"));
            cliente.setTelefono(rs.getInt("telefono"));
            cliente.setTipoCuenta(rs.getInt("tipo_cuenta"));
            cliente.setNumero(rs.getInt("numero"));
            cliente.setSaldo(rs.getInt("saldo"));
        }

        rs.close();
        stmt.close();
        cnx.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return cliente;
}

public Cliente buscarPorNumeroCuenta(String numeroCuenta) {
    Cliente cliente = null;

    try {
        Connection cnx = new Conexion().obtenerConexion();

        String query = "SELECT rut, dv, nombre, apellido_paterno, apellido_materno, domicilio, comuna, telefono, tipo_cuenta, numero, saldo FROM clientes WHERE numero=?";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, numeroCuenta);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            cliente = new Cliente();
            cliente.setRut(rs.getString("rut"));
            cliente.setDv(rs.getString("dv"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setApellidoPaterno(rs.getString("apellido_paterno"));
            cliente.setApellidoMaterno(rs.getString("apellido_materno"));
            cliente.setDomicilio(rs.getString("domicilio"));
            cliente.setComuna(rs.getString("comuna"));
            cliente.setTelefono(rs.getInt("telefono"));
            cliente.setTipoCuenta(rs.getInt("tipo_cuenta"));
            cliente.setNumero(rs.getInt("numero"));
            cliente.setSaldo(rs.getInt("saldo"));
        }

        rs.close();
        stmt.close();
        cnx.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return cliente;
}

    public Cliente realizarTransferencia(int monto, String numeroCuentaDestino, Cliente clienteOrigen) {
        Cliente clienteActualizado = null;

        try (Connection cnx = new Conexion().obtenerConexion()) {
            int saldoOrigen = clienteOrigen.getSaldo();
            if (saldoOrigen >= monto) {
                Cliente clienteDestino = buscarPorNumeroCuenta(numeroCuentaDestino);

                if (clienteDestino != null) {
                    cnx.setAutoCommit(false);

                    try {
                        String updateSaldoOrigen = "UPDATE clientes SET saldo = ? WHERE numero = ?";
                        try (PreparedStatement stmtOrigen = cnx.prepareStatement(updateSaldoOrigen)) {
                            stmtOrigen.setInt(1, saldoOrigen - monto);
                            stmtOrigen.setInt(2, clienteOrigen.getNumero());
                            stmtOrigen.executeUpdate();
                        }

                        String updateSaldoDestino = "UPDATE clientes SET saldo = ? WHERE numero = ?";
                        try (PreparedStatement stmtDestino = cnx.prepareStatement(updateSaldoDestino)) {
                            stmtDestino.setInt(1, clienteDestino.getSaldo() + monto);
                            stmtDestino.setInt(2, clienteDestino.getNumero());
                            stmtDestino.executeUpdate();
                        }

                        cnx.commit();

                        clienteActualizado = buscarPorNumeroCuenta(String.valueOf(clienteOrigen.getNumero()));
                    } catch (SQLException e) {
                        cnx.rollback();
                        throw e;
                    } finally {
                        cnx.setAutoCommit(true);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clienteActualizado;
    }

    public void registrarTransferencia(int cuentaOrigen, int monto, String cuentaDestino) {
        try (Connection cnx = new Conexion().obtenerConexion()) {
            String query = "INSERT INTO historial_transf (cuenta_origen, monto, cuenta_destino, fecha_hora) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = cnx.prepareStatement(query)) {
                stmt.setInt(1, cuentaOrigen);
                stmt.setInt(2, monto);
                stmt.setString(3, cuentaDestino);
                stmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    

}
