package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double grausFahrenheit = scanner.nextDouble();
        double fatorDeDivisao = 9.0;
        double fatorDeMultiplicacao = 5.0;
        double fatorDeConversao = 32.0;
        double formulaCelsiusParaFahrenheit = fatorDeMultiplicacao * ((grausFahrenheit - fatorDeConversao) / fatorDeDivisao);
        System.out.print("A temperatura em Celsius é de: " + formulaCelsiusParaFahrenheit + "°C");
        scanner.close();
    }
}