import java.util.*;


public class Main {
  

  public static void main(String[] args) {


    //Demanem número de sequències
    Scanner intro = new Scanner(System.in);
    int nseq = intro.nextInt();
    
    //definim el maxim i el minim
   
    float max[] = new float[nseq];
    float min[] = new float[nseq];

    float total[] = new float[nseq];

    //Bucle per a demanar valors en cada sequència
    for (int i = 0; i < nseq; i++) {

      //quantitat de números que introduirem
      float ndatos = intro.nextFloat();
      
      //demanar la quantitat de números que ens hagin dit
      for (int n = 0; n < ndatos; n++) {
        
        float seq = intro.nextFloat();


        if ( seq < min[n] )
          min[n] = seq;
      
        if ( seq > max[n] )
          max[n] = seq;

        total[n]+=seq;
  
      }

       

    }


    System.out.printf("%.4f %.4f %.4f\n", min[1], max[1], (total[1]/ndatos));

  





  }

}
