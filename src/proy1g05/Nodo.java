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
public class Nodo {
    private Nodo next;
    private Hotel hotel;
    
    public Nodo(Hotel hotel, Nodo next){
        this.next = next;
        this.hotel=hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getNext() {
        return next;
    }
    
}
