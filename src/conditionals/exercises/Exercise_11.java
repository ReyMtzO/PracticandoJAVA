/*
Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones
aritméticas básicas (suma, resta, producto o multiplicación y división) con valores numéricos enteros. El usuario debe especificar
la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para
la resta, P, p, M o m para el producto y D o d para la división
*/
package conditionals.exercises;

import javax.swing.*;

public class Exercise_11 {
    public static void main(String[] args) {
        int num1, num2, sum, rest, multiplication, div;
        char operation;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número entero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número entero: "));

        operation = JOptionPane.showInputDialog("Digite la operación que desea realizar: ").charAt(0);

        switch (operation) {
            case 'S', 's' -> {
                sum = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma es: " + sum);
            }
            case 'R', 'r' -> {
                rest = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta es: " + rest);
            }
            case 'P', 'p', 'M', 'm' -> {
                multiplication = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplication);
            }
            case 'D', 'd' -> {
                div = num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: " + div);
            }
            default -> JOptionPane.showMessageDialog(null, "Error, operación incorrecta");
        }
    }
}


/*
Otra forma de escribirlo:

 switch(operation) {
            case 'S':
            case 's': sum = num1+num2;
                      JOptionPane.showMessageDialog(null, "La suma es: "+sum);
                      break;
            case 'R':
            case 'r': rest = num1-num2;
                      JOptionPane.showMessageDialog(null, "La resta es: "+rest);
                      break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':  multiplication = num1*num2;
                       JOptionPane.showMessageDialog(null, "La multiplicación es: "+multiplication);
                       break;
            case 'D':
            case 'd': div = num1/num2;
                        JOptionPane.showMessageDialog(null, "La división es: "+div);
                        break;
            default: JOptionPane.showMessageDialog(null, "Error, operación incorrecta");
        }
 */
