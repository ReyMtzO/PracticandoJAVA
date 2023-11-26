/*
En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
¿Cuál será la cantidad que pagará una persona por su compra?
*/
package conditionals.exercises;

import javax.swing.*;

public class Exercise_4 {
    public static void main(String[] args) {

        double total, discount;

        total = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad total de la compra: "));

        if(total > 300){
            discount = total*0.20;
            JOptionPane.showMessageDialog(null, "El total a pagar (con descuento) es de: "+(total-discount));
        } else{
            JOptionPane.showMessageDialog(null, "El total a pagar (sin descuento) es de: "+total);
        }
    }
}
