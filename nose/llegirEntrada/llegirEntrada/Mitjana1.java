
//Executa el codi el número de vegades que tu vulguis

/** execució per terminal:
 *  java Mitjana1 < dades<ESCOLLIU>.txt */
import java.util.Scanner;
public class Mitjana1 {
  public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    int n = lector.nextInt();
    int i = 0;
    int suma = 0;
    while(i < n){
      int dada = lector.nextInt();
      suma += dada;
      i ++;
    }
    double mitjana = (double)suma/n;
    System.out.println(mitjana);
  }
  
}
