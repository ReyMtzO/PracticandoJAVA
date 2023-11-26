/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
- Si trabaja 40 horas o menos, se le paga $16 por hora.
- Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
*/
package conditionals.exercises;

import javax.swing.*;

public class Exercise_5 {
    public static void main(String[] args) {
        int hoursWorked;
        float totalSalary;

        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas trabajadas durante la semana: "));

        if(hoursWorked <= 40){
            totalSalary = hoursWorked*16;
        }else{
            totalSalary = (40 * 16) + ((hoursWorked - 40) * 20);
        }
        JOptionPane.showMessageDialog(null, "El pago semanal del trabajador es: "+totalSalary);
    }
}