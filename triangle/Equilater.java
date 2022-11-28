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




    
  }
}
