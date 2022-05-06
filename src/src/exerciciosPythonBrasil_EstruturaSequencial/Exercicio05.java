package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor em metros para converte-lo para centímetros: ");
        double valorMetros = scanner.nextDouble();
        int valorParaConversao = 100;
        double valorCentimetros = valorMetros * valorParaConversao;
        System.out.print("O valor em centímetros é de: " + valorCentimetros + " " + "centímetros");
        scanner.close();
    }
}