
package ejercicio2repaso;


public class NodoTarea {
    private Tarea tar;
    private NodoTarea next;

    public NodoTarea(Tarea tar, NodoTarea next) {
        this.tar = tar;
        this.next = next;
    }

    public Tarea getTar() {
        return tar;
    }

    public void setTar(Tarea tar) {
        this.tar = tar;
    }

    public NodoTarea getNext() {
        return next;
    }

    public void setNext(NodoTarea next) {
        this.next = next;
    }
    
    
    
}
