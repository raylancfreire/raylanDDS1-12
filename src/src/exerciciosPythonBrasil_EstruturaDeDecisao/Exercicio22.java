package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        byte operadorMatematico = 2;
        int par = numero % operadorMatematico;
        byte restoDivisaoDeUmNumeroPar = 0;
        boolean numeroPar = par == restoDivisaoDeUmNumeroPar;
        if (numeroPar)
            System.out.print("O número é par.");
        else
            System.out.print("O número é ímpar.");
    }
}