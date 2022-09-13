
package proy1g5;
import java.io.*;
public class Proy1g5 {

    public static void main(String[] args)throws IOException {
       BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
        boolean continuar=true;
        Compañia c=new Compañia();
        while(continuar){
            System.out.println("MENÚ:Elija una opción");
            System.out.println("1.-Agregar hotel ");
            System.out.println("2.-Buscar hotel ");
            System.out.println("3.-Eliminar hotel ");
            System.out.println("4.-Agregar huesped a hotel");
            System.out.println("5.-Buscar huesped en un hotel");
            System.out.println("6.-Eliminar huesped de un hotel");
            System.out.println("7.-Promedio de las edades en un hotel");
            System.out.println("8.-Promedio de las edades en la compañia ");
            System.out.println("9.- Salir");
            int opcion=Integer.parseInt(lector.readLine());

            switch (opcion){
                case 1:
                    System.out.println("Ingrese un código para el hotel");
                    String cod=lector.readLine();
                    System.out.println("Ingrese el nombre del hotel");
                    String nom=lector.readLine();
                    
                    if(c.agregarHotel(cod, nom)==true)
                        System.out.println("Se agregó con exito");
                    else
                        System.out.println("No se pudo agregar, código ingresado ya existe");
                    
                    break;

                case 2:
                    System.out.println("Ingrese el código del hotel que desea buscar");
                    cod=lector.readLine();
                    if(c.buscarHotel(cod)!=null){
                        System.out.println(c.buscarHotel(cod).getCod()+"-"+c.buscarHotel(cod).getNombre());
                     }else{
                        System.out.println("No se encontró el hotel ingresado");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el código del hotel que desea buscar");
                    cod=lector.readLine();
                    Hotel e=c.eliminarHotel(cod);
                    if(e!=null){
                        System.out.println("El hotel eliminado fue: "+e.getCod()+"-"+e.getNombre());
                    }else{
                        System.out.println("No se encontró el hotel que desea eliminar");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese rut del huesped");
                    String rut=lector.readLine();
                    System.out.println("Ingrese el nombre del huesped");
                    nom=lector.readLine();
                    System.out.println("Ingrese edad del huesped");
                    int ed=Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el codigo del hotel al cual quiera registrar el huesped");
                    cod=lector.readLine();
                    if(c.agregarHuesped(cod, rut, nom, ed)==true){
                        System.out.println("Se agregó con éxito");
                    }else{
                        //codigo de error
                    }
                    break;

                case 5:
                    System.out.println("Ingrese rut del huesped que desea buscar");
                    rut=lector.readLine();
                    System.out.println("Ingrese el codigo del hotel en donde desea buscarlo");
                    cod=lector.readLine();
                    if(c.buscarHuesped(cod,rut)!=null){
                        System.out.println(c.buscarHuesped(cod,rut).getRut()+"-"+c.buscarHuesped(cod,rut).getNombre());
                     }else{
                        System.out.println("No se encontró el huesped en el hotel ingresado");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese rut del huesped que desea eliminar");
                    rut=lector.readLine();
                    System.out.println("Ingrese el codigo del hotel en donde desea buscarlo");
                    cod=lector.readLine();
                    Huesped hu=c.eliminarHuesped(cod, rut);
                    if(hu!=null){
                        System.out.println("El huesped eliminado es:"+hu.getRut()+"-"+hu.getNombre());
                    }else{
                        System.out.println("El huesped que desea eliminar no se encontró");
                    }
                    break;
                case 7:
                    System.out.println("Ingrese el codigo del hotel en donde desea saber el promedio de edades");
                    cod=lector.readLine();
                    double p=c.edadPromedioHotel(cod);
                    if(p!=-1){
                        System.out.println("El promedio de edades del hotel es: "+p);
                    }else
                        System.out.println("No hay huspedes en el hotel");
                    break;
                case 8:
                    System.out.println("El promedio de las edades en la compañia es: "+c.edadPromedioTotal());
                    break;
                case 9:
                    continuar=false;
                    break;
            }

        }
        
    
       
    }
    
}
