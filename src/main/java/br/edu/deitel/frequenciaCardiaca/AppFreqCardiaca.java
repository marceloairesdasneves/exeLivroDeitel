package br.edu.deitel.frequenciaCardiaca;

import br.edu.deitel.frequenciaCardiaca.model.HeartRates;

public class AppFreqCardiaca {
    public static void main(String[] args) {
        HeartRates hr = new HeartRates("Maria", "Silva", 15, 5, 1990);
        System.out.println("Nome: " + hr.getNome() + " " + hr.getSobrenome());
        System.out.println("Data de Nascimento: " + hr.getDia() + "/" + hr.getMes() + "/" + hr.getAno());
        System.out.println("Idade: " + hr.calcularIdadeAnos() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + hr.calcularFreqCardiacaMax() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + hr.calcularFreqCardiacaAlvo() + " bpm");
    }
}
