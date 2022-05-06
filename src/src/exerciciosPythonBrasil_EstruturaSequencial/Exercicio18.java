package src.exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoDoArquivo = scanner.nextDouble();
        System.out.print("Informe a velocidade do Link de Internet em Mbps: ");
        double velocidadeDoLinkDeInternet = scanner.nextDouble();
        byte fatorDeConversaoEmSegundos = 8;
        double velocidadeDoLinkDeInternetEmSegundos = velocidadeDoLinkDeInternet / fatorDeConversaoEmSegundos;
        double tempoAproximadoDeDownloadEmSegundos = tamanhoDoArquivo / velocidadeDoLinkDeInternetEmSegundos;
        byte fatorDeConversaoEmMinutos = 60;
        double tempoAproximadoDeDownloadEmMinutos = tempoAproximadoDeDownloadEmSegundos / fatorDeConversaoEmMinutos;
        System.out.print("O tempo aproximado de Download é de: " + tempoAproximadoDeDownloadEmMinutos + " minutos.");
        scanner.close();
    }
}