//Pedir un número entre 0 - 99,999 y decir cuántas cifras tiene
package conditionals.exercises;

import javax.swing.*;

public class Exercise_8 {
    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 - 99,999"));

        if ((number >= 0) && (number < 10)) {
            JOptionPane.showMessageDialog(null, "El número ingresado contiene 1 cifra");
        } else if ((number >= 10) && (number < 100)) {
            JOptionPane.showMessageDialog(null, "El número ingresado contiene 2 cifras");
        } else if ((number >= 100) && (number < 1000)) {
            JOptionPane.showMessageDialog(null, "El número ingresado contiene 3 cifras");
        } else if ((number >= 1000) && (number < 10000)) {
            JOptionPane.showMessageDialog(null, "El número ingresado contiene 4 cifras");
        } else if ((number >= 10000) && (number < 100000)) {
            JOptionPane.showMessageDialog(null, "El número ingresado contiene 5 cifras");
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado está fuera de rango");
        }
    }
}
