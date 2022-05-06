package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME O TURNO EM QUE VOCÊ ESTUDA");
        System.out.print("M para Matutino, V para Vespertino e N para Noturno: ");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "M")) {
            System.out.print("Bom Dia!");
        } else if (Objects.equals(letra, "V")) {
            System.out.print("Boa Tarde!");
        } else if (Objects.equals(letra, "N")) {
            System.out.print("Boa Noite!");
        } else System.out.print("Valor Inválido!");
    }
}