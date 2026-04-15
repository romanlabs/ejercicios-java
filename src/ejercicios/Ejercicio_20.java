package ejercicios;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroEmpleados;
        int contador;
        double sueldoEmpleado;
        double sumaSueldos;
        double sueldoPromedio;

        System.out.print("Ingrese la cantidad de empleados: ");
        numeroEmpleados = teclado.nextInt();

        sumaSueldos = 0;

        for (contador = 1; contador <= numeroEmpleados; contador++) {
            System.out.print("Ingrese el sueldo del empleado " + contador + ": ");
            sueldoEmpleado = teclado.nextDouble();
            sumaSueldos = sumaSueldos + sueldoEmpleado;
        }

        sueldoPromedio = sumaSueldos / numeroEmpleados;

        System.out.println("El sueldo promedio es: " + sueldoPromedio);
    }
}