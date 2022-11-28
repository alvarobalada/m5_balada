import java.util.*;

public class baladaTipus1 {

  public static void main(String[] args) {

    //Crear variable per a escàner
    Scanner intro = new Scanner(System.in);


    //Demanar el valor per l'escàner
    System.out.println("Introdueix qualsevol número enter:");
    long n = intro.nextLong();


    //ifElse, depenent del número s'imprimirà el tipus de dada més adequada
    if (n >= -128 && n <= 127) {

      System.out.println("\nEs guardaria en un byte");

    }

    if (n >= -32768 && n <= 32768) {
      
      System.out.println("\nEs guardara en un short");
    
    } 
    if (n >= -2147483648L && n <= 2147483648L) {
      
      System.out.println("\nEs guardara en un Int");
    
    } 


    System.out.println("\nEs guardara en un Long");


 
    
  }

}
