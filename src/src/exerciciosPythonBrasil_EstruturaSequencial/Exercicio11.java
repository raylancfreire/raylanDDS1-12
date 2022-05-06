package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int primeiroInteiro = scanner.nextInt();
        System.out.print("Informe outro numero inteiro ");
        int segundoInteiro = scanner.nextInt();
        System.out.print("Informe um numero real: ");
        double numeroReal = scanner.nextDouble();
        double fatorDobro = 2.0;
        double fatorTriplo = 3.0;
        double dobroDoPrimeiro = primeiroInteiro * fatorDobro;
        double metadeDoSegundo = segundoInteiro / fatorDobro;
        double triploDoPrimeiro = primeiroInteiro * fatorTriplo;
        double terceiroElevadoAoCubo = numeroReal * numeroReal * numeroReal;
        double produtoDoDobroDoPrimeiroComMetadeDoSegundo = dobroDoPrimeiro * metadeDoSegundo;
        double somaDoTriploDoPrimeiroComTerceiro = triploDoPrimeiro + numeroReal;
        System.out.println("O produto do dobro do primeiro com metade do segundo é de: " + produtoDoDobroDoPrimeiroComMetadeDoSegundo);
        System.out.println("A soma do triplo do primeiro com o terceiro é de: " + somaDoTriploDoPrimeiroComTerceiro);
        System.out.print("O terceiro elevado ao cubo é: " + terceiroElevadoAoCubo);
        scanner.close();
    }
}
