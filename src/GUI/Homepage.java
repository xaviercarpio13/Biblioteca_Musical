
package GUI;

import Clases.OpcionesMenu;

public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgreCancion = new javax.swing.JButton();
        btnAgreAlbum = new javax.swing.JButton();
        btnBuscarAlbum = new javax.swing.JButton();
        btnDetalleAlbum = new javax.swing.JButton();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cine");
        setBackground(new java.awt.Color(230, 242, 242));

        btnAgreCancion.setBackground(new java.awt.Color(189, 205, 228));
        btnAgreCancion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgreCancion.setForeground(new java.awt.Color(51, 51, 51));
        btnAgreCancion.setText("Agregrar Canción");
        btnAgreCancion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgreCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreCancionActionPerformed(evt);
            }
        });

        btnAgreAlbum.setBackground(new java.awt.Color(189, 205, 228));
        btnAgreAlbum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgreAlbum.setForeground(new java.awt.Color(51, 51, 51));
        btnAgreAlbum.setText("Agregrar Album");
        btnAgreAlbum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgreAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreAlbumActionPerformed(evt);
            }
        });

        btnBuscarAlbum.setBackground(new java.awt.Color(189, 205, 228));
        btnBuscarAlbum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscarAlbum.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscarAlbum.setText("Buscar Album");
        btnBuscarAlbum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlbumActionPerformed(evt);
            }
        });

        btnDetalleAlbum.setBackground(new java.awt.Color(189, 205, 228));
        btnDetalleAlbum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDetalleAlbum.setForeground(new java.awt.Color(51, 51, 51));
        btnDetalleAlbum.setText("Ver Lista de Canciones");
        btnDetalleAlbum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetalleAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleAlbumActionPerformed(evt);
            }
        });

        jLFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/descarga (13).jpeg"))); // NOI18N
        jLFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDetalleAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalleAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgreAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreAlbumActionPerformed
  OpcionesMenu.agregarAlbum(this);
    }//GEN-LAST:event_btnAgreAlbumActionPerformed

    private void btnAgreCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreCancionActionPerformed
           OpcionesMenu.agregarCancion(this);
    }//GEN-LAST:event_btnAgreCancionActionPerformed

    private void btnBuscarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlbumActionPerformed
    OpcionesMenu.buscarAlbum(this);
    }//GEN-LAST:event_btnBuscarAlbumActionPerformed

    private void btnDetalleAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleAlbumActionPerformed
      OpcionesMenu.detalleAlbum(this);
    }//GEN-LAST:event_btnDetalleAlbumActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgreAlbum;
    private javax.swing.JButton btnAgreCancion;
    private javax.swing.JButton btnBuscarAlbum;
    private javax.swing.JButton btnDetalleAlbum;
    private javax.swing.JLabel jLFondo;
    // End of variables declaration//GEN-END:variables
}
