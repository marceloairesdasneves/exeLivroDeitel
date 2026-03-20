package br.edu.utfpr.bpo.service;
import br.edu.utfpr.bpo.model.Tarefa;
import java.util.List;
import java.util.ArrayList;
public class GerenciadorTarefas implements  ServicoTarefa {
    private final List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }
    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
    }
    @Override
    public void exibirRelatorioPendentes(){
        if(this.tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("\nRelatório de Tarefas Pendentes:");
        for(Tarefa t: tarefas){
            if(t.getStatus().equalsIgnoreCase("PENDENTE")){
                System.out.println("ID: " + t.getId() + " | Desc: " + t.getDescricao() + " (Criada em: " + t.getDataCriacao() + ")");
            }
        }
    }
}