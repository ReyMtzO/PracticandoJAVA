//Ejercicio 1. Hacer un programa que calcule e imprima la suma de tres calificaciones.
package operators.exercises;

import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        float rating1, rating2, rating3, sum;

        //Guardamos las 3 calificaciones
        System.out.print("Digita las 3 calificaciones del estudiante: ");
        rating1 = enter.nextFloat();
        rating2 = enter.nextFloat();
        rating3 = enter.nextFloat();

        sum = rating1 + rating2 + rating3;

        System.out.println("\nLa suma de la calificación obtenida es: " + sum);
    }
}
