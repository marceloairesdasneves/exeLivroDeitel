package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class EntradaDadosBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do usuario: ");
        String nome = sc.nextLine();
        System.out.println("Digite o idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Usuario: " + nome + " Idade: " + idade);
        sc.close();
    }
}
