package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        System.out.print("Digite o valor que você deseja sacar. Valor mínimo: R$10,00. Valor máximo: R$600,00: ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int notasDeCem = 100;
        int notasDeCinquenta = 50;
        int notasDeDez = 10;
        int notasDeCinco = 5;
        int notasDeUm = 1;
        if (valor >= 10 && valor <= 600) {
            if (notasDeCem > 0) {
                notasDeCem = valor / 100;
                valor = valor % 100;
                System.out.println(notasDeCem + " notas de 100");
            }
            if (notasDeCinquenta > 0) {
                notasDeCinquenta = valor / 50;
                valor = valor % 50;
                System.out.println(notasDeCinquenta + " notas de 50");
            }
            if (notasDeDez > 0) {
                notasDeDez = valor / 10;
                valor = valor % 10;
                System.out.println(notasDeDez + " notas de 10");
            }
            if (notasDeCinco > 0) {
                notasDeCinco = valor / 5;
                valor = valor % 5;
                System.out.println(notasDeCinco + " notas de 5");
            }
            if (notasDeUm > 0) {
                notasDeUm = valor / 1;
                valor = valor % 1;
                System.out.print(notasDeUm + " notas de 1");
            }
        } else {
            System.out.print("Não é possível realizar o saque");
        }
    }
}