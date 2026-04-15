package ejercicios;

public class Ejercicio_24 {
    public static void main(String[] args) {

        int serie;

        serie = 1;

        while (serie < 1000) {
            System.out.println(serie);
            serie = (serie * serie) + 1;
        }
    }
}