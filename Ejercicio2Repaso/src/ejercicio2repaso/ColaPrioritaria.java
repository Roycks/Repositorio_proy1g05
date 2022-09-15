
package ejercicio2repaso;


public class ColaPrioritaria {
    private NodoPrioridad head;

    public ColaPrioritaria() {
        head=new NodoPrioridad(-1,null);
    }
    
    public boolean agregar(String desc, int indice){ //error del enunciado, debería ser método void porque no hay caso false.
        NodoPrioridad aux=head;
        
        while(aux.getNext()!=null && aux.getNext().getInd()>=indice){
            if (aux.getNext().getInd()==indice) {
                aux.getNext().enqueue(desc, indice);
                return true;
            }
            aux=aux.getNext();
        }
        
        if (aux.getNext()==null) {
            aux.setNext(new NodoPrioridad(indice,null));
            aux.getNext().enqueue(desc, indice);
            return true;
        }
        
        aux.setNext(new NodoPrioridad(indice,aux.getNext()));
        aux.getNext().enqueue(desc, indice);
        return true;
    }
    
    public Tarea extraer(){
        NodoPrioridad aux=head;
        Tarea extraida=null;
        while(aux.getNext()!=null){
            extraida=aux.getNext().dequeue(); //buscamos por cada prioridad si hay tareas
            if (extraida!=null) {
                return extraida;
            }
            aux=aux.getNext();
        }
        return null;
    }
    
    public int numeroTareas(){
        NodoPrioridad aux=head;
        int cantidad=0;
        while(aux.getNext()!=null){
           cantidad=cantidad+aux.getNext().numeroTareas();
           aux=aux.getNext();
        }
        return cantidad;
    }
    
    public int numeroTareas(int ind){
        NodoPrioridad aux=head;
        
        while(aux.getNext()!=null){
            if (aux.getNext().getInd()==ind) {
                return aux.getNext().numeroTareas();
            }
            aux=aux.getNext();
        }
        return 0;
    }
    
}
