package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 e veja seu correspondente nos dias da semana: ");
        double numero = scanner.nextDouble();
        byte domingo = 1;
        byte segunda = 2;
        byte terca = 3;
        byte quarta = 4;
        byte quinta = 5;
        byte sexta = 6;
        byte sabado = 7;
        boolean diaCorrespondenteDomingo = numero == domingo;
        boolean diaCorrespondenteSegunda = numero == segunda;
        boolean diaCorrespondenteTerca = numero == terca;
        boolean diaCorrespondenteQuarta = numero == quarta;
        boolean diaCorrepondenteQuinta = numero == quinta;
        boolean diaCorrepondenteSexta = numero == sexta;
        boolean diaCorrepondenteSabado = numero == sabado;
        if (diaCorrespondenteDomingo) {
            System.out.print("1 - Domingo");
        } else if  (diaCorrespondenteSegunda) {
            System.out.print("2 - Segunda-feira");
        } else if (diaCorrespondenteTerca) {
            System.out.print("3 - Terça-feira");
        } else if  (diaCorrespondenteQuarta) {
            System.out.print("4 - Quarta-feira");
        } else if (diaCorrepondenteQuinta) {
            System.out.print("5 - Quinta-feira");
        } else if  (diaCorrepondenteSexta) {
            System.out.print("6 - Sexta-feira");
        } else if (diaCorrepondenteSabado) {
            System.out.print("7 - Sábado");
        } else {
            System.out.print("Valor Inválido!");
        }
    }
}