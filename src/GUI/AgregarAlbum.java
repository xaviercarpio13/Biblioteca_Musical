
package GUI;

import Clases.Album;
import Clases.Artista;
import Clases.Biblioteca;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class AgregarAlbum extends javax.swing.JFrame {
    Biblioteca b = new Biblioteca();
    List<Artista> artistas = new ArrayList<>();
    List<Album> albumnes = new ArrayList<>();
   
    public AgregarAlbum() {
        initComponents();
        lblArtistasComa.setVisible(false);
    }
    public AgregarAlbum(Biblioteca bl) {
        initComponents();
        
        b = new Biblioteca();
        albumnes = bl.obtenerTodosAlbums();
        b.setAlbumnes(albumnes);
        albumnes = b.obtenerTodosAlbums();
        
        
       lblArtistasComa.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAgregarAlbum = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblDisquera = new javax.swing.JLabel();
        lblArtistas = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtDisquera = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnAniadir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblArtistasComa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(128, 205, 228));
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(29, 79, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarAlbum.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblAgregarAlbum.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarAlbum.setText("Añadir Album ");
        jPanel1.add(lblAgregarAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblNombre1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre1.setText("Nombre :");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblAnio.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(51, 51, 51));
        lblAnio.setText("Año lanzamiento  :");
        jPanel1.add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblDisquera.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblDisquera.setForeground(new java.awt.Color(51, 51, 51));
        lblDisquera.setText("Disquera  :");
        jPanel1.add(lblDisquera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblArtistas.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lblArtistas.setForeground(new java.awt.Color(51, 51, 51));
        lblArtistas.setText("Artistas  :");
        jPanel1.add(lblArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtNombre.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 120, 20));

        txtAnio.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        txtDisquera.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        txtArtista.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        btnAniadir.setBackground(new java.awt.Color(255, 255, 255));
        btnAniadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/simboloSuma.png"))); // NOI18N
        btnAniadir.setBorder(null);
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblArtistasComa.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        lblArtistasComa.setText("Ingresa los artistas separados por comas");

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
                        .addGap(175, 175, 175)
                        .addComponent(btnAgregar)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblArtistasComa)
                .addGap(96, 96, 96))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblArtistasComa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArtistas)
                            .addComponent(txtArtista)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //datos
        String nombreAlbum = txtNombre.getText().trim();
        int anioLanzamiento = Integer.parseInt(txtAnio.getText().trim());
        String Disquera = txtDisquera.getText().trim();

        //obtener lista de artistas:
        String linea = txtArtista.getText();
        StringTokenizer tokens = new StringTokenizer(linea, ",");
        while (tokens.hasMoreTokens()) {
            Artista a = new Artista(tokens.nextToken().trim());
            artistas.add(a);
        }

        //creo el album
        Album al = new Album(nombreAlbum, anioLanzamiento, Disquera, artistas);
        try{
            b.agregarAlbum(al);
            JOptionPane.showInternalMessageDialog(null, "Registro guardado");
            
            Principal pantalla=new Principal(b);
            pantalla.setVisible(true);
            dispose();
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, "Error");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        lblArtistasComa.setVisible(true);
        Dimension size = new Dimension(txtArtista.getWidth(), (txtArtista.getHeight()+60));
        txtArtista.setPreferredSize(size);
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla=new Principal(this.b);
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


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
            java.util.logging.Logger.getLogger(AgregarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAlbum().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAniadir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMIAgregarCancion;
    private javax.swing.JMenuItem jMIBuscarAlbum;
    private javax.swing.JMenuItem jMIDetalleAlbum;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTañadirAlbum;
    private javax.swing.JLabel lblAgregarAlbum;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblArtistas;
    private javax.swing.JLabel lblArtistasComa;
    private javax.swing.JLabel lblDisquera;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtDisquera;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
