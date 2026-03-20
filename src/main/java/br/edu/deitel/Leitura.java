package br.edu.deitel;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        String nome;
        int codigo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu codigo:");
        codigo = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println("O codigo digitado foi: " + codigo);
        System.out.println("O nome digitado foi: " + nome);
    }
}
