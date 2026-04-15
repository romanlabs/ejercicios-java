package ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double horasLaboradas;
        double tarifaPorHora;
        double planilla;

        System.out.print("Ingrese las horas laboradas en el mes: ");
        horasLaboradas = teclado.nextDouble();

        System.out.print("Ingrese la tarifa por hora: ");
        tarifaPorHora = teclado.nextDouble();

        planilla = horasLaboradas * tarifaPorHora;

        System.out.println("La planilla del empleado es: " + planilla);
    }
}