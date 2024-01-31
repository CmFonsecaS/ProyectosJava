
package vistas;


import javax.swing.JOptionPane;
import controlador.Cuenta;
import modelo.Cliente;

public class transferir extends javax.swing.JFrame {
   
     private Cliente cliente;
     private inicio ventanaInicio;
     private historial ventanaHistorial;

    public transferir(Cliente cliente) {
        initComponents();
        this.cliente = cliente;  
        this.ventanaInicio = ventanaInicio;
        this.ventanaHistorial = ventanaHistorial;
        lblNcuenta.setText(String.valueOf(cliente.getNumero()));
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNcuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCuentaDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnTransferir = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntInicio = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mntHistorial = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mntSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("West Bank");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), null));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setText("Este es tu número de cuenta:");

        lblNcuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese el número de la cuenta de destino");

        txtCuentaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaDestinoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setText("Ingresa el monto a transferir ");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        btnTransferir.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblNcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtCuentaDestino)
                            .addComponent(txtMonto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jMenu1.setText("Inicio");

        mntInicio.setText("Volver a Inicio");
        mntInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntInicioActionPerformed(evt);
            }
        });
        jMenu1.add(mntInicio);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Historial de Transferencias");

        mntHistorial.setText("Revisar Historial");
        mntHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntHistorialActionPerformed(evt);
            }
        });
        jMenu3.add(mntHistorial);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        mntSalir.setText("Salir del Programa");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mntHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntHistorialActionPerformed
     
     this.dispose();
     historial ventanaHistorial = new historial(cliente);
     ventanaHistorial.setVisible(true);
           
    
    }//GEN-LAST:event_mntHistorialActionPerformed

    private void mntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSalirActionPerformed
       
    String mensaje = "<html><font color='blue' size='+1'><b>Ha salido del programa.</b></font></html>";
    JOptionPane.showMessageDialog(this, mensaje, "Salida", JOptionPane.INFORMATION_MESSAGE);
        
    System.exit(0);  
    
    }//GEN-LAST:event_mntSalirActionPerformed

    private void mntInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntInicioActionPerformed
        this.dispose();
        ventanaInicio.actualizarSaldo(cliente.getSaldo());
        ventanaInicio.setVisible(true);

    }//GEN-LAST:event_mntInicioActionPerformed

    private void txtCuentaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaDestinoActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
                                              
    try {
        Cuenta cuentaControlador = new Cuenta();
        String numeroCuentaDestino = txtCuentaDestino.getText().trim();

        if (numeroCuentaDestino.isEmpty()) {
            throw new IllegalArgumentException("Por favor, ingresa el número de cuenta de destino.");
        }

        int montoTransferencia = Integer.parseInt(txtMonto.getText().trim());

        Cliente clienteActualizado = cuentaControlador.realizarTransferencia(montoTransferencia, numeroCuentaDestino, cliente);

        if (clienteActualizado != null) {
        
            cuentaControlador.registrarTransferencia(cliente.getNumero(), montoTransferencia, numeroCuentaDestino);

            ventanaInicio.actualizarSaldo(clienteActualizado.getSaldo());

            lblMensaje.setText("Transferencia realizada con éxito");
            txtCuentaDestino.setText("");
            txtMonto.setText("");

            dispose();
        } else {
            lblMensaje.setText("Error al realizar la transferencia");
        }
    } catch (NumberFormatException e) {
        lblMensaje.setText("Por favor, ingresa un monto válido");
    } catch (IllegalArgumentException e) {
        lblMensaje.setText(e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
        lblMensaje.setText("Error inesperado al realizar la transferencia");
    }

    }//GEN-LAST:event_btnTransferirActionPerformed
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNcuenta;
    private javax.swing.JMenuItem mntHistorial;
    private javax.swing.JMenuItem mntInicio;
    private javax.swing.JMenuItem mntSalir;
    private javax.swing.JTextField txtCuentaDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
 
}
