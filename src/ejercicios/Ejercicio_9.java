package ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anioNacimiento;
        int anioActual;
        int edad;

        System.out.print("Ingrese el año de nacimiento: ");
        anioNacimiento = teclado.nextInt();

        System.out.print("Ingrese el año actual: ");
        anioActual = teclado.nextInt();

        edad = anioActual - anioNacimiento;

        if (edad > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aun");
        }
    }
}