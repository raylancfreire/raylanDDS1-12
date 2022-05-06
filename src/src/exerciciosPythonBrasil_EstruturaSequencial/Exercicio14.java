package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o peso de peixes: ");
        double pesoDePeixes = scanner.nextDouble();
        byte pesoAceitavel = 50;
        double excesso = pesoDePeixes - pesoAceitavel;
        byte multa = 4;
        double totalAPagar = excesso * multa;
        System.out.println("Peso de peixes: " + pesoDePeixes + "kg");
        System.out.println("Excesso de peixes: " + excesso + "kg");
        System.out.println("Multa a ser paga: R$"+ totalAPagar);
        scanner.close();
    }
}