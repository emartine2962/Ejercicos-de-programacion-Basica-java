
/**
 * Este programa convierte determinadas unidades de media a pulgada
 *
 * @author (Edgar Andres Martinez Brand)
 * @version (19/08)
 */

import java.util.Scanner; //Scanaer

//Inicio de programa
public class CalculadoraDeMedidas
{
   public static void main( String[] args )
   {
     // Constantes
     double pies = 12.0048019;
     double centimetros = 0.39370079;
     double legua = 190080.02;
     double yarda = 36;
     
     // Variables
     char uMedida;
     double medida;
    
     //Objeto Scanner
     Scanner teclado = new Scanner( System.in );
     
     
     //Mensaje para el usuario
     System.out.println( "Esteprograma convierte de:");

     //Condiciones
     do{
     System.out.println( "  -Pies =         p");
     System.out.println( "  -Centimetros =  c");
     System.out.println( "  -Leguas =       l");
     System.out.println( "  -Yardas =       y");
     System.out.println( "--------------A pulgadas--------------");
     System.out.println( "                                            ");
     System.out.println( "Introduce la letra segun corresponda, x para salir");
     
     //Uso del Scanner
     uMedida = teclado.next(".").charAt(0);
     
     if ( uMedida == 'p' ) {
        //-----------------------------------PIES-------------------------------
         
        //Mensaje para el usuario Pies
        System.out.println( "                 " );
        System.out.println( "Se ejecutó el programa de Pies---> Pulgadas" );
        System.out.println( "--Ingrese la cantidad a convertir--" );
        System.out.println( "(use el punto para indicar decimales)" );
        
        //Uso del Scanner Pies
        medida = teclado.nextDouble();
        
        //Cálculo
        medida = medida * pies;
        
        //Resultado
        System.out.println( "!!------Resultado:" + medida + " Pulgadas-------!!" );

        
     } 
     
     
     if ( uMedida == 'c' ) {
        //-----------------------------------CENTIMETROS-------------------------------
         
        //Mensaje para el usuario
        System.out.println( "                 " );
        System.out.println( "Se ejecutó el programa de Centimetros---> Pulgadas" );
        System.out.println( "--Ingrese la cantidad a convertir--" );
        System.out.println( "(use el punto para indicar decimales)" );
        
        //Uso del Scanner
        medida = teclado.nextDouble();
        
        //Cálculo
        medida = medida * centimetros;
        
        //Resultado
        System.out.println( "!!------Resultado:" + medida + " Pulgadas-------!!" );
        
        
     }
     
     if ( uMedida == 'l' ) {
        //-----------------------------------LEGUAS-------------------------------
         
        //Mensaje para el usuario
        System.out.println( "                 " );
        System.out.println( "Se ejecutó el programa de Leguas---> Pulgadas" );
        System.out.println( "--Ingrese la cantidad a convertir--" );
        System.out.println( "(use el punto para indicar decimales)" );
        
        //Uso del Scanner
        medida = teclado.nextDouble();
        
        //Cálculo
        medida = medida * legua;
        
        //Resultado
        System.out.println( "!!------Resultado:" + medida + " Pulgadas-------!!" );
        
        
     }
     
     if ( uMedida == 'y' ) {
        //-----------------------------------YARDAS-------------------------------
         
        //Mensaje para el usuario
        System.out.println( "                 " );
        System.out.println( "Se ejecutó el programa de Yardas---> Pulgadas" );
        System.out.println( "--Ingrese la cantidad a convertir--" );
        System.out.println( "(use el punto para indicar decimales)" );
        
        //Uso del Scanner
        medida = teclado.nextDouble();
        
        //Cálculo
        medida = medida * yarda;
        
        //Resultado
        System.out.println( "!!------Resultado:" + medida + " Pulgadas-------!!" );
        
        
        } 
    
    if( uMedida == 'x'){
       System.out.println( "Good Bye" ); 
    }else {
        System.out.println( "no se reconoce esa opcion" );
    } // End of if  
    }while( uMedida != 'x' ); //End of Do
   } // End of main
} // End of the class
