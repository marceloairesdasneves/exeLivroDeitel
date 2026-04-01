package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class ConversaoTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor do tipo double: ");
        double vlDouble = sc.nextDouble();
        System.out.println("Converter o valor da variavel vlDouble para tipo int: ");
        int vlDoubleToInt = (int) vlDouble;
        System.out.println("Valor do tipo double: " + vlDouble);
        System.out.println("Valor do tipo int: " + vlDoubleToInt);
    }
}
