//Operadores de incremento y decremento
package operators.info;

public class Example3 {
    public static void main(String[] args) {
        int x = 5;

        x++;    //Incrementa en 1 el valor de la variable

        x--;    //Decremento en 1 el valor de la variable

        System.out.println(x);

        int x2 = 5, y;

        y = ++x2;   /*Estamos poniendo el operador de incremento como "prefijo" para que haga primero el aumento
                    al valor de la variable y después se lo asigne*/

        System.out.println(y);
    }
}
