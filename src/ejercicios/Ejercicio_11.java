package ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double produccionLunes;
        double produccionMartes;
        double produccionMiercoles;
        double produccionJueves;
        double produccionViernes;
        double produccionSabado;
        double produccionTotal;
        double produccionPromedio;
        String mensaje;

        System.out.print("Ingrese la produccion del lunes: ");
        produccionLunes = teclado.nextDouble();

        System.out.print("Ingrese la produccion del martes: ");
        produccionMartes = teclado.nextDouble();

        System.out.print("Ingrese la produccion del miercoles: ");
        produccionMiercoles = teclado.nextDouble();

        System.out.print("Ingrese la produccion del jueves: ");
        produccionJueves = teclado.nextDouble();

        System.out.print("Ingrese la produccion del viernes: ");
        produccionViernes = teclado.nextDouble();

        System.out.print("Ingrese la produccion del sabado: ");
        produccionSabado = teclado.nextDouble();

        produccionTotal = produccionLunes + produccionMartes + produccionMiercoles
                + produccionJueves + produccionViernes + produccionSabado;

        produccionPromedio = produccionTotal / 6;

        if (produccionPromedio >= 100) {
            mensaje = "Recibira incentivos";
        } else {
            mensaje = "No recibira incentivos";
        }

        System.out.println(mensaje);
    }
}