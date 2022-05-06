package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();
        byte fatorDeDivisao = 4;
        double restoDivisaoPorQuatro = ano % fatorDeDivisao;
        byte zero = 0;
        boolean anoBissexto = restoDivisaoPorQuatro == zero;
        if (anoBissexto)
            System.out.print("O ano é bissexto");
        else
            System.out.print("O ano não é bissexto");
        }
    }