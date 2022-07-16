package app;

import javax.swing.JOptionPane;

class ejercicio8 {

    public static void main(String[] args) {
        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));

        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }

    }
}
