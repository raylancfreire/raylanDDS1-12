package src.exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Informe outro número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Informe mais um número: ");
        double terceiroNumero = scanner.nextDouble();
        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero && segundoNumero < terceiroNumero) {
            System.out.print("Os números informados em ordem decrescente são: " + terceiroNumero + ", " + segundoNumero + "e " + primeiroNumero);
        }else if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero){
            System.out.print("Os números informados em ordem decrescente são: " + primeiroNumero + ", " + segundoNumero + "e " + terceiroNumero);
        }else if(segundoNumero < terceiroNumero && primeiroNumero > terceiroNumero){
            System.out.print("Os números informados em ordem decrescente são: " + primeiroNumero + ", " + terceiroNumero + "e " + segundoNumero);
        }else if(segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero){
            System.out.print("Os números informados em ordem decrescente são: " + segundoNumero + ", " + terceiroNumero + "e " + primeiroNumero);
        }else if(terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero && primeiroNumero < segundoNumero){
            System.out.print("Os números informados em ordem decrescente são: " + segundoNumero + ", " + primeiroNumero + "e " + terceiroNumero);
        }else{
            System.out.print("Os números informados em ordem decrescente são: " + terceiroNumero + ", " + primeiroNumero + "e " + segundoNumero);
        }
    }
}