package ejercicios;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String letra;
        boolean continuar;

        continuar = true;

        while (continuar) {
            System.out.print("Ingrese una letra: ");
            letra = teclado.next();

            if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
                
                continuar = false;
            }
        }

        System.out.println("Se ingreso una vocal.");
    }
}