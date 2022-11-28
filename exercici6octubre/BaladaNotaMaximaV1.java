import java.util.*;


public class BaladaNotaMaximaV1 {
    
  public static void main(String[] args) {

    //crear variable d'escanner
    Scanner intro = new Scanner(System.in);

    //demanar quantitat d'alumnes
    System.out.println("Quantitat d'alumnes:");
    int nalumnes = intro.nextInt();
    int nmax = 0;

    //demanar notes de cada alumne amb un bucle
    for (int n = 0; n < nalumnes; n++) {
      
      System.out.println("\nIntrodueix nota Alumne "+n+":");
      
      int nota = intro.nextInt();
      
      if (nota > nmax) {
        nmax=nota;
      } 
    }


    //imprimir la nota mes alta
    System.out.println("\nLa nota màxima és: " + nmax);


  }
}
