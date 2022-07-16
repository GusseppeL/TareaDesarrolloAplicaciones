package app;

import javax.swing.JOptionPane;


public class ejercicio5 {

    public static void main(String[] args) {
        double x = 0.0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la variable de C:"));
        
        x = (-b +(Math.sqrt(Math.pow(b, 2) + (4*a*c))))/(2*a);
        
        JOptionPane.showMessageDialog(null, "El valor de la resolvente es: "+x);
    }
}
