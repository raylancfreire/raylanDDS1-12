package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        double grausCelsius = scanner.nextDouble();
        double fatorDeConversao = 1.8;
        double fatorDeSoma = 32.0;
        double formulaFahrenheitParaCelsius = (grausCelsius * fatorDeConversao) + fatorDeSoma;
        System.out.print("A temperatura em Fahrenheit é de: " + formulaFahrenheitParaCelsius + "°F");
        scanner.close();
    }
}