
/**
 * Write a description of class TiposPrimitivos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// Programa muestra los ocho tipos primitivos
public class TiposPrimitivos
{
   public static void main ( String[] args )
   {
   // Tipos integrales
   byte edad = 38;                  //  8 Bits (-128 al 127)
   short distancia = 127;           // 16 Bits 
   int sumaTotal = 1250;            // 32 Bits <-----default
   long distanciaLuna = 235589L;    // 64 Bits
   
   // Punto flotante
   float salario = 3856.5f;         // 32 Bits 
   double granTotal = 185200000.5;  // 64 Bits <-----default
   
   // Tipo caracter
   char letra = 'A';                // 16 Bits-----> UNICODE
   
   // Tipo Boolean
   boolean tengoPerro = true;       // true or false
   
   
   // ¡¡¡¡¡¡CUIDADO CON EL OVERFLOW Y EL UNVERFLOW!!!!!!
   int valor = 2147483647 + 1;
   System.out.println( valor ); // Overflow
   //-------------------------------------------------
   int otroValor = -2147483648 - 1;
   System.out.println( otroValor ); // Underflow
   
   } // End of main
} // End of the class
