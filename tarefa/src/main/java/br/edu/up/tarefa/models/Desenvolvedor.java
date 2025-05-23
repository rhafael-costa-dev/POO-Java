package br.edu.up.tarefa.models;

public class Desenvolvedor extends Usuario {

    public Desenvolvedor(String nome) {
        super(nome);
    }

    @Override
    public String gerarRelatorio() {
        return null;
    }
}
