/*
Construir un programa que dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
*/
package operators.exercises;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int totalHours, weeks, days, hours;

        System.out.print("\nIngresa el número total de horas: ");
        totalHours = enter.nextInt();

        weeks = totalHours / 168;
        days = totalHours%168 / 24;
        hours = totalHours%24;

        System.out.println("\nEl número equivalente a la cantidad de horas ingresadas es: ");
        System.out.println("\nSemanas: " + weeks);
        System.out.println("Días: " + days);
        System.out.println("Horas: " + hours);
    }
}