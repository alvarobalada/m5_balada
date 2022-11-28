import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner intro = new Scanner(System.in);

    int dimensions = intro.nextInt();

    int d = 1;

    System.out.println("\n\n");
    while (d <= dimensions){

      System.out.println("\n\n");
      System.out.println("\t".repeat(dimensions - d)+"\t*\t".repeat(d));

      d++;

    }

    d = dimensions;
    
    while (d > 0){

      d--;
      System.out.println("\n\n");
      System.out.println("\t".repeat(dimensions - d)+"\t*\t".repeat(d));

      

    }




    
  }
}
