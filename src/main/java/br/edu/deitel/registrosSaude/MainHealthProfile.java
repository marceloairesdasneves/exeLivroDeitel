package br.edu.deitel.registrosSaude;

import java.util.Scanner;

public class MainHealthProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Registro de Saúde!");
        System.out.println("Por favor, insira as seguintes informações:");
        System.out.println("---------------------------------------------");

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Sexo (M/F):");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Dia de Nascimento:");
        int dia = scanner.nextInt();

        System.out.println("Mês de Nascimento:");
        int mes = scanner.nextInt();

        System.out.println("Ano de Nascimento:");
        int ano = scanner.nextInt();

        System.out.println("Altura:");
        double altura = scanner.nextDouble();

        System.out.println("Peso:");
        double peso = scanner.nextDouble();

        HealthProfile hr = new HealthProfile(
                nome, sobrenome, sexo,
                dia, mes, ano,
                peso, altura
        );

        System.out.println("---------------------------------------------");
        System.out.println("Perfil de Saúde de " + hr.getNome() + " " + hr.getSobrenome());
        System.out.println("Sexo: " + hr.getSexo());
        System.out.printf("Data de Nascimento: %02d/%02d/%d%n", dia, mes, ano);
        System.out.println("Idade: " +  hr.calcularIdade());
        System.out.println("Frequência Cardíaca Maxima: " + hr.frequenciaCardiacaMax());
        System.out.printf("Intervalo de Frequência Cardíaca Alvo: %.0f - %.0f bpm%n",
                hr.frequenciaCardiacaAlvoMin(),
                hr.frequenciaCardiacaAlvoMax());

        System.out.println("---------------------------------------------");
        System.out.println("Classificação do IMC: \n Menos de 18.5 Abaixo do peso \n 18.5 – 24.9 Peso normal \n " +
                "25.0 – 29.9 Sobrepeso \n 30.0 ou mais Obesidade");
        System.out.println("---------------------------------------------");

        System.out.printf("%nIMC: %.2f " , hr.calcularIMC());
        scanner.close();
    }
}
