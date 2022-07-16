package app;

import javax.swing.JOptionPane;

public class ejercicio6 {

    public static void main(String[] args) {
        double a=0.0;
        double b=0.0;
        double c=0.0;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el cateto A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el cateto B:"));

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.sqrt(a + b);

        JOptionPane.showMessageDialog(null, "EL valor de la hipotenusa es: " + c);
    }
}
