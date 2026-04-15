package ejercicios;

import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double primerNumero;
        double segundoNumero;
        char operador;
        double resultado;

        System.out.print("Ingrese el primer numero: ");
        primerNumero = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        segundoNumero = teclado.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, ^): ");
        operador = teclado.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = primerNumero + segundoNumero;
                break;
            case '-':
                resultado = primerNumero - segundoNumero;
                break;
            case '*':
                resultado = primerNumero * segundoNumero;
                break;
            case '^':
                resultado = Math.pow(primerNumero, segundoNumero);
                break;
            default:
                resultado = 0;
                System.out.println("Operador no valido.");
                break;
        }

        System.out.println("El resultado es: " + resultado);
    }
}