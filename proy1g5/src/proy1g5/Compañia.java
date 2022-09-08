
package proy1g5;

public class Compañia {
    private NodoHoteles head;
    private NodoHoteles tail;
    
    public Compañia(){
        head=new NodoHoteles(null,null);
        tail=head;
    }
    public boolean agregarHotel(Hotel hotel){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(hotel.getCod())){
                return false;
            }
            aux=aux.getNext();
        }
        tail.setNext(new NodoHoteles(hotel,null));//head
        tail=tail.getNext();
        return true;
    }
    public Hotel buscarHotel(Hotel hotel){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(hotel.getCod())){
                return aux.getNext().getHotel();
            }
            aux=aux.getNext();
        }
        return null;
    }
    public Hotel eliminarHotel(Hotel hotel){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(hotel.getCod())){
                Hotel h=aux.getNext().getHotel();
                aux.setNext(aux.getNext().getNext());
                return h;
            }
            aux=aux.getNext();
        }
        return null;
    }
    public boolean agregarHuesped(Hotel h,Huesped hp){// codigo del hotel, rut 
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(h.buscarHuesped(hp)){
                return false;
            }
        }
        while(aux.getNext()!=null)
            if(aux.getNext().getHotel()==h){
                h.agregarHuesped(hp);
                return true;
            }
        return false;
    }
}
