package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Informe outro número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("Escolha a operação a ser realizada");
        System.out.print("Adição [+] | Subtração [-] | Multiplicação [*] | Divisão [/]");
        byte operadorMatematico = 1;
        //boolean restoDaDivisaoIgualAZero = numero % operadorMatematico == 0;
        //if (restoDaDivisaoIgualAZero)
            System.out.print("O número informado é inteiro.");
        //else
            System.out.print("O número informado é decimal.");
    }
}