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
public class NodoH {
    private Nodo next;
    private Habitacion habitacion;
    
    public NodoH(Habitacion habitacion, Nodo next){
        this.next = next;
        this.habitacion=habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getNext() {
        return next;
    }
    
}