package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class Biblioteca {
    private List<Album> albumes;

    public Biblioteca() {
    }

    public List<Album> obtenerTodosAlbums() {
        return albumes;
    }

    public void setAlbumes(List<Album> albumes) {
        this.albumes = albumes;
    }
    
    public void obtenerAlbum (String nombre){
        //mostar las canciones que tiene el album con su duracion
    }
    
    public void agregarAlbum(Album alb){
        try {
            Connection cn = Conexion.getConection();
            String query = "INSERT INTO album (nombreAlbum, anioLanzamientoAlbum, disqueraAlbum) VALUES (?,?,?)";

            PreparedStatement insertar = cn.prepareStatement(query);

            insertar.setString(1, alb.getNombreAlbum());
            insertar.setInt(2, alb.getAnioLanzamiento());
            insertar.setString(3, alb.getDisquera());

            insertar.executeUpdate();
            insertar.close();

            JOptionPane.showInternalMessageDialog(null, "Registro guardado");

        } catch (SQLException e) {
            System.out.println("Error  al agregar al Album" + e.getMessage());
        }
       // albumes.add(dbo);
    }
    
    public Album buscarAlbumsPorAnio(int anio){
        //buscar album por año 
        Album album = albumes.get(anio);
        return album;
        
    }
}
