package br.edu.algaworks.model;
public class Candidato {
    private String nome;
    private String cpf;
    private String email;
    private String curriculo;

    public Candidato(){
        nome = "";
        cpf = "";
        email = "";
        curriculo = "";
    }
    public Candidato(String nome, String cpf, String email, String curriculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curriculo = curriculo;

    }
    //specific method
    public void alterarEmail(){}
    public void vincularCurriculo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
}
