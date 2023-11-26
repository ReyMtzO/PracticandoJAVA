//Ejemplo con if else statement
package conditionals.info;

import javax.swing.*;

public class if_statement {
    public static void main(String[] args) {
        int num, dato = 15;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (num <= dato) {
            JOptionPane.showMessageDialog(null, "El número es 15 o menor");
        } else {
            JOptionPane.showMessageDialog(null, "El número es mayor a 15");
        }
    }
}
