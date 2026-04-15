package ejercicios;

import java.util.Scanner;

public class Ejercicio_30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double primerNumero;
        double segundoNumero;
        double promedio;

        System.out.print("Ingrese el primer numero: ");
        primerNumero = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        segundoNumero = teclado.nextDouble();

        promedio = (primerNumero + segundoNumero) / 2;

        System.out.println("El promedio es: " + promedio);
    }
}