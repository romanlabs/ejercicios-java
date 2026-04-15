package ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double gigabytesDisco;
        double megabytesDisco;
        int cantidadCDs;

        System.out.print("Ingrese la capacidad del disco duro en GB: ");
        gigabytesDisco = teclado.nextDouble();

        megabytesDisco = gigabytesDisco * 1024;

        cantidadCDs = (int) (megabytesDisco / 700);

        if (megabytesDisco % 700 != 0) {
            cantidadCDs = cantidadCDs + 1;
        }

        System.out.println("La cantidad de CDs necesarios es: " + cantidadCDs);
    }
}