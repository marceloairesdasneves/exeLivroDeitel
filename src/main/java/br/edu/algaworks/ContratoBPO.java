package br.edu.algaworks;

public final class ContratoBPO {
    private int id;
    private double valor;
    private Cliente cliente;
    private double serviceTax = 0.0;
    private boolean aprovado = false;
    private static int contadorGeral = 1000;
    private final int numeroProtocolo;

    public ContratoBPO(double valor, Cliente cliente, double serviceTax) {
        this.valor = valor;
        this.cliente = cliente;
        this.serviceTax = serviceTax;
        this.numeroProtocolo = contadorGeral++;
    }
    //public ContratoBPO(int id, double valor, Cliente cliente, double serviceTax, boolean aprovado,  int numeroProtocolo) {
        //this.id = id;
        //this.valor = valor;
        //this.cliente = cliente;
        //this.serviceTax = serviceTax;
        //this.aprovado = aprovado;
        //this.numeroProtocolo = numeroProtocolo;
    //}
    //specific method
    public final double calcularLucro(double serviceTax) {
        return (valor - serviceTax) * 0.90;
    }
    public double calcularLucro() {
        return  calcularLucro(500);
    }
    public void imprimirResumo(){
        final double lucro = calcularLucro(this.serviceTax);
        System.out.println("Contrato ID: " + id);
        System.out.println("Valor do Contrato: " + valor);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Lucro Estimado: " + lucro);
        System.out.println("Status: " + (aprovado ? "APROVADO" : "REPROVADO"));
    }

    //method Getters and Setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getServiceTax() {
        return serviceTax;
    }
    public void setServiceTax(double serviceTax) {
        this.serviceTax = serviceTax;
    }
    public boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getNumeroProtocolo() {
        return numeroProtocolo;
    }
    public void setNumeroProtocolo(int numeroProtocolo) {
        this.setNumeroProtocolo(numeroProtocolo);
    }

}//End class
