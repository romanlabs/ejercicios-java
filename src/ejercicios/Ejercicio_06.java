package ejercicios;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ladoA;
        double ladoB;
        double ladoC;
        double semiperimetro;
        double areaTriangulo;

        System.out.print("Ingrese el lado A: ");
        ladoA = teclado.nextDouble();

        System.out.print("Ingrese el lado B: ");
        ladoB = teclado.nextDouble();

        System.out.print("Ingrese el lado C: ");
        ladoC = teclado.nextDouble();

        semiperimetro = (ladoA + ladoB + ladoC) / 2;

        areaTriangulo = Math.sqrt(
                semiperimetro
                * (semiperimetro - ladoA)
                * (semiperimetro - ladoB)
                * (semiperimetro - ladoC)
        );

        System.out.println("El area del triangulo es: " + areaTriangulo);
    }
}