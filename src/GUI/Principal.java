package GUI;


import Clases.Album;
import Clases.Artista;
import Clases.Biblioteca;
import Clases.Usuario;
import java.awt.Color;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

Biblioteca b = new Biblioteca();
Usuario u = new Usuario();

    public Principal() {
        initComponents();
        lblNombre.setText(u.getNombre().trim());
        btnAgregar.requestFocusInWindow();
        txtAnio.setForeground(Color.GRAY);
        
        //añado artista 
        Artista a = new Artista("5 Seconds Of Summer");
        List<Artista> artistas = new ArrayList<>(); // Inicializa la lista de artistas
        artistas.add(a);
        
        //añado album
        Album l = new Album("YoungBlood", 2018, "Sony", artistas);
        Album dos = new Album("5sos5", 2018, "Sony", artistas);
        Album tres = new Album("sgfg", 2013, "Sony", artistas);
        List<Album> albumnes = albumnes = new ArrayList<>(); 
        albumnes.add(l);
        albumnes.add(dos);
        albumnes.add(tres);
         
         
        
        //obtengo para imprimirlos  
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("Título");
        m.addColumn("Año de Lanzamiento");
        for (Album al: albumnes) {
            Object[] fila = {al.getNombreAlbum(), al.getAnioLanzamiento()};
            
            m.addRow(fila);
        }
         tblAlbumes.setModel(m);

    }
    
    public Principal(Biblioteca bl) {
        initComponents();
         lblNombre.setText(u.getNombre().trim());
        b = bl;

        btnAgregar.requestFocusInWindow();
        txtAnio.setForeground(Color.GRAY);
        
        //añado artista 
        Artista a = new Artista("5 Seconds Of Summer");
        List<Artista> artistas = new ArrayList<>(); // Inicializa la lista de artistas
        artistas.add(a);
        
        //añado album
        Album l = new Album("YoungBlood", 2018, "Sony", artistas);
        Album dos = new Album("5sos5", 2018, "Sony", artistas);
        Album tres = new Album("sgfg", 2013, "Sony", artistas);
        b.agregarAlbum(l);
        b.agregarAlbum(dos);
        b.agregarAlbum(tres);
        
        
        List<Album> albumnes = new ArrayList<>(); 
        albumnes = b.obtenerTodosAlbums();
        albumnes.toString();
        //obtengo para imprimirlos  
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("Título");
        m.addColumn("Año de Lanzamiento");
        for (Album al: albumnes) {
            Object[] fila = {al.getNombreAlbum(), al.getAnioLanzamiento()};
            
            m.addRow(fila);
        }
         tblAlbumes.setModel(m);

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
        txtAnio.setText("Filtro por anio");
        txtAnio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtAnio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnioFocusGained(evt);
            }
        });

        btnLupa.setBackground(new java.awt.Color(255, 255, 255));
        btnLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/loupe_751463.png"))); // NOI18N
        btnLupa.setBorder(null);
        btnLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(77, 77, 77))
                    .addComponent(lblAlbumes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLupa)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lblAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLupa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addGap(31, 31, 31))
        );

        lblNombre.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
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
        AgregarAlbum pantalla=new AgregarAlbum();
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtAnioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioFocusGained
        if (txtAnio.getText().equals("Filtro por anio")) {
            txtAnio.setText("");
            txtAnio.setForeground(Color.BLACK);
            //prueba
        }


    }//GEN-LAST:event_txtAnioFocusGained

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
        int anio = Integer.parseInt(txtAnio.getText().trim());
        
        List<Album> albumnesBusqueda = new ArrayList<>(); 
        albumnesBusqueda = b.buscarAlbumsPorAnio(anio);
        
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("Título");
        m.addColumn("Año de Lanzamiento");
        for (Album al: albumnesBusqueda) {
            Object[] fila = {al.getNombreAlbum(), al.getAnioLanzamiento()};
            
            m.addRow(fila);
        }
         tblAlbumes.setModel(m);
        
        
    }//GEN-LAST:event_btnLupaActionPerformed

    private void tblAlbumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlbumesMouseClicked
        int row=tblAlbumes.getSelectedRow();
        System.out.println(row);
        String nombreAlbum=tblAlbumes.getValueAt(row, 0).toString();
        AgregarCancion pantallaCancion=new AgregarCancion(nombreAlbum);
        pantallaCancion.setVisible(true);
        dispose();
    }//GEN-LAST:event_tblAlbumesMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLupa;
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
