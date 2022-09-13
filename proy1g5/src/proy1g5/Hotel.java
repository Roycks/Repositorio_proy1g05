
package proy1g5;

public class Hotel {
    private NodoHuespedes head;
    private NodoHuespedes tail;
    private String cod;
    private String nombre;
    
    
    public Hotel(String cod,String nombre){
        head=new NodoHuespedes(null,null);
        tail=head;
        this.cod=cod;
        this.nombre=nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Huesped buscarHuesped(String rut){
        NodoHuespedes aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHuesped().getRut().equals(rut)){
                return aux.getNext().getHuesped();
            }
            aux=aux.getNext();
        }
        return null;
    }
    
    public void agregarHuesped(Huesped huesped){
        tail.setNext(new NodoHuespedes(huesped,null));
        tail=tail.getNext();
    }
    
    public Huesped eliminarHuesped(String rut){
        NodoHuespedes aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHuesped().getRut().equals(rut)){
                Huesped h=aux.getNext().getHuesped();
                aux.setNext(aux.getNext().getNext());
                if (aux.getNext()==null){
                    tail=aux;
                    return h;
                }
                return h;
            }
            aux=aux.getNext();
        }
        return null;
    }
    
    public double promedioEdad(){
        int cont=0;
        double suma=0;
        NodoHuespedes aux=head;
            while(aux.getNext()!=null){
                suma=aux.getNext().getHuesped().getEdad()+suma;
                cont++;
                aux=aux.getNext();  
            }
          
        return (suma/cont);
 
    }
    
    public double sumaEdad(){
        double suma=0;
        NodoHuespedes aux=head;
            while(aux.getNext()!=null){
                suma=aux.getNext().getHuesped().getEdad()+suma;
                aux=aux.getNext();  
            }
            return suma;
    } 
    
}
