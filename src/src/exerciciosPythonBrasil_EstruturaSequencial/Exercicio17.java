package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a área a ser pintada em metros quadrados: ");
        double areaASerPintada = scanner.nextDouble();
        byte coberturaDaTintaPorMetro = 6;
        double consumoPorLitro = areaASerPintada / coberturaDaTintaPorMetro;
        byte capacidadeLatasDeTinta = 18;
        double latasDeTinta = consumoPorLitro / capacidadeLatasDeTinta;
        double latasDeTintaArredondado = Math.ceil(latasDeTinta);
        byte valorLataDeTinta = 80;
        double precoLatasDeTinta = latasDeTintaArredondado * valorLataDeTinta;
        double capacidadeGalaoDeTinta = 3.6;
        double galoesDeTinta = consumoPorLitro / capacidadeGalaoDeTinta;
        double galoesDeTintaArredondado = Math.ceil(galoesDeTinta);
        byte valorGalaoDeTinta = 25;
        double precoGalaoDeTinta = galoesDeTintaArredondado * valorGalaoDeTinta;
        System.out.println("Quantidade de latas a serem compradas: " + latasDeTintaArredondado);
        System.out.println("Valor das latas de tinta: R$" + precoLatasDeTinta);
        System.out.println("Quantidade de galões de tinta a serem comprados: " + galoesDeTintaArredondado);
        System.out.println("Valor dos galões de tinta: R$" + precoGalaoDeTinta);
        double acrescimoDeDezPorCento = 1.1;
        byte rendimentoDaLata = 108;
        double areaASerPintadaComAcrescimoDeDezPorCento = areaASerPintada * acrescimoDeDezPorCento;
        double galoesComplementares = areaASerPintadaComAcrescimoDeDezPorCento % rendimentoDaLata;
        double latasDaMistura = areaASerPintadaComAcrescimoDeDezPorCento / rendimentoDaLata;
        double galoesDaMistura = galoesComplementares / capacidadeGalaoDeTinta;
        double latasDaMisturaArredondado = Math.floor(latasDaMistura);
        double galoesDaMisturaArredondado = Math.ceil(galoesDaMistura);
        double precoTesteLatas = latasDaMisturaArredondado * valorLataDeTinta;
        double precoTesteGaloes = galoesDaMisturaArredondado * valorGalaoDeTinta;
        double precoTesteTotal = precoTesteGaloes + precoTesteLatas;
        System.out.println("Se misturar latas e galões ficam " + latasDaMisturaArredondado + " " + "latas e" + " " + galoesDaMisturaArredondado + " " + "galões.");
        System.out.println("O preço pago misturando latas e galões (Com acréscimo de 10%) é de: R$" + precoTesteTotal);
        scanner.close();
    }
}