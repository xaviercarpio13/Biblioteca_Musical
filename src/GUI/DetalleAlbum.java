
package GUI;

import Clases.OpcionesMenu;

/**
 *
 * @author xavic
 */
public class DetalleAlbum extends javax.swing.JFrame {

    /**
     * Creates new form DetalleAlbum
     */
    public DetalleAlbum() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIAgregarAlbum = new javax.swing.JMenuItem();
        jMIAgregarCancion = new javax.swing.JMenuItem();
        jMIBuscarAlbum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setSize(new java.awt.Dimension(450, 450));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Album : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 110, -1));

        jTable2.setBackground(new java.awt.Color(189, 205, 228));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo-Canción", "Duración"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 270, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/loupe_751463.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/descarga (13).jpeg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 390));

        jMenuBar1.setBackground(new java.awt.Color(189, 205, 228));

        jMenu1.setBackground(new java.awt.Color(189, 205, 228));
        jMenu1.setText("Salir");

        jMISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMIAgregarAlbum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIAgregarAlbum.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jMIAgregarAlbum.setForeground(new java.awt.Color(51, 51, 51));
        jMIAgregarAlbum.setText("Agregar-Album");
        jMIAgregarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgregarAlbumActionPerformed(evt);
            }
        });
        jMenu2.add(jMIAgregarAlbum);

        jMIAgregarCancion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIAgregarCancion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jMIAgregarCancion.setForeground(new java.awt.Color(51, 51, 51));
        jMIAgregarCancion.setText("Agregar-Canción");
        jMIAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgregarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(jMIAgregarCancion);

        jMIBuscarAlbum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIBuscarAlbum.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jMIBuscarAlbum.setForeground(new java.awt.Color(51, 51, 51));
        jMIBuscarAlbum.setText("Buscar-Album");
        jMIBuscarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarAlbumActionPerformed(evt);
            }
        });
        jMenu2.add(jMIBuscarAlbum);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAgregarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgregarAlbumActionPerformed
      
        
        this.setVisible(false);
    }//GEN-LAST:event_jMIAgregarAlbumActionPerformed

    private void jMIAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgregarCancionActionPerformed
    OpcionesMenu.agregarCancion(this);        
        
        this.setVisible(false);
    }//GEN-LAST:event_jMIAgregarCancionActionPerformed

    private void jMIBuscarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarAlbumActionPerformed
        OpcionesMenu.buscarAlbum(this);
    }//GEN-LAST:event_jMIBuscarAlbumActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        OpcionesMenu.salir(this);
    }//GEN-LAST:event_jMISalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalleAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMIAgregarAlbum;
    private javax.swing.JMenuItem jMIAgregarCancion;
    private javax.swing.JMenuItem jMIBuscarAlbum;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
