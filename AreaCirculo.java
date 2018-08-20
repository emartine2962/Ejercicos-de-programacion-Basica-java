
/**
 * Write a description of class AreaCirculo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner; // Toca importar Scanner del teclado


//---------------------------------área de un circulo---------------------------
public class AreaCirculo
{
  public static void main( String[] args )
  {
      
      final double PI = 3.14159;
      // El Scanner va acá, para leer el "teclado System.in"
      Scanner entrada = new Scanner( System.in ); 
      
      
      // Las variables van acá
      double radio;
      double area;
      
      // Mesaje al usuario 
      System.out.println( "Este programa calcula el área de un circulo" );
      System.out.println( "-------------------------------------------" );
      System.out.print( "Introduce el valor del radio " );
      
      // Método para lanzarle al usuario la pantalla o posibiidad de escribir el numero
      radio = entrada.nextDouble();
      
      
      // Forula y calculo del área
      area = radio * radio * PI;
      
      
      // Retornar o imprimir el valor calculado para el área
      
      System.out.println( "El área del circulo es: " + area );
      
  }     // End of main
}   // End of class
