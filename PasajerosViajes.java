
/**
 * Write a description of class PasajerosViajes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;


public class PasajerosViajes
{
    public static void main( String[] args )
    {
      //Variables
      int pasajeros;
      int capacidadBus;
      int dineroConductor;
      int dineroEmpresa;
      int viajes;
      //Objetos
      Scanner teclado = new Scanner( System.in );
      
      //Mensaje usuario
      System.out.println( "Introduce el numero de pasajeros que van a viajar" );
      pasajeros = teclado.nextInt();
      System.out.println( "Ahora la capacidad del bus" );
      capacidadBus = teclado.nextInt();
      
      //Calculo
      viajes = pasajeros / capacidadBus;
      dineroConductor = pasajeros * 10000;
      dineroEmpresa = viajes * 2000;
      
      //Retorno de valores
      System.out.println( "Los viajes que el bus necesita hacer son: " + viajes );
      System.out.println( "El dinero ganado por el conductor: " + dineroConductor );
      System.out.println( "Dinero que le queda a la empresa: " + dineroEmpresa );
    } //End of main
} //End of class
