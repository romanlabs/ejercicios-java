package ejercicios;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edadPersona;
        int cantidadMayores;
        int cantidadMenores;
        int contador;

        cantidadMayores = 0;
        cantidadMenores = 0;

        for (contador = 1; contador <= 200; contador++) {
            System.out.print("Ingrese la edad de la persona " + contador + ": ");
            edadPersona = teclado.nextInt();

            if (edadPersona < 18) {
                cantidadMenores = cantidadMenores + 1;
            } else {
                cantidadMayores = cantidadMayores + 1;
            }
        }

        System.out.println("Cantidad de mayores de edad: " + cantidadMayores);
        System.out.println("Cantidad de menores de edad: " + cantidadMenores);
    }
}