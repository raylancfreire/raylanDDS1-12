package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        float numero = scanner.nextFloat();
        byte operadorMatematico = 1;
        boolean restoDaDivisaoIgualAZero = numero % operadorMatematico == 0;
        if (restoDaDivisaoIgualAZero)
            System.out.print("O número informado é inteiro.");
        else
            System.out.print("O número informado é decimal.");
    }
}