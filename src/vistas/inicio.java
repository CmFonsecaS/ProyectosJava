
package vistas;

import javax.swing.JOptionPane;
import modelo.Cliente;

        
    public class inicio extends javax.swing.JFrame {
    private Cliente cliente;

    public inicio(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
    
        lblNombreCli.setText(cliente.getNombre()+ " " + cliente.getApellidoPaterno() + " " +cliente.getApellidoMaterno());
        lblSaldo.setText(String.valueOf("$" + cliente.getSaldo()));
    }
   public void actualizarSaldo(int nuevoSaldo) {
        lblSaldo.setText(String.valueOf("$" + nuevoSaldo));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreCli = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntTransferir = new javax.swing.JMenu();
        mntTransferencia = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mntHistorial = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mntSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("West Bank");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), null));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido(a):");

        lblNombreCli.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setText("Tu saldo es:");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(lblNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        mntTransferir.setText("Transferir");

        mntTransferencia.setText("Realizar Transfencias");
        mntTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntTransferenciaActionPerformed(evt);
            }
        });
        mntTransferir.add(mntTransferencia);

        jMenuBar1.add(mntTransferir);

        jMenu3.setText("Historial de transferencias");

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
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
      
     transferir ventanaTransferir = new transferir(cliente);
     ventanaTransferir.setVisible(true);
      
    }//GEN-LAST:event_mntTransferenciaActionPerformed

    private void mntHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntHistorialActionPerformed
     
     historial ventanaHistorial = new historial(cliente);
     ventanaHistorial.setVisible(true);
         
    }//GEN-LAST:event_mntHistorialActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreCli;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JMenuItem mntHistorial;
    private javax.swing.JMenuItem mntSalir;
    private javax.swing.JMenuItem mntTransferencia;
    private javax.swing.JMenu mntTransferir;
    // End of variables declaration//GEN-END:variables
}
