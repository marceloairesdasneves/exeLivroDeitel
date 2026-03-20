package br.edu.utfpr.bpo.view;
import br.edu.utfpr.bpo.service.GerenciadorTarefas; // Importamos o serviço
import br.edu.utfpr.bpo.model.Tarefa;
import java.util.Scanner;

public class MenuBPO {
    private final Scanner leitor = new Scanner(System.in);
    private final GerenciadorTarefas service = new GerenciadorTarefas();
    private long idContador = 1;

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n--- BPO MANAGER (Camadas) ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Relatório de Pendentes");
            System.out.println("3. Sair");

            try {
                opcao = Integer.parseInt(leitor.nextLine()); // Forma mais segura que nextInt()
                processarOpcao(opcao);
            } catch (Exception _) {
                System.out.println("❌ Entrada inválida!");
            }
        }
    }

    private void processarOpcao(int opcao) {
        if (opcao == 1) {
            System.out.print("Descrição: ");
            String desc = leitor.nextLine();
            service.adicionarTarefa(new Tarefa(idContador++, desc));
        } else if (opcao == 2) {
            service.exibirRelatorioPendentes();
        }
    }
}