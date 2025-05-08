package jogo;

public abstract class Personagem {

    protected String nome;
    protected Double poder;

    public String getNome() {
        return nome;
    }

    public Personagem(String nome, Double poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public abstract boolean invocarDefesa(double ataque);
    public abstract double invocarAtaque();
}
