package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = teclado.next();
        boolean eVogal = letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U");
        if (eVogal){
            System.out.print("A letra é uma vogal.");
        }else{
            System.out.print("A letra é uma consoante.");
        }
    }
}