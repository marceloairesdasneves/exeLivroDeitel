package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class ValidacoesSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num1 = sc.nextInt();
        if (num1 < 0){
            System.out.println("Numero negativo, ERRO!");
        } else if (num1 == 0) {
            System.out.println("Numero e Zero!");
        }else {
            System.out.println("Numero  positivo!");
        }

    }
}
