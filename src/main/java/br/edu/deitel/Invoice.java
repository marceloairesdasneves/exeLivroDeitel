package br.edu.deitel;
public class Invoice {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;
    //Construtor
    public Invoice(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }
    //metodos getters and setters
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
       this.quantidade = Math.max(0, quantidade);
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = Math.max(0.0, preco);
    }
    //metodo calculo o valor da fatura
    public double getInvoiceAmount() {
        return preco * quantidade;
    }
}//end class
