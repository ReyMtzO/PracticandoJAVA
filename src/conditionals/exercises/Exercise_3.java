//Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula
package conditionals.exercises;

import javax.swing.*;

public class Exercise_3 {
    public static void main(String[] args) {
        char letter;

        letter = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        //La clase Character es un tipo de dato no primitivo, y cuenta con un método que verifica si una letra es mayúscula
        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "La letra "+letter+ " ingresada es mayúscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra "+letter+ " ingresada es minúscula");
        }
    }
}
