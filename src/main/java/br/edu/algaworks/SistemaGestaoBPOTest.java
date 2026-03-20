package br.edu.algaworks;

public class SistemaGestaoBPOTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("São Paulo", "Rua das Flores", "123", "Jardim Primavera");
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", endereco);
        Auditoria auditoria = new Auditoria();
        ContratoBPO contrato = new ContratoBPO(5000.0, cliente, 500.0);

        System.out.println("Status antes: " + contrato.getAprovado());
        auditoria.homologar(contrato);
        System.out.println("Status depois: " + contrato.getAprovado());
        //show me the city client
        System.out.println("Cliente: " + contrato.getCliente().getNome() + "Cidade: " + contrato.getCliente().getEndereco().getCidade());
        System.out.println("Valor do Contrato: " + contrato.getValor());
        contrato.imprimirResumo();

        System.out.println("=========================================\n");
        var c1 = new ContratoBPO(5000.0, cliente, 500.0);
        var c2 = new ContratoBPO(8000.0, cliente, 600.0);

        System.out.println("Protocolo C1: " + c1.getNumeroProtocolo());
        System.out.println("Protocolo C2: " + c2.getNumeroProtocolo());

    }
}
