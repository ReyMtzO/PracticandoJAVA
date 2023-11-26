/*
Construir un programa que calcule y muestre en pantalla las raíces de la ecuación de segundo grado de coeficientes
reales.  ax2 + bx + c = 0      x = - b +- \/b2 - 4ac / 2a
 */
package operators.exercises;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print ("\nIngresa el valor para a,b,c,x: ");
        int a,b,c;
        double x, resultado;

        a = enter.nextInt();
        b = enter.nextInt ();
        c = enter.nextInt();
        x = enter.nextInt();
        resultado = a*Math.pow (x, 2) + b*x + c;

        System.out.println ("El resultado es: " + resultado);
    }
}