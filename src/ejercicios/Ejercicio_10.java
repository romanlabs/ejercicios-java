package ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edadPrimerHermano;
        int edadSegundoHermano;
        int diferenciaEdad;

        System.out.print("Ingrese la edad del primer hermano: ");
        edadPrimerHermano = teclado.nextInt();

        System.out.print("Ingrese la edad del segundo hermano: ");
        edadSegundoHermano = teclado.nextInt();

        if (edadPrimerHermano > edadSegundoHermano) {
            diferenciaEdad = edadPrimerHermano - edadSegundoHermano;
            System.out.println("El primer hermano es el mayor");
            System.out.println("La diferencia de edad es: " + diferenciaEdad + " anios");
        } else {
            diferenciaEdad = edadSegundoHermano - edadPrimerHermano;
            System.out.println("El segundo hermano es el mayor");
            System.out.println("La diferencia de edad es: " + diferenciaEdad + " anios");
        }
    }
}