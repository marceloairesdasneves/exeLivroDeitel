package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class MiniCliFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o salario: ");
        double salario = sc.nextDouble();
        double salarioAnual = salario * 12;
        System.out.printf("Usuario: %s Idade: %d Salario Mensal: %.2f Salario Anual: %.2f", nome, idade, salario, salarioAnual );

        sc.close();
    }
}
