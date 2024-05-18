package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Biblioteca {
    private List<Album> albumnes;

    public Biblioteca() {
         albumnes = new ArrayList<>();
    }

    public List<Album> obtenerTodosAlbums() {
        return albumnes;
    }

    public void setAlbumnes(List<Album> albumnes) {
        this.albumnes = albumnes;
    }
    
    public Album obtenerAlbum(String nombre) {
    for (Album al : this.albumnes) {
        if (al.getNombreAlbum().equals(nombre)) {
            return al;
        }
    }
    return null;
}

    
    public void agregarAlbum(Album alb){
//        try {
//            Connection cn = Conexion.getConection();
//            String query = "INSERT INTO album (nombreAlbum, anioLanzamientoAlbum, disqueraAlbum) VALUES (?,?,?)";
//
//            PreparedStatement insertar = cn.prepareStatement(query);
//
//            insertar.setString(1, alb.getNombreAlbum());
//            insertar.setInt(2, alb.getAnioLanzamiento());
//            insertar.setString(3, alb.getDisquera());
//
//            insertar.executeUpdate();
//            insertar.close();
//
//            JOptionPane.showInternalMessageDialog(null, "Registro guardado");
//
//        } catch (SQLException e) {
//            System.out.println("Error  al agregar al Album" + e.getMessage());
//        }
        this.albumnes.add(alb);
    }
    
    public List<Album> buscarAlbumsPorAnio(int anio) {
        List<Album> list = new ArrayList<>();
        for (Album al : this.albumnes) {
            if (al.getAnioLanzamiento() == anio) {
                list.add(al);
            }
        }
        return list;
    }
}

