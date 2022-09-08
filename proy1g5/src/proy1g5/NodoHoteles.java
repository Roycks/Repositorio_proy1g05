
package proy1g5;

public class NodoHoteles {
    private Hotel hotel;
    private NodoHoteles Next;

    public NodoHoteles(Hotel hotel, NodoHoteles Next) {
        this.hotel = hotel;
        this.Next = Next;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public NodoHoteles getNext() {
        return Next;
    }

    public void setNext(NodoHoteles Next) {
        this.Next = Next;
    }
    
}
