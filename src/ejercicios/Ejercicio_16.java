package ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroEntero;
        String vocal;

        System.out.print("Ingrese un numero entero: ");
        numeroEntero = teclado.nextInt();

        switch (numeroEntero) {
            case 1:
                vocal = "A";
                break;
            case 2:
                vocal = "E";
                break;
            case 3:
                vocal = "I";
                break;
            case 4:
                vocal = "O";
                break;
            case 5:
                vocal = "U";
                break;
            default:
                vocal = "Valor incorrecto";
                break;
        }

        System.out.println("La vocal correspondiente es: " + vocal);
    }
}