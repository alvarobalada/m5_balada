import java.util.*;



public class Main {
    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        
        System.out.print("Símbolo jugador 1: ");
        char j1 = intro.next().charAt(0);

        System.out.println("Símbolo jugador 2: ");
        char j2 = intro.next().charAt(0);


        System.out.println("Enter: ");

        tablero.generar(3, '*');
        

        while (true) {

            tablero.mostrar();

            System.out.print("Elige posición j1: ");
            tablero.tirar(intro.nextInt(), j1);

            tablero.mostrar();

            System.out.print("Elige posición j2: ");
            tablero.tirar(intro.nextInt(), j2);

        }




    }
}
