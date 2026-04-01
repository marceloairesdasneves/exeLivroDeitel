package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class Constantes {
    public static void main(String[] args) {

        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do circulo: ");
        double raio = sc.nextDouble();//10.0;
        double areaCirculo = pi * raio * raio;
        System.out.printf("Area do circulo: %.2f%n", areaCirculo);
    }
}
