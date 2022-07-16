package app;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double Montodecompra;
        double Descuento = 0.020;
        double Totalp;

        System.out.print("Ingrese el monto de su compra : ");
        Montodecompra = in.nextDouble();
        in.nextLine();

        Descuento = Montodecompra * 0.020;
        Totalp= Montodecompra-Descuento;
        
        if (Montodecompra <= 999) {
            System.out.println("No existe Descuento");
            System.out.println("Su total a pagar es de: "+Montodecompra+"$");
        } else if (Montodecompra >= 1000) {
            System.out.println("Su descuento del 20% es de: "+Descuento +"$");
             System.out.println("El total a pagar es de: "+Totalp);
        }
    }
}
