package br.edu.up.tarefa.models;

import br.edu.up.tarefa.enums.StatusTarefa;

import java.time.LocalDate;

public abstract class TarefaBase {
    protected String titulo;
    protected LocalDate prazo;
    protected StatusTarefa status;
    public TarefaBase(String titulo, LocalDate prazo, StatusTarefa status) {
        this.titulo = titulo;
        this.prazo = prazo;
        this.status = status;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public abstract void executar();

}
