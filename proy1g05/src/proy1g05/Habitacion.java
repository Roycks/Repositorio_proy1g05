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
public class Habitacion {
    private NodoH next;
    private NodoH head;
    private NodoH aux;
    private Huesped persona;
    
    
    public Habitacion(){
        head=new NodoH(null,null);
    }
    
}
