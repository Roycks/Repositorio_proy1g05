
package proy1g5;
import java.io.*;
public class Proy1g5 {

    public static void main(String[] args)throws IOException {
       BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
        boolean continuar=true;
        Compañia c=new Compañia();
        Hotel h=new Hotel("A1","cancun");
        System.out.println("ingrese nombre");
        String n =lector.readLine();
        System.out.println(c.agregarHotel(h));
        Hotel q=new Hotel("A2","miami");
        System.out.println(c.agregarHotel(q));
        System.out.println(c.agregarHuesped("A2","750",n,80 ));
        System.out.println(c.agregarHuesped("A1","2105",n,10 ));
        System.out.println(c.agregarHuesped("A1","21q2",n, 20));
        System.out.println(c.buscarHotel(h).getNombre());
        System.out.println(c.edadPromedioHotel("A1"));
        System.out.println(c.edadPromedioTotal());
        System.out.println(c.eliminarHuesped("A1", "2105").getNombre());
        System.out.println(c.eliminarHotel(h).getNombre());
        
        while(continuar){
            System.out.println("1.- ");
            System.out.println("2.- ");
            System.out.println("3.- ");
            System.out.println("4.- ");
            System.out.println("5.- Salir");

            int opcion=Integer.parseInt(lector.readLine());

            switch (opcion){

                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    continuar=false;
                    break;

            }

        }
        
    
       
    }
    
}
