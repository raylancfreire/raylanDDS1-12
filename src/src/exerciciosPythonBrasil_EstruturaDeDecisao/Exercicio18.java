package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma data válida no formato dd/mm/aaaa");
        System.out.print("Informe o dia: ");
        byte dia = scanner.nextByte();
        boolean diaValido = dia >= 1 && dia <= 31;
        if (diaValido)
            System.out.print("Informe o mês: ");
            byte mes = scanner.nextByte();
            boolean mesValido = mes >= 1 && mes <= 12;
            if (mesValido)
                System.out.print("Informe o ano: ");
                int ano = scanner.nextInt();
                boolean anoValido = ano >= 1 && ano <= 16000;
                if (anoValido)
                    System.out.print("A data informada é: " + dia + "/" + mes + "/" + ano);
                else
                    System.out.print("A data informada é inválida!");
    }
}