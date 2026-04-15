package ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroEntero;
        String equivalenteRomano;

        System.out.print("Ingrese un numero entero del 1 al 10: ");
        numeroEntero = teclado.nextInt();

        switch (numeroEntero) {
            case 1:
                equivalenteRomano = "I";
                break;
            case 2:
                equivalenteRomano = "II";
                break;
            case 3:
                equivalenteRomano = "III";
                break;
            case 4:
                equivalenteRomano = "IV";
                break;
            case 5:
                equivalenteRomano = "V";
                break;
            case 6:
                equivalenteRomano = "VI";
                break;
            case 7:
                equivalenteRomano = "VII";
                break;
            case 8:
                equivalenteRomano = "VIII";
                break;
            case 9:
                equivalenteRomano = "IX";
                break;
            case 10:
                equivalenteRomano = "X";
                break;
            default:
                equivalenteRomano = "Numero fuera de rango";
                break;
        }

        System.out.println("El equivalente en romano es: " + equivalenteRomano);
    }
}