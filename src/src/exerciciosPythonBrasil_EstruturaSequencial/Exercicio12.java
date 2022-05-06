package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();
        double fatorMultiplicao = 72.7;
        double fatorSubtracao = 58.0;
        double pesoIdeal = (fatorMultiplicao * altura) - fatorSubtracao;
        System.out.print("Seu peso ideal é de: " + pesoIdeal);
        scanner.close();
    }
}