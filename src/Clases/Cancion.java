
package Clases;

import java.util.List;

public class Cancion {
    private String titulo;
    private int duracion;
    private List<Artista> listaArtistas;

    public Cancion(String titulo, int duracion, List<Artista> listaArtistas) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.listaArtistas = listaArtistas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setListaArtistas(List<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }
    
    public List<Artista> obtenerArtista(){
        
        return listaArtistas;
    }
}
