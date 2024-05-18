package Clases;

import GUI.AgregarAlbum;
import GUI.AgregarCancion;
import GUI.BuscarAlbum;
import GUI.DetalleAlbum;
import javax.swing.JFrame;

public class OpcionesMenu {
    
    public static void agregarCancion(JFrame currentFrame) {
        AgregarCancion agregarCancion = new AgregarCancion();
        agregarCancion.setVisible(true);
        currentFrame.setVisible(false);
    }

    public static void buscarAlbum(JFrame currentFrame) {
        BuscarAlbum buscarAlbum = new BuscarAlbum();
        buscarAlbum.setVisible(true);
        currentFrame.setVisible(false);
    }
 public static void agregarAlbum(JFrame currentFrame) {
        AgregarAlbum agregarAlbum = new AgregarAlbum();
        agregarAlbum.setVisible(true);
        currentFrame.setVisible(false);
    }

    public static void detalleAlbum(JFrame currentFrame) {
        DetalleAlbum detalleAlbum = new DetalleAlbum();
        detalleAlbum.setVisible(true);
        currentFrame.setVisible(false);
    }
    
     public static void salir(JFrame currentFrame) {
        currentFrame.setVisible(false);
    }
}