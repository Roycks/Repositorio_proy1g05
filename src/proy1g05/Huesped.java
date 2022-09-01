/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1g05;

/**
 *
 * @author roycks
 */
public class Huesped {
    private String rut;
    private String nombre;
    private int edad;
    private int nro;//numero de habitacion 
    
    public Huesped(String rut, String nombre, int edad, int nro) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.nro = nro;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    
}
