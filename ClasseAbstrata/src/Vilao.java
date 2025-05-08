import jogo.Personagem;

public class Vilao extends Personagem {

    public Vilao(String nome, Double poder) {
        super(nome, poder);
    }

    @Override
    public boolean invocarDefesa(double ataque) {
        getNome();
        return false;
    }

    @Override
    public double invocarAtaque() {
        return 0;
    }
}
