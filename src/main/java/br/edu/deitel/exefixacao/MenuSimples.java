package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("\nMenu");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Somar");
                    break;
                case 2:
                    System.out.println("Subtrair");
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);
        sc.close();
    }
}
