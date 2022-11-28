import java.util.*;

public class ordenatsjava {

    public static void main(String[] args){


        Scanner intro = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        boolean ordenado = true;


        int n = intro.nextInt();        
        if(n <= 0){

            ordenado = false;

        }

        numero1 = intro.nextInt();


        for(int i = 1; i < n && ordenado; i++){

            numero2 = intro.nextInt();

            if(numero2 >= numero1){

                numero1 = numero2;

            }
            else{
                ordenado = false;
                intro.nextLine();
                
            }
        
        }
        System.out.println(ordenado);
        

    }
    
}
