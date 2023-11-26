//Ejemplo con los operadores aritméticos comunes
package operators.info;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float num1, num2, sum, rest, mult, div, resto;

        System.out.print("Digita dos números: ");
        num1 = enter.nextFloat();
        num2 = enter.nextFloat();

        sum = num1 + num2;
        rest = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;

        System.out.println("La suma nos da: " + sum);
        System.out.println("La resta nos da: " + rest);
        System.out.println("La multiplicación nos da: " + mult);
        System.out.println("La división nos da: " + div);
        System.out.println("El residuo es: " + resto);

    }
}
