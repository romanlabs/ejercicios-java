package ejercicios;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroEntero;
        String mensaje;

        System.out.print("Ingrese un numero entero diferente de cero: ");
        numeroEntero = teclado.nextInt();

        if (numeroEntero % 2 == 0) {
            mensaje = "Es par";
        } else {
            mensaje = "Es impar";
        }

        System.out.println(mensaje);
    }
}