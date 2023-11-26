/*Condicionales múltiples o sentencia switch (sintaxis)

    switch (dato) {
    case 1: Instrucciones1;
            break;
    case 2: Instrucciones2;
            break;
    ...
    case n: InstruccionesN;
            break;
    default: CasoContrario;
            break;
    }
*/
package conditionals.info;

import javax.swing.*;

public class Switch_case {
    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1-5"));

        switch (dato) {
            case 1 -> JOptionPane.showMessageDialog(null, "Es el número 1");
            case 2 -> JOptionPane.showMessageDialog(null, "Es el número 2");
            case 3 -> JOptionPane.showMessageDialog(null, "Es el número 3");
            case 4 -> JOptionPane.showMessageDialog(null, "Es el número 4");
            case 5 -> JOptionPane.showMessageDialog(null, "Es el número 5");
            default -> JOptionPane.showMessageDialog(null, "El número no está en el rango de 1-5");
        }
    }
}



/*           Otra forma de escribir lo mismo utilizando el -break-:

switch (dato) {
            case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Es el número 5");
                break;
            default: JOptionPane.showMessageDialog(null, "El número no está en el rango de 1-5");
            */