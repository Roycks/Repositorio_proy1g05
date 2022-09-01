
package proy1g5;

public class NodoHu {
    private NodoHu next;
    private Huesped huesped;
    
    public NodoHu(Huesped huesped, NodoHu next) {
        this.next = next;
        this.huesped = huesped;
    }

    public NodoHu getNext() {
        return next;
    }

    public void setNext(NodoHu next) {
        this.next = next;
    }

    public Huesped getHuesped() {
        return huesped;
    }

}
