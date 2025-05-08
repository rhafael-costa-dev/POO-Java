package jogo;

public class Inimigo extends Personagem {

    public Inimigo(String nome, Double poder) {
        super(nome, poder);
    }

    @Override
    public boolean invocarDefesa(double ataque) {
        var defesa = Math.random() * poder;
        System.out.println("Defesa: " + defesa);
        return defesa > ataque;
    }

    @Override
    public double invocarAtaque() {
        var ataque =  Math.random() * poder;
        System.out.println("Ataque: " + ataque);
        return ataque;
    }
}
