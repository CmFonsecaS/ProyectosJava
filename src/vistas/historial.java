
package vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;


public class historial extends javax.swing.JFrame {
private final Cliente cliente;
   
 public historial(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        cargarDatosHistorial();
    }
    
 
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntInicio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mntTransferencia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mntSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("West Bank");

        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_transaccion", "cuenta_origen", "monto", "cuenta_destino", "fecha_hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHistorial);

        jMenu1.setText("Inicio");

        mntInicio.setText("Volver a Inicio");
        mntInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntInicioActionPerformed(evt);
            }
        });
        jMenu1.add(mntInicio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transferir");

        mntTransferencia.setText("Realizar Transferencia");
        mntTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntTransferenciaActionPerformed(evt);
            }
        });
        jMenu2.add(mntTransferencia);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salir");

        mntSalir.setText("Salir de Programa");
        mntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntSalirActionPerformed(evt);
            }
        });
        jMenu4.add(mntSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSalirActionPerformed
    
    String mensaje = "<html><font color='blue' size='+1'><b>Ha salido del programa.</b></font></html>";
    JOptionPane.showMessageDialog(this, mensaje, "Salida", JOptionPane.INFORMATION_MESSAGE);
        
    System.exit(0);  
    
    }//GEN-LAST:event_mntSalirActionPerformed

    private void mntTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntTransferenciaActionPerformed
  
    this.dispose();

    transferir ventanaTransferir = new transferir(cliente);
    ventanaTransferir.setVisible(true);

    }//GEN-LAST:event_mntTransferenciaActionPerformed

    private void mntInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntInicioActionPerformed
        
    this.dispose();
  
    inicio ventanaInicio = new inicio(cliente);
    ventanaInicio.setVisible(true);
    
    }//GEN-LAST:event_mntInicioActionPerformed

private void cargarDatosHistorial() {
    DefaultTableModel modelo = (DefaultTableModel) tblHistorial.getModel();
    modelo.setRowCount(0); 

    try {
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/westbank", "root", "");

        String sql = "SELECT id_transaccion, cuenta_origen, monto, cuenta_destino, fecha_hora FROM historial_transf WHERE cuenta_origen = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, cliente.getNumero());
        
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Vector<Object> fila = new Vector<>();
            fila.add(rs.getInt("id_transaccion"));
            fila.add(rs.getInt("cuenta_origen"));
            fila.add(rs.getInt("monto"));
            fila.add(rs.getInt("cuenta_destino"));
            fila.add(rs.getTimestamp("fecha_hora"));
            modelo.addRow(fila);
        }

        rs.close();
        stmt.close();
        con.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar datos del historial.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mntInicio;
    private javax.swing.JMenuItem mntSalir;
    private javax.swing.JMenuItem mntTransferencia;
    public javax.swing.JTable tblHistorial;
    // End of variables declaration//GEN-END:variables
}
