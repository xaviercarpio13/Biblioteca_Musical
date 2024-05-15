/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
