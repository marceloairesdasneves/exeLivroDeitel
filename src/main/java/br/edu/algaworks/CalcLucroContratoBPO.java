package br.edu.algaworks;
import java.util.Scanner;

public class CalcLucroContratoBPO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //exemplo de entrada de dados para o cálculo do lucro do contrato BPO
        System.out.print("Digite o valor do contrato BPO: ");
        double valorContrato = Double.parseDouble(sc.nextLine());   //10000.00 Valor do contrato BPO
        System.out.print("Digite o custo operacional do contrato BPO: ");
        double custoOperacional = Double.parseDouble(sc.nextLine()); //7000 Custo operacional de 70% do valor do contrato
        System.out.print("Digite a margem de lucro do contrato BPO: ");
        double margemLucro = (Double.parseDouble(sc.nextLine()))/100; //0.20 Margem de lucro de 20%
        System.out.print("Quantidade de sócios: "); //3 Sócios
        int socios = Integer.parseInt(sc.nextLine());
        // Cálculo do lucro do contrato BPO dividido entre os sócios
        double resultadoLucro = ((valorContrato - custoOperacional) * margemLucro / socios); //600.00
        // Exibição do resultado do lucro do contrato BPO para cada sócio
        System.out.println("\n=== RESUMO DA OPERAÇÃO DO CONTRATO BPO ===");
        System.out.printf("Valor Bruto: \tR$ %.2f \nCusto Op:\t\tR$ %.2f \n------------------------\nLUCRO POR SOCIO R$: %.2f", valorContrato, custoOperacional,resultadoLucro);
    }
}
