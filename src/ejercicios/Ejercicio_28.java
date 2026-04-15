package ejercicios;

import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String letra;
        int contador;
        int numeroVocales;
        int numeroConsonantes;

        numeroVocales = 0;
        numeroConsonantes = 0;

        for (contador = 1; contador <= 10; contador++) {
            System.out.print("Ingrese una letra: ");
            letra = teclado.next();

            if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
                
                numeroVocales = numeroVocales + 1;
            } else {
                numeroConsonantes = numeroConsonantes + 1;
            }
        }

        System.out.println("Cantidad de vocales: " + numeroVocales);
        System.out.println("Cantidad de consonantes: " + numeroConsonantes);
    }
}