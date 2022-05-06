package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        double variavelA = scanner.nextDouble();
        byte zero = 0;
        boolean naoEUmaEquacaoDoSegundoGrau = variavelA == zero;
        if (naoEUmaEquacaoDoSegundoGrau) {
            System.out.print("A equação não é do segundo grau.");
        } else {
            System.out.print("Informe o valor de B: ");
            double variavelB = scanner.nextDouble();
            System.out.print("Informe o valor de C: ");
            double variavelC = scanner.nextDouble();
            byte fatorFormulaDeDelta = 4;
            byte fatorFormulaDeBhaskara = 2;
            double delta = variavelB * variavelB - (fatorFormulaDeDelta * variavelA * variavelC);
            if (delta < zero) {
                System.out.print("A equação não possui raízes reais, pois o delta é negativo.");
            } else if (delta == zero) {
                double raiz = -variavelB / (fatorFormulaDeBhaskara * variavelA);
                System.out.print("A equação possui apenas uma raíz real, que é: " + raiz);
            } else {
                double raizDeDelta = Math.sqrt(delta);
                double primeiraRaiz = -variavelB + raizDeDelta / (fatorFormulaDeBhaskara * variavelA);
                double segundaRaiz = variavelB + raizDeDelta / (fatorFormulaDeBhaskara * variavelA);
                System.out.print("Raízes: " + primeiraRaiz + " e " + segundaRaiz);
            }
        }
    }
}