package ejercicios;

public class Ejercicio_26 {
    public static void main(String[] args) {

        int primerNumero;
        int segundoNumero;
        int tercerNumero;

        primerNumero = 0;
        segundoNumero = 1;
        tercerNumero = primerNumero + segundoNumero;

        System.out.println(primerNumero);
        System.out.println(segundoNumero);

        while (tercerNumero < 100000) {
            System.out.println(tercerNumero);

            primerNumero = segundoNumero;
            segundoNumero = tercerNumero;
            tercerNumero = primerNumero + segundoNumero;
        }
    }
}