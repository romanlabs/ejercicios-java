package ejercicios;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double primeraNota;
        double segundaNota;
        double terceraNota;
        double promedio;

        System.out.print("Ingrese la primera nota: ");
        primeraNota = teclado.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        segundaNota = teclado.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        terceraNota = teclado.nextDouble();

        promedio = (primeraNota + segundaNota + terceraNota) / 3;

        System.out.println("El promedio es: " + promedio);
    }
}