
package proy1g5;
import java.io.*;
public class Proy1g5 {

    public static void main(String[] args)throws IOException {
       BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
        boolean continuar=true;
        Compañia c=new Compañia();
        Hotel h=new Hotel("r212l","cancun");
        
        System.out.println(c.agregarHotel(h));
        System.out.println(c.buscarHotel(h).getNombre());
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
