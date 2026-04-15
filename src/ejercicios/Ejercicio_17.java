package ejercicios;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroEntero;
        int numeroDecenas;
        int numeroUnidades;

        System.out.print("Ingrese un numero entero de 2 cifras: ");
        numeroEntero = teclado.nextInt();

        numeroDecenas = numeroEntero / 10;
        numeroUnidades = numeroEntero % 10;

        System.out.println("Numero de decenas: " + numeroDecenas);
        System.out.println("Numero de unidades: " + numeroUnidades);
    }
}