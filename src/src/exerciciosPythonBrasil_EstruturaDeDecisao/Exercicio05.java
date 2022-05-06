package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();
        byte quantidadeDeNotas = 2;
        double somaDeNotas = primeiraNota + segundaNota;
        double media = somaDeNotas / quantidadeDeNotas;
        byte mediaSete = 7;
        byte mediaDez = 10;
        boolean aprovado = media >= mediaSete;
        boolean aprovadoComDistincao = media >= mediaDez;
        if (aprovadoComDistincao) {
            System.out.print(("Você foi aprovado com distinção"));
        } else if  (aprovado) {
            System.out.print("Você passou de ano");
        } else {
            System.out.print("Você foi reprovado");
        }
    }
}