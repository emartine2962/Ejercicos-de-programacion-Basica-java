
/**
 * Write a description of class Calculadora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// Programa de calculadora de enteros
import java.util.Scanner; // Importa el Scanner para leer desde el teclado
public class Calculadora
{
   public static void main ( String[] args )
   {
       Scanner entrada = new  Scanner( System.in );     // Se crea el objeto que usa el Scanner, 
                                                        // "System.in" es el teclado
       int numeroUno, numeroDos; // Declaracion de variables
       
       // Mensaje de usuario
       System.out.println( "Calculadora en Java." );
       System.out.println( "--------------------" );
       
       System.out.println( "Escribe el primer numero: " );
       numeroUno = entrada.nextInt();
       System.out.println( "Escribe el segundo numero: " );
       numeroDos = entrada.nextInt();
       
       
       // Respuesta con calculo
       System.out.println( " El resultado de la suma es: " + ( numeroUno + numeroDos ) );
       
       
   } // End of main
} // End of class Calculadora
