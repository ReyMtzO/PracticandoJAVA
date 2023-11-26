/*
La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos
de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%.
Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
*/
package operators.exercises;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        float participation, partial1, partial2, finalExam, total;

        //Pedir los datos necesarios
        System.out.print("\nDigite el porcentaje de participación del estudiante: ");
        participation = enter.nextFloat();
        System.out.print("\nDigite el porcentaje del primer parcial del estudiante: ");
        partial1 = enter.nextFloat();
        System.out.print("\nDigite el porcentaje del segundo parcial del estudiante: ");
        partial2 = enter.nextFloat();
        System.out.print("\nDigite el porcentaje del examen final del estudiante: ");
        finalExam = enter.nextFloat();

        //Sacamos los porcentajes de cada rúbrica
        participation *= 0.10f;
        partial1 *= 0.25f;
        partial2 *= 0.25f;
        finalExam *= 0.40f;

        //Sumamos los porcentajes de calificaciones
        total = participation + partial1 + partial2 + finalExam;

        //Imprimimos en pantalla la calificación final del estudiante
        System.out.println("\nLa calificación final del estudiante es: "+total);
    }
}
