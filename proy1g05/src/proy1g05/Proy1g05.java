/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy1g05;

import java.io.*;
/**
 *
 * @author roycks
 */
public class Proy1g05 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
        boolean continuar=true;

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
