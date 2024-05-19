package Clases;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nombreAlbum; 
    private int anioLanzamiento ;
    private String Disquera;
     private List<Artista> listaArtistas;
    private List<Cancion> listaCanciones;

    public Album() {
        this.listaCanciones = new ArrayList<>();
        this.listaArtistas = new ArrayList<>();
    }

    public Album(String nombreAlbum, int anioLanzamiento, String Disquera,List<Artista> listaArtistas) {
        this.nombreAlbum = nombreAlbum;
        this.anioLanzamiento = anioLanzamiento;
        this.Disquera = Disquera;
        this.listaArtistas = listaArtistas;
        this.listaCanciones = new ArrayList<>();
    }
    
    public Album(String nombreAlbum, int anioLanzamiento, String Disquera,List<Artista> listaArtistas ,List<Cancion> listaCanciones) {
        this.nombreAlbum = nombreAlbum;
        this.anioLanzamiento = anioLanzamiento;
        this.Disquera = Disquera;
        this.listaArtistas = listaArtistas;
        this.listaCanciones = listaCanciones != null ? listaCanciones : new ArrayList<>();
    }

    //getter and setters
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getDisquera() {
        return Disquera;
    }

    public void setDisquera(String Disquera) {
        this.Disquera = Disquera;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = new ArrayList<>();

    }

    public void setListaArtistas(List<Artista> listaArtistas) {
        this.listaArtistas = new ArrayList<>();
    }
    
    
    
    
    
    //metodos de clase
    public void agregarCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }
       
    public List<Cancion> obtenerListaCanciones() {
        return listaCanciones;
    }
    

    public boolean esDuplicado(Cancion cancion){
        for (Cancion c : listaCanciones) {
            if (c.getTitulo().equals(cancion.getTitulo())) {
                return true;
            }
        }
        return false;

    }
    
    public List<Artista> obtenerListaArtistas() {
        return listaArtistas;
    }
    
    public String listaPrincipal(){
        return nombreAlbum;
    }

    @Override
    public String toString() {
        return "Nombre del Album: " + nombreAlbum + "Año de Lanzamiento:" + anioLanzamiento + "Disquera:" + Disquera + "Artistas:" + listaArtistas + "Canciones:" + listaCanciones;
    }
    
    
    
    
    
    
    
    
    
}
