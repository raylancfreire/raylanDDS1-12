package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        double ganhoPorHora = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou no mes? ");
        double horasTrabalhadasNoMes = scanner.nextDouble();
        double taxaImpostoDeRenda = 0.11;
        double taxaInss = 0.08;
        double taxaSindicato = 0.05;
        double salarioBruto = ganhoPorHora * horasTrabalhadasNoMes;
        double impostoDeRenda = salarioBruto * taxaImpostoDeRenda;
        double inss = salarioBruto * taxaInss;
        double sindicato = salarioBruto * taxaSindicato;
        double descontos = impostoDeRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Imposto de Renda (11%) : R$" + impostoDeRenda);
        System.out.println("INSS (8%) : R$" + inss);
        System.out.println("Sindicato (5%) : R$" + sindicato);
        System.out.print("Salário Líquido: R$" + salarioLiquido);
        scanner.close();
    }
}