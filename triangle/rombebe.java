import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner intro = new Scanner(System.in);

    int dimensions = intro.nextInt();

    int d = 1;
    int maxtb = dimensions; 

    String triangle = "";
    
    while (d <= dimensions){

      int t = 0;
      while (t < maxtb){
        System.out.print(" ");
        t++;
      }

      triangle = triangle + "* ";
      
      System.out.print(triangle);
      System.out.println();
      d++;
      maxtb--;

    }

    
    d = dimensions;
    maxtb=0; 

    while (d > 0){

      triangle = triangle.substring(0, triangle.length() - 1);
      int t = 0;
      while (t < maxtb){
        System.out.print(" ");
        t++;
      }

      
      System.out.print(triangle);
      System.out.println();
      maxtb++; 

      d--;

    }




    
  }
}
