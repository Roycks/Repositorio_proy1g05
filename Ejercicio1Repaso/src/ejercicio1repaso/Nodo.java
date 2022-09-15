
package ejercicio1repaso;

public class Nodo {
    private Object obj;
    private String etq;
    private Nodo next;

    public Nodo(Object obj, String etq, Nodo next) {
        this.obj = obj;
        this.next = next;
        this.etq=etq;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public String getEtq() {
        return etq;
    }

    public void setEtq(String etq) {
        this.etq = etq;
    }
    
    
}
