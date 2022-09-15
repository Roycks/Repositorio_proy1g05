
package ejercicio2repaso;


public class NodoPrioridad {
    private ColaTareas cola;
    private int ind;
    private NodoPrioridad next;

    public NodoPrioridad(int ind, NodoPrioridad next) {
        this.ind = ind;
        cola=new ColaTareas();
        this.next=next;
    }
    
    
    public void enqueue(String d,int ind){
        cola.enqueue(d, ind);
    }
    
    public Tarea dequeue(){
        return cola.dequeue();
    }
    
    public int numeroTareas(){
        return cola.numeroTareas();
    }

    public int getInd() {
        return ind;
    }

    public NodoPrioridad getNext() {
        return next;
    }

    public void setNext(NodoPrioridad next) {
        this.next = next;
    }
    
    
    
}
