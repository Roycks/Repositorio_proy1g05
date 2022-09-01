
package proy1g05;
public class Habitacion {
    private NodoHu next;
    private NodoHu head;
    private NodoHu tail;
    private NodoHu aux;
    
    public Habitacion(){
        head=new NodoHu(null,null);
        tail=head;
    }
    public boolean agregarHuesped(Huesped huesped){//Falta verificar si está repetido
          tail.setNext(new NodoHu(huesped,null));
          tail=tail.getNext();
          return true;
    }
}
