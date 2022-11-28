import java.util.*;


public class BaladaNumeroSecret {
  public static void main(String[] args) {

    Scanner intro = new Scanner(System.in);

  //generar numero aleatori
    int secretNum = (int)(Math.random()*100+1);
  
  //bucle per a demanar el número a l'usuari
    System.out.println("Introdueix un número:");
    int num = intro.nextInt();

    while (num != secretNum) {
      
     

      if (num > secretNum){
        System.out.println("\nEl número secret és més menut");
      }
      else{
        System.out.println("\nEl número secret és més gran ");
      }

      System.out.println("\nTorna a introduir un número:");
      num = intro.nextInt();
    } 
    System.out.println("Número correcte!");
  }
}
