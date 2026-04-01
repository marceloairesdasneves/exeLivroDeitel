package br.edu.deitel.exefixacao;

import java.util.Scanner;

public class SeparacaoResponsabilidades {
        public static void main(String[] args) {
            System.out.println("Refaturando o codigo do calculo do area do circulo");

            double raio = leituraRaio();
            double area = calcularAreaCirculo(raio);
            saidaResultadoArea(area);

        }
        public static double leituraRaio(){
            Scanner sc = new Scanner(System.in);
            return sc.nextDouble();
        }
        public static double calcularAreaCirculo(double raio) {
            final double pi = 3.14;
            return pi * Math.pow(raio,2);
        }
        public static void saidaResultadoArea(double result) {
            System.out.printf("Area do circulo: %.2f%n", result);
        }
}
