package com.example.project_manager_ddd.domain;

public enum Status {
    NEW("novo"),
    ACTIVE("ativo"),
    FINISHED("finalizado");

    private final String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
