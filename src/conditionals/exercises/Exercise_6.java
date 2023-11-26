//Hacer un programa que tome dos números y diga si ambos son pares o impares
package conditionals.exercises;

import javax.swing.*;

public class Exercise_6 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));

        if (num1 % 2 == 0 && (num2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Ambos números ingresados son pares");
        } else if (num1% 2 != 0 && num2% 2 != 0) {
            JOptionPane.showMessageDialog(null, "Ambos números ingresados son impares");
        } else {
            JOptionPane.showMessageDialog(null, "Los números ingresados no son pares o al menos no a la vez");
        }
    }
}