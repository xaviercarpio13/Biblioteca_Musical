
package Clases;

import java.util.Date;

public class Usuario {
    String nombre; 
    String apellido; 
    Date fechaNacimiento;
    Biblioteca biblioteca;
    
    public Biblioteca verBiblioteca(){
        return this.biblioteca;
    }
}
