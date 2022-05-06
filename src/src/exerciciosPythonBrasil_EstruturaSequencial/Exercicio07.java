package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do lado de um quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        int dobro = 2;
        double dobroDaArea = area * dobro;
        System.out.print("O dobro da área do quadrado é: " + dobroDaArea);
        scanner.close();
    }
}