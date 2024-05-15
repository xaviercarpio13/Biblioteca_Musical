package Clases;

import java.util.List;

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
    
    public void agregarAlbum(Album album){
        albumes.add(album);
    }
    
    public Album buscarAlbumsPorAnio(int anio){
        //buscar album por año 
        Album album = albumes.get(anio);
        return album;
        
    }
}
