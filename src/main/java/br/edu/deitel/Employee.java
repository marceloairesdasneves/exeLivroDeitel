package br.edu.deitel;

public class Employee {
    //instance variable
    private String nome;
    private String sobreNome;
    private double salario;

    //construtor

    public Employee() {
        this.nome = "";
        this.sobreNome = "";
        this.salario = 0.0;
    }
    public Employee(String nome, String sobreNome, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario <= 0) {
            System.out.println("Invalid salary. Salary must be greater than zero.");
            return;
        }
        this.salario = salario;
    }
    public double getSalarioAnual(){
        return this.salario * 12;
    }
    public void aplicarAumento(double percentagem) {
        this.salario = this.salario + (this.salario * percentagem / 100);
    }
}//end class
