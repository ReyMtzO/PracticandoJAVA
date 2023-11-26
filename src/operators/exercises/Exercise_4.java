/*
Una compañía de venta de carros usados paga a su personal de ventas un salario de $1000 mensuales, más una comisión
de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturador de la empresa
ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un
vendedor dado.
 */
package operators.exercises;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        float salaryPerMonth = 1000;
        int numOfCarsSold;
        float sumCars, commission, percentageSalesPerCar, totalSalary;

        System.out.print("\nDigite la cantidad de autos vendidos: ");
        numOfCarsSold = enter.nextInt();

        System.out.print("\nDigite la suma total de dinero que se ganó por los autos vendidos: ");
        sumCars = enter.nextFloat();

        commission = numOfCarsSold * 150;
        percentageSalesPerCar = (sumCars * 0.05f);
        totalSalary = salaryPerMonth + commission + percentageSalesPerCar;

        System.out.println("\nEl salario final es: " + totalSalary);
    }
}