//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días
package conditionals.exercises;

import javax.swing.*;

public class Exercise_9 {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Escriba el día: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Escriba el año: "));

        if ((day >= 1) && (day <= 30)) {
            if ((month >= 1) && (month <= 12)) {
                if (year >= 1) {
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año ingresado es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes ingresado es incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El día ingresado es incorrecto");
        }
    }
}