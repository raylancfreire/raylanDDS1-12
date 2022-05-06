package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu Salário: ");
        double salario = scanner.nextDouble();
        int duzentosEOitentaReais = 280;
        int setecentosReais = 700;
        int milEQuinhentosReais = 1500;
        boolean menorOuIgualADuzentosEOitentaReais = salario <= duzentosEOitentaReais;
        boolean maiorQueDuzentosEOitentaReaisEMenorQueSetecentosReais = salario > duzentosEOitentaReais && salario < setecentosReais;
        boolean maiorQueSetecentosReaisEMenorQueMilEQuinhentosReais = salario > setecentosReais && salario < milEQuinhentosReais;
        if (menorOuIgualADuzentosEOitentaReais) {
            double vintePorCento = 0.2;
            double vintePorCentoDoSalario = salario * vintePorCento;
            double novoSalario = salario + vintePorCentoDoSalario;
            System.out.println(("Salário antes do ajuste: R$" + salario));
            System.out.println("Aumento de 20%");
            System.out.println("Valor do Aumento: R$" + vintePorCentoDoSalario);
            System.out.print("Seu novo Salário é: R$" + novoSalario);
        } else if (maiorQueDuzentosEOitentaReaisEMenorQueSetecentosReais) {
            double quinzePorCento = 0.15;
            double quinzePorCentoDoSalario = salario * quinzePorCento;
            double novoSalario = salario + quinzePorCentoDoSalario;
            System.out.println(("Salário antes do ajuste: R$" + salario));
            System.out.println("Aumento de 15%");
            System.out.println("Valor do Aumento: R$" + quinzePorCentoDoSalario);
            System.out.print("Seu novo Salário é: R$" + novoSalario);
        } else if (maiorQueSetecentosReaisEMenorQueMilEQuinhentosReais) {
            double dezPorCento = 0.1;
            double dezPorCentoDoSalario = salario * dezPorCento;
            double novoSalario = salario + dezPorCentoDoSalario;
            System.out.println(("Salário antes do ajuste: R$" + salario));
            System.out.println("Aumento de 10%");
            System.out.println("Valor do Aumento: R$" + dezPorCentoDoSalario);
            System.out.print("Seu novo Salário é: R$" + novoSalario);
        } else {
            double cincoPorCento = 0.05;
            double cincoPorCentoDoSalario = salario * cincoPorCento;
            double novoSalario = salario + cincoPorCentoDoSalario;
            System.out.println(("Salário antes do ajuste: R$" + salario));
            System.out.println("Aumento de 5%");
            System.out.println("Valor do Aumento: R$" + cincoPorCentoDoSalario);
            System.out.print("Seu novo Salário é: R$" + novoSalario);
        }
    }
}