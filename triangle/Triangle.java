import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner intro = new Scanner(System.in);

    int dimensions = intro.nextInt();

    int d = 1;

    String triangle = "";

    while (d <= dimensions){

      triangle = triangle + "*";

      System.out.println(triangle);

      d++;

    }

    
  }
}
