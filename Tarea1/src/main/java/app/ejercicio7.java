package app;

import javax.swing.JOptionPane;

public class ejercicio7 {

    public static void main(String[] args) {
        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
    }
}
