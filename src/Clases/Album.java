/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

public class Album {
    private String nombreAlbum; 
    private int anioLanzamiento ;
    private String Disquera;
    private List<Cancion> listaCanciones;

    public Album(String nombreAlbum, int anioLanzamiento, String Disquera, List<Cancion> listaCanciones) {
        this.nombreAlbum = nombreAlbum;
        this.anioLanzamiento = anioLanzamiento;
        this.Disquera = Disquera;
        this.listaCanciones = listaCanciones;
    }

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

    public List<Cancion> obtenerListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
    
    public void agregarCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }
    
    public boolean esDuplicado(Cancion cancion){
       boolean flag = true;
        for (int i=0;i<listaCanciones.size();i++){
              if(cancion.getTitulo().equals("")){
                  flag = true;
              }else{
                  flag = false;
              }
        } 
        return flag;
    }
    
    
}
