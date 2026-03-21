package br.edu.algaworks.service;

import br.edu.algaworks.model.Candidato;

public class RhService {
    public void alterarNomeCandidato(Candidato c, String novoNome){
        c.setNome(novoNome);
        System.out.println("Nome do candidato " + c.getCpf() + " alterado para " + c.getNome());
    }
}
