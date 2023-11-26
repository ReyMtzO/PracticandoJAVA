/*
Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Buena, Notable y Sobresaliente
 */
package conditionals.exercises;

import javax.swing.*;

public class Exercise_12 {
    public static void main(String[] args) {
        int note;

        note = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificación del alumno de 0 a 10: "));

        switch (note) {
            case 0, 1, 2, 3, 4, 5 -> JOptionPane.showMessageDialog(null, "Calificación Insuficiente");
            case 6, 7 -> JOptionPane.showMessageDialog(null, "Calificación Suficiente");
            case 8 -> JOptionPane.showMessageDialog(null, "Calificación Buena");
            case 9 -> JOptionPane.showMessageDialog(null, "Calificación Notable");
            case 10 -> JOptionPane.showMessageDialog(null, "Calificación Sobresaliente");
            default -> JOptionPane.showMessageDialog(null, "Calificación ingresada incorrecta");
        }
    }
}

/*
Otra forma de escribirlo:

switch (note) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: JOptionPane.showMessageDialog(null, "Calificación Insuficiente");
                    break;
            case 6:
            case 7: JOptionPane.showMessageDialog(null, "Calificación Suficiente");
                    break;
            case 8:  JOptionPane.showMessageDialog(null, "Calificación Buena");
                    break;
            case 9: JOptionPane.showMessageDialog(null, "Calificación Notable");
                    break;
            case 10: JOptionPane.showMessageDialog(null, "Calificación Sobresaliente");
                    break;
            default: JOptionPane.showMessageDialog(null, "Calificación ingresada incorrecta");
        }
 */
