
package proy1g5;

public class NodoHuespedes {
    private Huesped huesped;
    private NodoHuespedes Next;

    public NodoHuespedes(Huesped huesped, NodoHuespedes Next) {
        this.huesped = huesped;
        this.Next = Next;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public NodoHuespedes getNext() {
        return Next;
    }

    public void setNext(NodoHuespedes Next) {
        this.Next = Next;
    }
    
}
