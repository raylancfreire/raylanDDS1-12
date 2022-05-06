package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();
        byte coberturaDaTintaPorMetro = 3;
        double consumoPorLitro = area / coberturaDaTintaPorMetro;
        byte capacidadeLatasDeTinta = 18;
        double latasDeTinta = consumoPorLitro / capacidadeLatasDeTinta;
        double latasDeTintaArredondado = Math.ceil(latasDeTinta);
        byte valorLataDeTinta = 80;
        double precoTotal = latasDeTintaArredondado * valorLataDeTinta;
        System.out.println("Quantidade de latas a serem compradas: " + latasDeTintaArredondado);
        System.out.print("Valor das latas de tinta: R$" + precoTotal);
        scanner.close();
    }
}