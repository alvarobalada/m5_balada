import java.util.*;


public class BaladaNumeroSecret2 {
  public static void main(String[] args) {

    Scanner intro = new Scanner(System.in);

  //generar numero aleatori
    int secretNum = (int)(Math.random()*100+1);
  
  //bucle per a demanar el número a l'usuari
    System.out.println("Introdueix un número:");
    int num = intro.nextInt();
    int intents = 10;

    while (num != secretNum && intents<=10 && intents>0) {
      
      System.out.println("\nEt queden "+intents+" intents");

      if (num > secretNum){
        System.out.println("El número secret és més menut");
      }
      else{
        System.out.println("El número secret és més gran ");
      }

      System.out.println("Torna a introduir un número:");
      
      num = intro.nextInt();
      
      
      intents--;
    } 

    if (intents==0) {
      System.out.println("S'han acabat els intents.");
    }else{

      System.out.println("Número correcte!");
    }
  }
}
