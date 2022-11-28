import java.util.*;


public class BaladaNotaMaximaV2 {
    
  public static void main(String[] args) {

    //crear variable d'escanner
    Scanner intro = new Scanner(System.in);

    //demanar quantitat d'alumnes
    System.out.println("Quantitat d'alumnes:");
    int nalumnes = intro.nextInt();
    int nmax = 0;

    String nomNotaMax = "";
  

    //demanar notes de cada alumne amb un bucle
    for (int n = 0; n < nalumnes; n++) {
      
      
      //demanar el nom de l'alumne
      System.out.println("\n\n\n"+n+".Introdueix el nom: ");
      String name = intro.next();
      
      //demanar la nota de l'alumne
      System.out.println("Introdueix la nota de "+name+": ");
      int nota = intro.nextInt();    
  
      if (nota > nmax) {
        nmax=nota;
        nomNotaMax=name;
      } 
    }


    //imprimir la nota mes alta
    System.out.println("\nLa nota màxima és de: " + nomNotaMax + ", ha tret un " + nmax);


  }
}
