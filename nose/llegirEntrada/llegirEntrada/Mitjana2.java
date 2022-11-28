//executa el codi fins que no queden valors a l'arxiu

/** execució per terminal:
 *  java Mitjana2 < dades<ESCOLLIU>.txt */
import java.util.Scanner;
public class Mitjana2 {
  public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    int i = 0;
    int suma = 0;
    while(lector.hasNextInt()){
      int dada = lector.nextInt();
      suma += dada;
      i ++;
    }
    double mitjana = (double)suma/i;
    System.out.println(mitjana);
  }
  
}
