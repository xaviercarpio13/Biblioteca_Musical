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
        jTextField1.setText(b.toString());
        
        
       lblArtistasComa.setVisible(false);
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
        lblArtistasComa = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setPreferredSize(new java.awt.Dimension(451, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
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

        txtNombre.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        txtDisquera.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N

        txtArtista.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txtArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtistaActionPerformed(evt);
            }
        });

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

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(43, 43, 43)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
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
           // albumnes.add(al);
            b.agregarAlbum(al);
            JOptionPane.showInternalMessageDialog(null, "Registro guardado");
            
            jTextField1.setText(b.toString());
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

    private void txtArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtistaActionPerformed

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
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
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
