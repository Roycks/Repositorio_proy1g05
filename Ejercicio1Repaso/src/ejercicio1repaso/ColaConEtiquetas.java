
package ejercicio1repaso;

public class ColaConEtiquetas {
    private Nodo head;
    private Nodo tail;
    
    public ColaConEtiquetas(){
        head=new Nodo(null,null,null);
        tail=head;
    }
    
    public boolean agregar(String etq, Object obj){
        Nodo aux=head;
        
        while(aux.getNext()!=null){
            if (aux.getNext().getEtq().equals(etq)) {
                return false;
            }  
            aux=aux.getNext();
        }
        
        tail.setNext(new Nodo(obj,etq,null));
        tail=tail.getNext();
        return true;
    }
    
    public Object extraer(){
        if (head.getNext()==null) {
            return null;
        }
        
        Object extraido=head.getNext().getObj();
        head.setNext(head.getNext().getNext());
        return extraido;
        
    }
    
    public Object eliminar (String etq){
        Nodo aux=head;
        Object eliminar = null;
        while(aux.getNext()!=null){
            if (aux.getNext().getEtq().equals(etq)) {
                if (aux.getNext().getNext()==null) { //Si el que vamos a eliminar es el tail, no podemos llegar y borrarlo porque no podríamos agregar
                    eliminar=tail.getObj();
                    tail=aux;
                    tail.setNext(null);
                    return eliminar;
                }
                
                eliminar=aux.getNext().getObj();
                aux.setNext(aux.getNext().getNext());
                return eliminar;
            }
            
            aux=aux.getNext();
        }
                
       return eliminar; 
    }
    
    public void limpiar(){
        head.setNext(null);
        tail=head;
    }
    
    public boolean intercambio(String etq1, String etq2){
        Nodo aux=head;
        Nodo nodo1 = null;
        Nodo nodo2 = null;
        
        while(aux.getNext()!=null){
            if (aux.getNext().getEtq().equals(etq1)) {
                nodo1=aux.getNext();
            }
             if (aux.getNext().getEtq().equals(etq2)) {
                nodo2=aux.getNext();
            }
            aux=aux.getNext();
        }
        
        if (nodo1==null || nodo2==null) { // si no se encontró uno de los dos nodos
            return false;
        }
        
        Object intercambiador= nodo1.getObj(); //guardo el objeto 1
        nodo1.setObj(nodo2.getObj()); //le asigno el objeto 2 al nodo 1
        nodo2.setObj(intercambiador);//le asigno el objeto 1 al nodo 2
        return true;
        
    }
    
          
}
