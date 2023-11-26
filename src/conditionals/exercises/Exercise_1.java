/*
Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
 */
package conditionals.exercises;

import javax.swing.*;

public class Exercise_1 {
    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (number%10 == 0) {
            JOptionPane.showMessageDialog(null, "El número "+number+ " es múltiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El número "+number+ " No es múltiplo de 10");
        }
    }
}
