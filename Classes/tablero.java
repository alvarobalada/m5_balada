import java.util.*;

public class tablero{
  
  char casillas[]; 
  
  public void crear(int x) {
    
    int ncasillas = x*x;
    casillas = new char[ncasillas];
    
    
    for (int c = 0; c < ncasillas; c++) {
      casillas[c] = '*'; 
    }
  }



  public void main(String[] args) {
  
    Scanner intro = new Scanner(System.in);
    
    System.out.println("Número de columnas i filas:");

    tablero.crear(intro.nextInt());

    

  }
}
