package br.edu.algaworks;
import java.util.Scanner;
import static java.lang.System.*;

public class ProcessarListasFaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        double valorFatura;
        boolean processa = true;
        while (processa) {
            double totalLote = 0.0;

            for (int contador = 1; contador <= 5; contador++) {
                out.print("Digite o nome do servico: ");
                int nomeServico = Integer.parseInt(sc.nextLine());
                switch (nomeServico){
                    case 1 -> out.println("BPO Financeiro");
                    case 2 -> out.println("BPO RH");
                    case 3 -> out.println("BPO Marketing");
                    case 4 -> out.println("BPO Vendas");
                    default -> out.println("Serviço Geral");
                }
                out.print("Digite o valor fatura " + contador + ": R$ ");
                valorFatura = Double.parseDouble(sc.nextLine());
                String msg = (valorFatura > 5000) ? "Fatura PREMIUM" : "Fatura Normal";
                if (valorFatura <= 0) {
                    out.println("Fatura inválida, pula para a próxima fatura");
                }else{
                    out.printf("Valor fatura: %d R$ %.2f %s \n\n", contador, valorFatura, msg);
                    out.println("---------------------------------------------");
                    totalLote += valorFatura;

                }
            }

            out.printf("Valor total do lote: R$ %.2f ", totalLote);
            String statusLote = (totalLote > 20000) ? "META ATINGIDA" : "META NÃO ATINGIDA";
            out.println("Status do lote: " + statusLote);

            out.println("\nDeseja continuar? (S/N)");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                processa = false;
            }
        }
        sc.close();
    }
}
