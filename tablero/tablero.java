

public class tablero {

    static int size;
    static char [] tablero;


    public static void generar(int s, char symbol) {

        size = s;

        tablero = new char[size*size];

        for (int i = 0; i < (size*size); i++)
            tablero[i] = symbol;                     
        
        System.out.printf("El tamaño serà de %d X %d\n", size, size);
        
    }



    public static void mostrar(){

        int p = 0;

        for (int r = 0; r < size ; r++){

            System.out.println("\n");

            for (int c = 0; c < size; c++) {

                System.out.print(tablero[p] + "\t\t");
                p++;
                
            }

            
            

        }        
        
    } 



    public static void tirar(int casilla, char symbol){

        tablero[casilla] = symbol;

    }


    
}
