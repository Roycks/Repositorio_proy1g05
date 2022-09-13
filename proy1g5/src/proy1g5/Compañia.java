
package proy1g5;

public class Compañia {
    private NodoHoteles head;
    private NodoHoteles tail;
    
    public Compañia(){
        head=new NodoHoteles(null,null);
        tail=head;
    }
    
    public boolean agregarHotel(String cod, String nombre){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                return false;
            }
            aux=aux.getNext();
        }
        Hotel hotel=new Hotel(cod,nombre);
        tail.setNext(new NodoHoteles(hotel,null));
        tail=tail.getNext();
        return true;
    }
    
    public Hotel buscarHotel(String cod){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                Hotel h=aux.getNext().getHotel();
                return h;
            }
            aux=aux.getNext();
        }
        return null;
    }
    
    public Hotel eliminarHotel(String cod){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                Hotel h=aux.getNext().getHotel();
                aux.setNext(aux.getNext().getNext());
                return h;
            }
            aux=aux.getNext();
        }
        return null;
    }
    
    public Huesped eliminarHuesped(String cod,String rut){
         NodoHoteles aux=head;
        while (aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                Huesped h=aux.getNext().getHotel().eliminarHuesped(rut);
                return h;
            }
            aux=aux.getNext();
        }
        return null;
    }
    public Huesped buscarHuesped(String cod,String rut){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                if(aux.getNext().getHotel().buscarHuesped(rut)!=null){
                    if(aux.getNext().getHotel().buscarHuesped(rut).getRut().equals(rut)){
                        return aux.getNext().getHotel().buscarHuesped(rut);
                    }
                }else{
                    return null;
                }
            }
            aux=aux.getNext();
        }
        return null;
    }
    
    public boolean agregarHuesped(String cod,String rut,String nombre,int edad){
        NodoHoteles aux=head;
        Huesped hp=new Huesped(rut,nombre,edad);
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                if(aux.getNext().getHotel().buscarHuesped(hp.getRut())==hp){
                    return false;//caso de que esté repetido
                }
            }// retornar codigo de error
            aux=aux.getNext();
        }
        aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                aux.getNext().getHotel().agregarHuesped(hp);
                return true;
            }
            aux=aux.getNext();
        }
        return false;// caso de que no se encuentre el hotel 
    }
    
    public double edadPromedioHotel(String cod){
        NodoHoteles aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHotel().getCod().equals(cod)){
                return aux.getNext().getHotel().promedioEdad();
            }
            aux=aux.getNext();
        }
        return -1;    
    }
    
    public double edadPromedioTotal(){
        NodoHoteles aux=head;
        double suma=0;
        int cont=0;
        while(aux.getNext()!=null){
            suma=suma+aux.getNext().getHotel().sumaEdad();
            cont++;
            aux=aux.getNext();
        }
        if(cont!=0)
            return (suma/cont);
        else
            return -1;
    }
    
}
