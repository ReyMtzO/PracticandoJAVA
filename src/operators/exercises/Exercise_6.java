/*
Hacer un programa que calcule el cuadrado de una suma (a+b)2 = a2 + b2 + 2ab
*/
package operators.exercises;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);

        double a, b;

        System.out.print("\nEscribe dos números: ");
        a = enter.nextDouble();
        b = enter.nextDouble();

        double base = (a+b), exponente = 2;
        double potencia = Math.pow(base, exponente);
        System.out.println("\nEl resultado es: " + potencia);
    }
}