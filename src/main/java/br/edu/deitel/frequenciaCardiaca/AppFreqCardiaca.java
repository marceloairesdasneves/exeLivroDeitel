package br.edu.deitel.frequenciaCardiaca;

import br.edu.deitel.frequenciaCardiaca.model.HeartRates;
import java.util.Scanner;

public class AppFreqCardiaca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRates hr = new HeartRates();
        System.out.print("Digite o nome: ");
        hr.setNome(input.nextLine());
        System.out.print("Digite o sobrenome: ");
        hr.setSobrenome(input.nextLine());
        System.out.print("Digite o dia de nascimento: ");
        hr.setDia(Integer.parseInt(input.nextLine()));
        System.out.print("Digite o mês de nascimento: ");
        hr.setMes(Integer.parseInt(input.nextLine()));
        System.out.print("Digite o ano de nascimento: ");
        hr.setAno(Integer.parseInt(input.nextLine()));
        System.out.println("Nome: " + hr.getNome() + " " + hr.getSobrenome());
        System.out.println("Data de Nascimento: " + hr.getDia() + "/" + hr.getMes() + "/" + hr.getAno());
        System.out.println("Idade: " + hr.calcularIdadeAnos() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + hr.calcularFreqCardiacaMax() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + hr.calcularFreqCardiacaAlvo() + " bpm");
        input.close();
    }
}
