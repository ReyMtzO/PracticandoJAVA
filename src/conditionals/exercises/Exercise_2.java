//Pedir dos números y decir cuál es el mayor o si son iguales
package conditionals.exercises;

import javax.swing.*;

public class Exercise_2 {
    public static void main(String[] args) {

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        if (num1 == num2){
            JOptionPane.showMessageDialog(null,"El primer número "+num1+" es igual al segundo número "+num2);
        } else if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El primer número "+num1+" es mayor al segundo número "+num2);
        } else {
            JOptionPane.showMessageDialog(null, "El segundo número "+num2+" es mayor al primer número "+num1);
        }
    }
}