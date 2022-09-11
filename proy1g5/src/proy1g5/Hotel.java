
package proy1g5;

public class Hotel {
    private NodoHuespedes head;
    private NodoHuespedes tail;
    private String cod;
    private String nombre;
    
    
    public Hotel(String cod,String nombre){
    this.cod=cod;
    this.nombre=cod;
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
    public boolean buscarHuesped(Huesped huesped){
        NodoHuespedes aux=head;
        while(aux.getNext()!=null){
            if(aux.getNext().getHuesped().getRut().equals(huesped.getRut())){
                return false;
            }
            aux=aux.getNext();
        }
        return true;
    }
    public void agregarHuesped(Huesped huesped){
        tail.setNext(new NodoHuespedes(huesped,null));
        tail=tail.getNext();
    }
}
