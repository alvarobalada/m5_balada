//Executa el codi fins que el valor introduit sigue -1

/** execució per terminal:
 *  java Mitjana3 < dades<ESCOLLIU>.txt */
import java.util.Scanner;
public class Mitjana3 {
  public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    int i = 0;
    int suma = 0;
    int dada = 0;
    dada = lector.nextInt();
    while(dada!=-1){
      suma += dada;
      dada = lector.nextInt();
      i ++;
    }
    double mitjana = (double)suma/i;
    System.out.println(mitjana);
  }
  
}
