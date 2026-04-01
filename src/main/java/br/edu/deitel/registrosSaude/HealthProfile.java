package br.edu.deitel.registrosSaude;


public class HealthProfile {
    private String nome;
    private String sobrenome;
    private char sexo;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private double peso;
    private double altura;

    public HealthProfile(String nome, String sobrenome, char sexo, int diaNasc, int mesNasc,
                         int anoNasc, double peso, double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIdade(){
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - getAnoNasc();
    }
    public int frequenciaCardiacaMax(){
        return 220 - calcularIdade();
    }
    public double frequenciaCardiacaAlvoMax(){
        return frequenciaCardiacaMax() * 0.85;
    }
    public double frequenciaCardiacaAlvoMin(){
        return frequenciaCardiacaMax() * 0.50;
    }
    public double calcularIMC(){
        return this.peso / (this.altura * this.altura);
    }

    public void setAnoNasc(int ano) {
        this.anoNasc = ano;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }
}//end class
