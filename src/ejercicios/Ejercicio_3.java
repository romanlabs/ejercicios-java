package ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int respuestasCorrectas;
        int respuestasIncorrectas;
        int respuestasEnBlanco;
        int puntajeCorrectas;
        int puntajeIncorrectas;
        int puntajeFinal;

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        respuestasCorrectas = teclado.nextInt();

        System.out.print("Ingrese la cantidad de respuestas incorrectas: ");
        respuestasIncorrectas = teclado.nextInt();

        System.out.print("Ingrese la cantidad de respuestas en blanco: ");
        respuestasEnBlanco = teclado.nextInt();

        puntajeCorrectas = respuestasCorrectas * 4;
        puntajeIncorrectas = respuestasIncorrectas * -1;
        puntajeFinal = puntajeCorrectas + puntajeIncorrectas;

        System.out.println("El puntaje final es: " + puntajeFinal);
    }
}