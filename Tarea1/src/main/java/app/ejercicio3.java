package app;

import javax.swing.JOptionPane;

public class ejercicio3 {

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));
        
        x1 = (a + (b / c)) / ((a / b) + c);
        x2 = (a / (a + b)) / (a / (a - b));
        
        JOptionPane.showMessageDialog(null, "El resultado de la primera operacion es: " + x1
                + " \n El resultado de la seguda operacion es: " + x2);
    }
}
