
/**
 * Write a description of class AreaCompleja here.
 *
 * @author (Edgar Andres Martinez Brand)
 * @version (20/08)
 */

// Programa que saca el area de un circulo menos el area de un cuadrado

import java.util.Scanner; //Scanner

public class AreaCompleja
{
   public static void main( String[] args )
   {
       //Constantes
       double PI = 3.14159;
       
       
       //Variables
       double radio;
       double area;
       
       //Objetos
       Scanner teclado = new Scanner( System.in );
       
       //Mensaje para el usuario
       System.out.println( "Ingresa el valor del radio" );
       
       //Uso del Scanner
       radio = teclado.nextDouble();
       
       //Calculo
       area = (radio * radio) * ( PI -2 );
       
       //Retornar el resultado
       System.out.println( "El resultado es: " + area + "^2" );
       
       
   } //End of mine
} //End of class
