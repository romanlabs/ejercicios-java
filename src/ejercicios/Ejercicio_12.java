package ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int tercerNumero;
        int numeroMayor;

        System.out.print("Ingrese el primer numero: ");
        primerNumero = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        segundoNumero = teclado.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        tercerNumero = teclado.nextInt();

        if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
            numeroMayor = primerNumero;
        } else {
            if (segundoNumero > tercerNumero) {
                numeroMayor = segundoNumero;
            } else {
                numeroMayor = tercerNumero;
            }
        }

        System.out.println("El numero mayor es: " + numeroMayor);
    }
}