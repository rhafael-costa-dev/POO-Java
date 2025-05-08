import jogo.Heroi;
import jogo.Inimigo;
import jogo.Monstro;
import jogo.Personagem;

public class TestePersonagem {

    public static void main(String[] args) {
        Personagem heroi = new Heroi("Capitão America", 100.00);
        Personagem mostro = new Monstro("Tanus", 98.00);
        Personagem inimigo = new Inimigo("Caveira V", 100.00);

        var result = heroi.invocarDefesa(inimigo.invocarAtaque());

        System.out.println(result);

    }

}
