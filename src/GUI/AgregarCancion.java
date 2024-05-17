
package GUI;

public class AgregarCancion extends javax.swing.JFrame {

    private String nombre;
    
    public AgregarCancion(String nombreAlbum) {
        this.nombre=nombreAlbum;
        initComponents();
        System.out.println("nombre de album "+nombreAlbum);
    }
    public AgregarCancion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblAgregarAlbum = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblArtistas = new javax.swing.JLabel();
        lblDisquera = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDisquera = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        btnAniadir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtArtistas = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblAgregarCancion = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtTituloCan = new javax.swing.JTextField();
        btnAniadirCan = new javax.swing.JButton();
        btnAgregarCan = new javax.swing.JButton();
        btnVolverCan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCanciones = new javax.swing.JTable();
        jLagregarCancion = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flecha-atras.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblAgregarAlbum.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        lblAgregarAlbum.setText("Agregar nuevo álbum");

        lblAnio.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblAnio.setText("Anio de lanzamiento");

        lblNombre1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblNombre1.setText("Nombre");

        lblArtistas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblArtistas.setText("Artistas");

        lblDisquera.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        lblDisquera.setText("Disquera");

        txtAnio.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDisquera.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtDisquera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisqueraActionPerformed(evt);
            }
        });

        txtArtista.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtistaActionPerformed(evt);
            }
        });

        btnAniadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/simboloSuma.png"))); // NOI18N
        btnAniadir.setBorder(null);

        btnAgregar.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        btnAgregar.setText("Agregar");

        txtArtistas.setBackground(new java.awt.Color(255, 255, 255));
        txtArtistas.setColumns(1);
        txtArtistas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtArtistas.setEditable(false);
        txtArtistas.setEnabled(false);
        txtArtistas.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        txtArtistas.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnio)
                            .addComponent(lblNombre1)
                            .addComponent(lblDisquera)
                            .addComponent(lblArtistas))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblAgregarAlbum))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnAgregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblAgregarAlbum)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisquera)
                    .addComponent(txtDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblArtistas)
                        .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(txtArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(46, 46, 46))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setSize(new java.awt.Dimension(450, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarCancion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblAgregarCancion.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarCancion.setText("Agregar nueva cancion");
        jPanel2.add(lblAgregarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 25, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Titulo  :");
        jPanel2.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 109, -1, -1));

        txtDuracion.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 165, 127, -1));

        lblDuracion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(51, 51, 51));
        lblDuracion.setText("Duracion (min) :");
        jPanel2.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 164, -1, -1));

        txtTituloCan.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtTituloCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloCanActionPerformed(evt);
            }
        });
        jPanel2.add(txtTituloCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 110, 127, -1));

        btnAniadirCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/simboloSuma.png"))); // NOI18N
        btnAniadirCan.setBorder(null);
        btnAniadirCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirCanActionPerformed(evt);
            }
        });
        jPanel2.add(btnAniadirCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 164, 31, 22));

        btnAgregarCan.setBackground(new java.awt.Color(189, 205, 228));
        btnAgregarCan.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnAgregarCan.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregarCan.setText("Agregar");
        btnAgregarCan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));
        jPanel2.add(btnAgregarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 80, 30));

        btnVolverCan.setBackground(new java.awt.Color(189, 205, 228));
        btnVolverCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flecha-atras.png"))); // NOI18N
        btnVolverCan.setBorder(null);
        btnVolverCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCanActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolverCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 27, 25));

        jTableCanciones.setBackground(new java.awt.Color(189, 205, 228));
        jTableCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Duración"
            }
        ));
        jScrollPane2.setViewportView(jTableCanciones);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 193, 284));

        jLagregarCancion.setBackground(new java.awt.Color(255, 102, 102));
        jLagregarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/descarga (13).jpeg"))); // NOI18N
        jPanel2.add(jLagregarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        BuscarAlbum pantalla=new BuscarAlbum();
        pantalla.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDisqueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisqueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisqueraActionPerformed

    private void txtArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtistaActionPerformed

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void txtTituloCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloCanActionPerformed

    private void btnVolverCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCanActionPerformed
        BuscarAlbum pantalla=new BuscarAlbum();
        pantalla.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVolverCanActionPerformed

    private void btnAniadirCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAniadirCanActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCancion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCan;
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnAniadirCan;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverCan;
    private javax.swing.JLabel jLagregarCancion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCanciones;
    private javax.swing.JLabel lblAgregarAlbum;
    private javax.swing.JLabel lblAgregarCancion;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblArtistas;
    private javax.swing.JLabel lblDisquera;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtArtista;
    private java.awt.TextArea txtArtistas;
    private javax.swing.JTextField txtDisquera;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTituloCan;
    // End of variables declaration//GEN-END:variables
}
