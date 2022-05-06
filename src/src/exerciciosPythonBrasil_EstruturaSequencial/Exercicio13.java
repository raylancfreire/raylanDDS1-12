package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();
        double fatorMultiplicaoHomem = 72.7;
        double fatorSubtracaoHomem = 58.0;
        double fatorMultiplicaoMulher = 62.1;
        double fatorSubtracaoMulher = 44.7;
        double pesoIdealHomem = (fatorMultiplicaoHomem * altura) - fatorSubtracaoHomem;
        double pesoIdealMulher = (fatorMultiplicaoMulher * altura) - fatorSubtracaoMulher;
        System.out.println("HOMEM - Seu peso ideal é de: " + pesoIdealHomem);
        System.out.print("MULHER - Seu peso ideal é de: " + pesoIdealMulher);
        scanner.close();
    }
}

