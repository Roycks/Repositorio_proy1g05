
package ejercicio2repaso;


public class ColaTareas {
    private NodoTarea head;
    private NodoTarea tail;

    public ColaTareas(){
       head=new NodoTarea(null,null);
       tail=head;
    }
    
    public void enqueue(String d,int ind){
        tail.setNext(new NodoTarea(new Tarea(d,ind),null));
        tail=tail.getNext();
    }
    
    public Tarea dequeue(){
        if (head.getNext()==null) {
            return null;
        }
        
        Tarea eliminada= head.getNext().getTar();
        head.setNext(head.getNext().getNext());
        return eliminada;
    }
    
    public int numeroTareas(){
        NodoTarea aux=head;
        int contador=0;
        while(aux.getNext()!=null){
            contador++;
            aux=aux.getNext();
        }
        return contador;
    }
}
