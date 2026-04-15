package ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double montoVenta;
        double totalBonificacion;

        System.out.print("Ingrese el monto de venta: ");
        montoVenta = teclado.nextDouble();

        if (montoVenta >= 0 && montoVenta < 1000) {
            totalBonificacion = (0 * montoVenta) / 100;
        } else if (montoVenta >= 1000 && montoVenta < 5000) {
            totalBonificacion = (3 * montoVenta) / 100;
        } else if (montoVenta >= 5000 && montoVenta < 20000) {
            totalBonificacion = (5 * montoVenta) / 100;
        } else {
            totalBonificacion = (8 * montoVenta) / 100;
        }

        System.out.println("La bonificacion es: " + totalBonificacion);
    }
}