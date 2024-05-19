package Clases;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Album> albumnes;

    public Biblioteca(List<Album> albumnes) {
        this.albumnes = new ArrayList<>();
    }

    public Biblioteca() {
         this.albumnes = new ArrayList<>();
    }
    

    public List<Album> obtenerTodosAlbums() {
        return albumnes;
    }

    public void setAlbumnes(List<Album> albumnes) {
        this.albumnes = new ArrayList<>(albumnes);
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

    @Override
    public String toString() {
        return "lista albumnes=" + albumnes ;
    }
    
    
}

