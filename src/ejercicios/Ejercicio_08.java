package ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double abscisaA;
        double abscisaB;
        double ordenadaA;
        double ordenadaB;
        double distancia;

        System.out.print("Ingrese la abscisa del punto A: ");
        abscisaA = teclado.nextDouble();

        System.out.print("Ingrese la abscisa del punto B: ");
        abscisaB = teclado.nextDouble();

        System.out.print("Ingrese la ordenada del punto A: ");
        ordenadaA = teclado.nextDouble();

        System.out.print("Ingrese la ordenada del punto B: ");
        ordenadaB = teclado.nextDouble();

        distancia = Math.sqrt(
                Math.pow(abscisaB - abscisaA, 2) +
                Math.pow(ordenadaB - ordenadaA, 2)
        );

        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}