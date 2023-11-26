/*
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen
Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
package operators.exercises;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        float guillermo, luis, juan, total;

        System.out.print("\nDigite la cantidad de dinero que tiene Guillermo: ");
        guillermo = enter.nextFloat();

        luis = guillermo / 2;   //Luis tiene la mitad de lo que posee Guillermo
        juan = (guillermo + luis) / 2;    //Juan tiene la mitad de lo que poseen Guillermo y Luis juntos

        total = guillermo + luis + juan;
        System.out.print("\nLa cantidad de dinero que tienen las 3 personas en total es: " + total);
    }
}