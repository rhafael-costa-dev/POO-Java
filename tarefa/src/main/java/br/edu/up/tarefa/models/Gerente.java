package br.edu.up.tarefa.models;

public class Gerente extends Usuario {

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public String gerarRelatorio() {
        return null;
    }
}
