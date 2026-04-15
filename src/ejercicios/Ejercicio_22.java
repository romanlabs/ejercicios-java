package ejercicios;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int contador;
        int producto;

        System.out.print("Ingrese el primer numero entero: ");
        primerNumero = teclado.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        segundoNumero = teclado.nextInt();

        producto = 0;

        for (contador = 1; contador <= segundoNumero; contador++) {
            producto = producto + primerNumero;
        }

        System.out.println("El producto es: " + producto);
    }
}