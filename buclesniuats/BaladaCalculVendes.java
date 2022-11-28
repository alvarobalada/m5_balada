import java.util.*;

public class BaladaCalculVendes{

    public static void main(String[] args){

        //crear scanner
        Scanner intro = new Scanner(System.in);

        //crear variables per a guardar la Sucursal que més ha generat i les vendes Totals
        float vendesTotals = 0;
        float maxSucursal = 0;
        String nomMaxSucursal = new String();
+
        //Demanar sucursals i noms amb bucles
        System.out.print("Número de sucursals: ");
        int sucursuals = intro.nextInt();

        int s = 0;
        while(sucursuals > s){

            System.out.print("\nIntrodueix el nom de la sucursal: ");
            String nomSucursal = intro.next();
            float vendesSucursal = 0;
            
            System.out.print("\n\tIntrodueix les Ventes de la sucursal "+nomSucursal+": ");
            while( true ){

                System.out.print("\n\t\t\t- Ventes: ");
                float vendes = intro.nextFloat();
                vendesSucursal = vendesSucursal + vendes;
                vendesTotals = vendesTotals + vendes;

                System.out.println("\n\nVentes sucursal " + nomSucursal + " = " + vendesSucursal);
                
                if(vendes==0){
                        if(vendesSucursal > maxSucursal){
                            maxSucursal = vendesSucursal;
                            nomMaxSucursal = nomSucursal; 
                        }
                    break;
                }

            }

            s++;
        }

        System.out.println("\n\nTotal vendes: " + vendesTotals);
        System.out.println("La sucursal " + nomMaxSucursal + "  ha aconseguit les màximes vendes: " + maxSucursal);

    }

}


