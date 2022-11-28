import java.util.*;

public class BaladaOrdenats6 {
    
    public static void main(String[] args){

        Scanner intro = new Scanner(System.in);

        int linea = 0;
        int lastOrdenat = 0;

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

            linea++;

            if(ordenado){

                lastOrdenat = linea;

            }


        }
        if(lastOrdenat == 0)
            System.out.println("No hi ha cap linia ordenada creixentment.");
        else
            System.out.println("L'ultima linia ordenada creixentment es la " + lastOrdenat);



    }
}