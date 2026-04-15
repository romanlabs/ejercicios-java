package ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int partidosGanados;
        int partidosEmpatados;
        int partidosPerdidos;
        int puntosPorGanados;
        int puntosPorEmpatados;
        int puntajeTotal;

        System.out.print("Ingrese la cantidad de partidos ganados: ");
        partidosGanados = teclado.nextInt();

        System.out.print("Ingrese la cantidad de partidos empatados: ");
        partidosEmpatados = teclado.nextInt();

        System.out.print("Ingrese la cantidad de partidos perdidos: ");
        partidosPerdidos = teclado.nextInt();

        puntosPorGanados = partidosGanados * 3;
        puntosPorEmpatados = partidosEmpatados * 1;
        puntajeTotal = puntosPorGanados + puntosPorEmpatados;

        System.out.println("El puntaje total es: " + puntajeTotal);
    }
}