
/**
 * Write a description of class PrecioAuto here.
 *
 * @author (Edgar Andres Martinez Brand)
 * @version (20/08)
 */

import java.util.Scanner;

public class PrecioAuto
{
    public static void main( String[] args )
    {
        //Variables
        int     camioneta;
        int     auto;
        char    tipo;
        int     impuestoAuto;
        int     totalAuto;
        int     impuestoCamioneta;
        int     totalCamioneta;
        
        //Obajetos
        Scanner teclado = new Scanner( System.in );
        
        // mensaje a usuario
        System.out.println( "Ingrese la letra segun la opcion");
        System.out.println( "Para automovil----> a");
        System.out.println( "Para camioneta----> c");
        
        //Teclado
        tipo = teclado.next(".").charAt(0);
        
        
        //Condicion
        switch ( tipo ) {
            case 'a':    //---------------------------AUTO-------------------------
                System.out.println( "Ingrese el precio del auto"); //Mensaje usuario
                auto = teclado.nextInt();
                
                if ( auto >= 20 ) {
                    if (auto > 40 ) {
                        //Calculo
                        impuestoAuto = 9;
                        totalAuto = impuestoAuto + auto;
                        System.out.println( "Impuesto: " + impuestoAuto); //Mensaje usuario
                        System.out.println( "Precio Neto: " + totalAuto);                       
                    } else {
                    //Calculo
                        impuestoAuto = ( auto / 5 );
                        totalAuto = impuestoAuto + auto;
                        System.out.println( "Impuesto: " + impuestoAuto); //Mensaje usuario
                        System.out.println( "Precio Neto: " + totalAuto); 
                        
                    }
                } else {
                    //Calculo
                    impuestoAuto = 5;
                    totalAuto = impuestoAuto + auto;
                    System.out.println( "Impuesto: " + impuestoAuto); //Mensaje usuario
                    System.out.println( "Precio Neto: " + totalAuto);
                } //End of if    
                break;
                
            case 'c':    //-----------------------CAMIONETA-------------------------------
                System.out.println( "Ingrese el precio de la camioneta");
                camioneta = teclado.nextInt();
                
                if ( camioneta < 80 ) {
                    //Calculo
                    impuestoCamioneta = 0;
                    System.out.println( "Impuesto: " + impuestoCamioneta); //Mensaje usuario
                    System.out.println( "Precio Neto: " + camioneta); 
                } else {
                    //Calculo
                    impuestoCamioneta = ( camioneta / 2 );
                    totalCamioneta = impuestoCamioneta + camioneta;
                    System.out.println( "Impuesto: " + impuestoCamioneta); //Mensaje usuario
                    System.out.println( "Precio Neto: " + totalCamioneta);                    
                } //End of if
                break;    
                
            default:
                System.out.println( "no elegiste una opcion valida");
                break;
        } //End of switch
    } //End of main
} //End of class
