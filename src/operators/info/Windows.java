//Entrada y salida de datos con JOptionPane. Ventanas emergentes y formas de mostrarlas con diferentes tipos de datos
package operators.info;

import javax.swing.*;

public class Windows {
    public static void main(String[] args) {
        //Declaramos variables de distintos tipos de datos
        String cadena;
        int entero;
        char letra;
        double decimal;

        //Llamamos a las variables y les asignamos una ventana emergente de entrada de datos que guardará su valor
        cadena = JOptionPane.showInputDialog("Escriba el título de la revista: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de páginas de la revista: "));
        letra = JOptionPane.showInputDialog("Escriba la letra correspondiente al tomo de la revista: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escriba la calificación que obtuvo la revista: "));

        //Mostramos el contenido de las variables mediante otra ventana emergente
        JOptionPane.showMessageDialog(null,"Título de la revista: "+ cadena);
        JOptionPane.showMessageDialog(null, "Páginas totales: "+ entero);
        JOptionPane.showMessageDialog(null, "Tomo: "+ letra);
        JOptionPane.showMessageDialog(null, "Calificación: "+ decimal);
    }
}