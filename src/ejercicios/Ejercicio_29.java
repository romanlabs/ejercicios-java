package ejercicios;

import java.util.Scanner;

public class Ejercicio_29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int votoElector;
        int votosCandidato1;
        int votosCandidato2;
        int votosCandidato3;
        int votosNulosOBlancos;
        int contador;
        String ganador;

        votosCandidato1 = 0;
        votosCandidato2 = 0;
        votosCandidato3 = 0;
        votosNulosOBlancos = 0;

        for (contador = 1; contador <= 160; contador++) {
            System.out.print("Ingrese el voto del elector " + contador + " (1, 2 o 3): ");
            votoElector = teclado.nextInt();

            switch (votoElector) {
                case 1:
                    votosCandidato1 = votosCandidato1 + 1;
                    break;
                case 2:
                    votosCandidato2 = votosCandidato2 + 1;
                    break;
                case 3:
                    votosCandidato3 = votosCandidato3 + 1;
                    break;
                default:
                    votosNulosOBlancos = votosNulosOBlancos + 1;
                    break;
            }
        }

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            ganador = "Candidato 1";
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            ganador = "Candidato 2";
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            ganador = "Candidato 3";
        } else {
            ganador = "Hubo empate";
        }

        System.out.println("Votos del candidato 1: " + votosCandidato1);
        System.out.println("Votos del candidato 2: " + votosCandidato2);
        System.out.println("Votos del candidato 3: " + votosCandidato3);
        System.out.println("Votos nulos o en blanco: " + votosNulosOBlancos);
        System.out.println("Ganador: " + ganador);
    }
}