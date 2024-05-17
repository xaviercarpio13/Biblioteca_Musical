package GUI;


import java.awt.Color;

public class BuscarAlbum extends javax.swing.JFrame {

    public BuscarAlbum() {
        initComponents();

        btnAgregar.requestFocusInWindow();
        txtAnio.setForeground(Color.GRAY);
        //Configuración de la tabla de albumes

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        lblAlbumes = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        btnLupa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblAlbumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlbumesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlbumes);

        lblAlbumes.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        lblAlbumes.setText("Últimos álbumes agregados");

        btnAgregar.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        btnAgregar.setText("Buscar ");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 370, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/descarga (13).jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
                new BuscarAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlbumes;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTextField txtAnio;
    // End of variables declaration//GEN-END:variables
}
