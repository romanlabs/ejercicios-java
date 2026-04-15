package ejercicios;

import java.util.Scanner;

public class Ejercicio_31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroMes;
        String nombreMes;

        System.out.print("Ingrese un numero del 1 al 12: ");
        numeroMes = teclado.nextInt();

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Numero incorrecto";
                break;
        }

        System.out.println("El mes correspondiente es: " + nombreMes);
    }
}