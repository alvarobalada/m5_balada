import java.util.Scanner;

public class truefalse {

    public static void main(String[] args){


        Scanner intro = new Scanner(System.in);

        int lastTrue = 0;
        int l = 1;
        while(intro.hasNextBoolean()){

            if(intro.nextBoolean()){

                lastTrue = l;

            } 
            l++;

        }

        if(lastTrue == 0)
            System.out.println("No hi han trues");
        else
            System.out.println("L'ultim true esta en la línea " + lastTrue);


    }
    
}
