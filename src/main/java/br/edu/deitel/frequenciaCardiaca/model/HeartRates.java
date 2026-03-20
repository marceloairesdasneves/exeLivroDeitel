package br.edu.deitel.frequenciaCardiaca.model;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private final int anoAtual;

    public HeartRates(String nome, String sobrenome, int dia) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.anoAtual = java.time.Year.now().getValue();
    }
    public HeartRates() {
        this("", "", 0);
    }
   //method get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano > anoAtual){
            System.out.println("Ano de nascimento não pode ser maior que o ano atual.");
        }else{
            this.ano = ano;
        }

    }
    public int calcularIdadeAnos(){
        int anoNasc = this.ano;
        return anoAtual - anoNasc;
    }
    public int calcularFreqCardiacaMax(){
        final int frequencia = 220;
        return frequencia - calcularIdadeAnos();
    }
    public String calcularFreqCardiacaAlvo(){
        int freqCardiacaMax = calcularFreqCardiacaMax();
        double freqCardiacaAlvoMin = freqCardiacaMax * 0.5;
        double freqCardiacaAlvoMax = freqCardiacaMax * 0.85;
        return String.format("%.0f - %.0f", freqCardiacaAlvoMin, freqCardiacaAlvoMax);
    }
}//endclass
