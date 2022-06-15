package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._6_topicos_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de jogos: ");
        double jogos = scanner.nextDouble();
        Double[] vetor = new Double[6];
        int i = 0;
        while (i < jogos) {
            for (int j = 0; j < vetor.length; j++) {
                double numero = random() * 60;
                double numeroArredondado = round(numero);
                vetor[j] += numeroArredondado;
                if (numeroArredondado == vetor[j]) {
                    break;
                }
            }
        i++;
        }
//        for (int i = 0; i < jogos; i++) {
//            double numero1 = random() * 60;
//            System.out.print(round(numero1) + " ");
//            double numero2 = random() * 60;
//            System.out.print(round(numero2) + " ");
//            double numero3 = random() * 60;
//            System.out.print(round(numero3) + " ");
//            double numero4 = random() * 60;
//            System.out.print(round(numero4) + " ");
//            double numero5 = random() * 60;
//            System.out.print(round(numero5) + " ");
//            double numero6 = random() * 60;
//            System.out.print(round(numero6) + " \n");
//            System.out.println("------------------");
//        }
    }
}