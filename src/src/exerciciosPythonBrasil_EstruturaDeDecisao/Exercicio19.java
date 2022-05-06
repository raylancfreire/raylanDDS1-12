package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();
        byte operadorMatematico = 10;
        int unidade = numero % operadorMatematico;
        int numeroSemUnidade = (numero - unidade) / operadorMatematico;
        int dezena = numeroSemUnidade % operadorMatematico;
        int centena = (numeroSemUnidade - dezena) / operadorMatematico;
        System.out.print(centena + " centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s).");
    }
}