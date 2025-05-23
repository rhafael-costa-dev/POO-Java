package br.edu.up.tarefa.models;

import br.edu.up.tarefa.enums.StatusTarefa;
import br.edu.up.tarefa.interfaces.Escrita;

import java.time.LocalDate;

public class Tarefa extends TarefaBase implements Escrita {
    private String projeto;
    private Usuario responsavel;

    public Tarefa(String titulo, LocalDate prazo, StatusTarefa status, String projeto, Usuario responsavel) {
        super(titulo, prazo, status);
        this.projeto = projeto;
        this.responsavel = responsavel;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void executar() {
        if (StatusTarefa.PENDENTE.equals(status)) {
            System.out.println("Mudando o status da tarefa "+ titulo + " para " + StatusTarefa.EM_ANDAMENTO);
            this.status = StatusTarefa.EM_ANDAMENTO;
        } else if (StatusTarefa.EM_ANDAMENTO.equals(status)){
            System.out.println("Mudando o status da tarefa "+ titulo + " para " + StatusTarefa.CONCLUIDO);
            this.status = StatusTarefa.CONCLUIDO;
        }

    }

    @Override
    public String dadoFormatado() {
        return this.titulo+";"+
                this.projeto+";"+
                this.responsavel.getNome()+";"+
                this.projeto+";"+
                this.status;
    }
}
