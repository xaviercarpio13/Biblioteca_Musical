package GUI;


import Clases.Album;
import Clases.Artista;
import Clases.Biblioteca;
import Clases.Cancion;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

List<Album> albumnes = new ArrayList<>(); 
List<Artista> artistas = new ArrayList<>();
Biblioteca b;
Album buscado = new Album();
String nombreUsuario = "Xavier";

    public Principal() {
        initComponents();
        
        configurarVistaInicial();
        agregarInfoInicial();  
        
        cargarTabla(albumnes);

    }
    
    public Principal(Biblioteca bl) {
        initComponents();
        
        configurarVistaInicial();
        albumnes = bl.obtenerTodosAlbums();
        
        b = new Biblioteca(albumnes); 
        cargarTabla(albumnes);
        guardarBiblioteca();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        lblAlbumes = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        btnLupa = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAgregarCancion = new javax.swing.JButton();
        btnVerInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));

        lblBienvenida.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lblBienvenida.setText("Bienvenido,");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblAlbumes.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"reputation", "2017"},
                {"folklore", "2020"}
            },
            new String [] {
                "Título", "Anio"
            }
        ));
        tblAlbumes.setCellSelectionEnabled(true);
        tblAlbumes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblAlbumes.setGridColor(new java.awt.Color(0, 0, 0));
        tblAlbumes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblAlbumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlbumesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlbumes);

        lblAlbumes.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        lblAlbumes.setText("Últimos álbumes agregados");

        btnAgregar.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        btnAgregar.setText("Agregar album");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtAnio.setFont(new java.awt.Font("Gadugi", 0, 10)); // NOI18N
        txtAnio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnLupa.setBackground(new java.awt.Color(255, 255, 255));
        btnLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/loupe_751463.png"))); // NOI18N
        btnLupa.setBorder(null);
        btnLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flecha-atras.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregarCancion.setText("Agregar Cancion");
        btnAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCancionActionPerformed(evt);
            }
        });

        btnVerInfo.setText("Ver informacion ");
        btnVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro por año:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnAgregar)
                            .addGap(77, 77, 77))
                        .addComponent(lblAlbumes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCancion)
                    .addComponent(btnVerInfo))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnLupa))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnAgregarCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)))
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenida)
                    .addComponent(lblNombre))
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarAlbum pantalla=new AgregarAlbum(b);
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
        int anio = Integer.parseInt(txtAnio.getText().trim());
        
        List<Album> albumnesBusqueda = new ArrayList<>(); 
        albumnesBusqueda = b.buscarAlbumsPorAnio(anio);
        cargarTabla(albumnesBusqueda);
    }//GEN-LAST:event_btnLupaActionPerformed

    private void tblAlbumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlbumesMouseClicked
       
        int aux = tblAlbumes.getSelectedRow();
        String nombreAlbum = tblAlbumes.getValueAt(aux, 0).toString();
        buscado = b.obtenerAlbum(nombreAlbum);
        if (aux != -1) {
            btnAgregarCancion.setVisible(true);
            btnVerInfo.setVisible(true);
        }    
    }//GEN-LAST:event_tblAlbumesMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       cargarTabla(albumnes);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoActionPerformed
        InfoAlbum ia = new InfoAlbum(buscado,b);
        ia.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVerInfoActionPerformed

    private void btnAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCancionActionPerformed
        AgregarCancion pantallaCancion=new AgregarCancion(buscado,b);
        pantallaCancion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarCancionActionPerformed

    private void configurarVistaInicial(){
        lblNombre.setText(nombreUsuario.trim());
        btnAgregar.requestFocusInWindow();
        txtAnio.setForeground(Color.GRAY);
        btnAgregarCancion.setVisible(false);
        btnVerInfo.setVisible(false);
    }
    
    private void cargarTabla(List<Album> lista){
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("Título");
        m.addColumn("Año de Lanzamiento");
        for (Album al: lista) {
            Object[] fila = {al.getNombreAlbum(), al.getAnioLanzamiento()};
            m.addRow(fila);
        }
         tblAlbumes.setModel(m);
    }
    
    private void agregarInfoInicial(){
        //añado artista 
        Artista a = new Artista("5 Seconds Of Summer");
        
        artistas.add(a);
         
        
        //añado dos canciones
        Cancion c1 = new Cancion("vapor", 120);
        Cancion c2 = new Cancion("carry on", 140);
        List<Cancion> listaCanciones = new ArrayList<>();
        listaCanciones.add(c1);
        listaCanciones.add(c2);
        
        
        //añado album
        
        Album l = new Album("YoungBlood", 2018, "Sony", artistas);
        Album dos = new Album("5sos5", 2018, "Sony", artistas);
        Album tres = new Album("sgfg", 2013, "Sony", artistas,listaCanciones);
        
        
        //agredo los albumnes a la lista
        albumnes.add(l);
        albumnes.add(dos);
        albumnes.add(tres);
        
        
        b = new Biblioteca();
        b.setAlbumnes(albumnes);
    }
    
    public void guardarBiblioteca(){
        b = new Biblioteca();
        b.setAlbumnes(albumnes);
    };
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCancion;
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnVerInfo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlbumes;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTextField txtAnio;
    // End of variables declaration//GEN-END:variables
}
