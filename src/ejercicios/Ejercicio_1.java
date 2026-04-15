package ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double velocidad;
        double tiempo;
        double distancia;

        System.out.print("Ingrese la velocidad en m/s: ");
        velocidad = teclado.nextDouble();

        System.out.print("Ingrese el tiempo en segundos: ");
        tiempo = teclado.nextDouble();

        distancia = velocidad * tiempo;

        System.out.println("La distancia recorrida es: " + distancia + " metros");
    }
}