package br.edu.algaworks.controller;

import br.edu.algaworks.model.Candidato;
import br.edu.algaworks.service.CandidatoService;
import br.edu.algaworks.service.RhService;

public class RecrutadorBPO {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Joao da Silva", "123.456.789-00", "teste@teste.com.br","0002");
        Candidato candidato2 = new Candidato("Maria da Silva", "122.452.782-02", "testemaria@teste.com.br","0003");

        CandidatoService candidatoService = new CandidatoService();
        candidatoService.incluirCandidato(candidato1);
        candidatoService.incluirCandidato(candidato2);
        RhService rhService = new RhService();
        rhService.alterarNomeCandidato(candidato1, "Joao da Silva Junior");
    }
}
