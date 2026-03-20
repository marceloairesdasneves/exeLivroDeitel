package br.edu.algaworks.controller;

import br.edu.algaworks.model.Candidato;
import br.edu.algaworks.service.CandidatoService;

public class RecrutadorBPO {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Joao da Silva", "123.456.789-00", "teste@teste.com.br","0002");
        CandidatoService candidatoService = new CandidatoService();
        candidatoService.incluirCandidato(candidato1);

    }
}
