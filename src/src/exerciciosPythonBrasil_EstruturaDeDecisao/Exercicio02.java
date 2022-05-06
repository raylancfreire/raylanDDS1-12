package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        byte zero = 0;
        boolean numeroMaiorOuIgualAZero = numero >= zero;
        if (numeroMaiorOuIgualAZero) {
            System.out.println("O número é " + numero + " " + "é positivo");
        } else {
            System.out.println("O número é " + numero + " " + "é negativo");
        }
        scanner.close();
    }
}