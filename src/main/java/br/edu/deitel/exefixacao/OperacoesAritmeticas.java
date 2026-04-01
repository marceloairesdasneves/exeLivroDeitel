package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digita segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Soma = " +  (num1 + num2));
        System.out.println("Subtracao = " +  (num1 - num2));
        System.out.println("Multiplicacao = " +  (num1 * num2));
        System.out.println("Divisao = " + (double) (num1 / num2));
    }
}
