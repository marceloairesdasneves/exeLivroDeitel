package br.edu.utfpr.bpo.service;

import br.edu.utfpr.bpo.model.Tarefa;

public interface ServicoTarefa {
    void adicionarTarefa(Tarefa tarefa);
    void exibirRelatorioPendentes();
}
