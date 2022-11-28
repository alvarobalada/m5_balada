import java.util.*;

public class BaladaOrdenats4 {

    public static void main(String[] args){


        Scanner intro = new Scanner(System.in);

        int c = 0;

        while(intro.hasNext()){

            int numero1 = 0;
            int numero2 = 0;

        
            boolean ordenado = true;

            int n = intro.nextInt();        

            
            
            if (n != 0){ 
                numero1 = intro.nextInt();
            }
            



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

            c++;

            System.out.println(ordenado + " en la línea " + c );


        }
        

    }
    
}

