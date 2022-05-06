package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        double ganhoPorHora = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou no mes? ");
        double horasTrabalhadasNoMes = scanner.nextDouble();
        double salarioBruto = ganhoPorHora * horasTrabalhadasNoMes;
        int novecentosReais = 900;
        int milEQuinhetosReais = 1500;
        int doisMilEQuinhentosReais = 2500;
        boolean salarioBrutoMaiorMenorOuIgualANovecentosReais = salarioBruto <= novecentosReais;
        boolean salarioBrutoMenorQueNovecentosEMenorOuIgualAMilEQuinhentosReais = salarioBruto > novecentosReais && salarioBruto <= milEQuinhetosReais;
        boolean salarioBrutoMaiorQueMilEQuinhentosEMenorOuIgualADoisMilEQuinhentosReais = salarioBruto > milEQuinhetosReais && salarioBruto <= doisMilEQuinhentosReais;
        if (salarioBrutoMaiorMenorOuIgualANovecentosReais) {
            double taxaImpostoDeRenda = 0;
            double taxaInss = 0.1;
            double taxaFgts = 0.11;
            double impostoDeRenda = salarioBruto * taxaImpostoDeRenda;
            double inss = salarioBruto * taxaInss;
            double fgts = salarioBruto * taxaFgts;
            double descontos = impostoDeRenda + inss;
            double salarioLiquido = salarioBruto - descontos;
            System.out.println(("Salário bruto: R$" + salarioBruto));
            System.out.println("(-) IR (0%): Isento");
            System.out.println("(-) INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: R$" + descontos);
            System.out.print("Salário Líquido: " + salarioLiquido);
        } else if (salarioBrutoMenorQueNovecentosEMenorOuIgualAMilEQuinhentosReais) {
            double taxaImpostoDeRenda = 0.05;
            double taxaInss = 0.1;
            double taxaFgts = 0.11;
            double impostoDeRenda = salarioBruto * taxaImpostoDeRenda;
            double inss = salarioBruto * taxaInss;
            double fgts = salarioBruto * taxaFgts;
            double descontos = impostoDeRenda + inss;
            double salarioLiquido = salarioBruto - descontos;
            System.out.println(("Salário bruto: R$" + salarioBruto));
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: R$" + descontos);
            System.out.print("Salário Líquido: " + salarioLiquido);
        } else if (salarioBrutoMaiorQueMilEQuinhentosEMenorOuIgualADoisMilEQuinhentosReais) {
            double taxaImpostoDeRenda = 0.1;
            double taxaInss = 0.1;
            double taxaFgts = 0.11;
            double impostoDeRenda = salarioBruto * taxaImpostoDeRenda;
            double inss = salarioBruto * taxaInss;
            double fgts = salarioBruto * taxaFgts;
            double descontos = impostoDeRenda + inss;
            double salarioLiquido = salarioBruto - descontos;
            System.out.println(("Salário bruto: R$" + salarioBruto));
            System.out.println("(-) IR (10%): " + impostoDeRenda);
            System.out.println("(-) INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: R$" + descontos);
            System.out.print("Salário Líquido: " + salarioLiquido);
        } else {
            double taxaImpostoDeRenda = 0.2;
            double taxaInss = 0.1;
            double taxaFgts = 0.11;
            double impostoDeRenda = salarioBruto * taxaImpostoDeRenda;
            double inss = salarioBruto * taxaInss;
            double fgts = salarioBruto * taxaFgts;
            double descontos = impostoDeRenda + inss;
            double salarioLiquido = salarioBruto - descontos;
            System.out.println(("Salário bruto: R$" + salarioBruto));
            System.out.println("(-) IR (20%): " + impostoDeRenda);
            System.out.println("(-) INSS (10%): " + inss);
            System.out.println("FGTS (11%): " + fgts);
            System.out.println("Total de descontos: R$" + descontos);
            System.out.print("Salário Líquido: " + salarioLiquido);
        }
    }
}