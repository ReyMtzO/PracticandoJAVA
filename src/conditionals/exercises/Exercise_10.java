//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. (Sin años bisiestos)
package conditionals.exercises;

import javax.swing.*;

public class Exercise_10 {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Digite un día"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Digite un año"));

        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && (day >= 1 && day <= 31) && year >= 1) {
            JOptionPane.showMessageDialog(null, "El "+day+"/"+month+"/"+year+" es una fecha correcta");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 30) && year >= 1) {
            JOptionPane.showMessageDialog(null, "El "+day+"/"+month+"/"+year+" es una fecha correcta");
        } else if ((month == 2) && (day >= 1 && day <= 28) && year >= 1) {
            JOptionPane.showMessageDialog(null, "El " + day + "/" + month + "/" + year + " es una fecha correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Error, la fecha es incorrecta");
        }
    }
}
