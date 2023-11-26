/*
Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales
trabajadas y de su salario por hora
*/
package operators.exercises;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){

    Scanner enter = new Scanner(System.in);

    float salaryPerHour, totalHoursPerWeek, salaryPerWeek;

        System.out.print("\nDigite el salario por hora del trabajador: ");
        salaryPerHour = enter.nextFloat();

        System.out.println("Digite el número de horas trabajadas por semana: ");
        totalHoursPerWeek = enter.nextFloat();

        salaryPerWeek = salaryPerHour * totalHoursPerWeek;

        System.out.println("\nEl salario semanal del trabajador es: " + salaryPerWeek);
    }
}
