package app;

import javax.swing.JOptionPane;


public class ejercicio4 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;
        int modulo = 0;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero:"));
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 % numero2;
        
        JOptionPane.showMessageDialog(null, "Suma: "+numero1+" + "+numero2+" = "+suma+
                "\nResta: "+numero1+" - "+numero2+" = "+resta+
                "\nMultiplicacion: "+numero1+" × "+numero2+" = "+multiplicacion+
                "\nDivision: "+numero1+" ÷ "+numero2+" = "+division+
                "\nModulo: "+numero1+" % "+numero2+" = "+modulo);
        
    }
}
