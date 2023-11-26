//Clase Math y algunos métodos de la misma
package operators.info;

public class Math {
    public static void main(String[] args) {

        double raiz = java.lang.Math.sqrt(9);   //Método de la clase Math para sacar la -raíz cuadrada-
        System.out.println(raiz);

        double base = 4, exponente = 3;
        double resultado = java.lang.Math.pow(base, exponente); //Método de la clase Math para -elevar a cierta potencia-
        System.out.println(resultado);

        float num = 7.89f;
        long result = java.lang.Math.round(num);    //Método de la clase Math para -redondear- un número decimal
        System.out.println(result);

        double numero = java.lang.Math.random();    //Método de la clase Math para -sacar un número aleatorio-
        System.out.println(numero);
    }
}