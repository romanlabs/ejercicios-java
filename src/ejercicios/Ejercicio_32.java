package ejercicios;

import java.util.Scanner;

public class Ejercicio_32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int divisor;

        System.out.print("Ingrese un numero entero diferente de cero: ");
        numero = teclado.nextInt();

        System.out.println("Los divisores de " + numero + " son:");

        for (divisor = 1; divisor <= Math.abs(numero); divisor++) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}