package br.edu.algaworks;

public class Auditoria {
    public void homologar(ContratoBPO contrato){
        if(contrato.getValor() > 0.0){
            contrato.setAprovado(true);
            System.out.println("Contrato ID: " + contrato.getId() + " APROVADO.");
        } else {
            contrato.setAprovado(false);
            System.out.println("Contrato ID: " + contrato.getId() + " REPROVADO.");
        }
    }
}
