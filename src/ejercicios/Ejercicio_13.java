package ejercicios;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double primerLado;
        double segundoLado;
        double tercerLado;
        String tipoTriangulo;

        System.out.print("Ingrese el primer lado: ");
        primerLado = teclado.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        segundoLado = teclado.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        tercerLado = teclado.nextDouble();

        if (primerLado != segundoLado && segundoLado != tercerLado && tercerLado != primerLado) {
            tipoTriangulo = "Escaleno";
        } else {
            if (primerLado == segundoLado && segundoLado == tercerLado) {
                tipoTriangulo = "Equilatero";
            } else {
                tipoTriangulo = "Isosceles";
            }
        }

        System.out.println("El triangulo es: " + tipoTriangulo);
    }
}
