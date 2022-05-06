package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME SEU SEXO");
        System.out.println("M para Masculino e F para Feminino, qualquer outra para indefinido ");
        System.out.print("Opção: ");
        String letra = scanner.nextLine();
        boolean masculino = letra.equals("M");
        boolean feminino = letra.equals("F");
        if (masculino) {
            System.out.print("Masculino");
        } else if (feminino) {
            System.out.print("Feminino");
        } else System.out.print("Indefinido");
    }
}