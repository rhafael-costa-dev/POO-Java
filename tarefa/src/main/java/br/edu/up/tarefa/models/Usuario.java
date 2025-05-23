package br.edu.up.tarefa.models;

import br.edu.up.tarefa.interfaces.Relatorio;

public abstract class Usuario implements Relatorio {
    protected String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
