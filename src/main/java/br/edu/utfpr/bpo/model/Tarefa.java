package br.edu.utfpr.bpo.model;
import java.time.LocalDateTime;

public class Tarefa {
    private Long id;
    private String descricao;
    private LocalDateTime dataCriacao;
    private String status; // Enum para representar o status da tarefa (PENDENTE, EM ANDAMENTO, CONCLUIDA, ATRASADA, CANCELADA)

    public Tarefa(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
        this.status = "PENDENTE"; // Status inicial
    }
    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
