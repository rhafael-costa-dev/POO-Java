import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GerarDadosAleatorios {

    // Lista de 100 nomes comuns no Brasil
    private static final List<String> NOMES = Arrays.asList(
            "Ana", "Maria", "João", "José", "Carlos", "Francisco", "Lucas", "Gabriel", "Rafael", "Pedro",
            "Fernanda", "Aline", "Patricia", "Juliana", "Roberta", "Renata", "Larissa", "Cláudia", "Beatriz", "Cíntia",
            "Ricardo", "Tiago", "Felipe", "Eduardo", "Vinícius", "Leonardo", "Igor", "André", "Samuel", "Thiago",
            "Amanda", "Bruna", "Carla", "Vanessa", "Sônia", "Luana", "Marta", "Elaine", "Letícia", "Tânia",
            "Mariana", "Cecília", "Lúcia", "Regina", "Luiz", "Gustavo", "Marcelo", "Alberto", "Diego", "Danilo",
            "Túlio", "Ricardo", "Arthur", "Fábio", "Guilherme", "Jorge", "Marcelo", "Tiago", "Elen", "Érika",
            "Vera", "Mário", "Rogério", "Simone", "Deborah", "Flávia", "Tânia", "Iris", "Jéssica", "Amanda",
            "Cristiane", "Luciana", "Kelly", "Márcia", "Érica", "Monique", "Débora", "Raquel", "Michele", "Daniele",
            "Kátia", "Verônica", "Edson", "Leonilda", "Marcelina", "Cristiano", "Larissa", "Sandro", "Marcos", "Jaqueline"
    );

    // Lista de 100 sobrenomes comuns no Brasil
    private static final List<String> SOBRENOMES = Arrays.asList(
            "Silva", "Santos", "Oliveira", "Souza", "Costa", "Pereira", "Almeida", "Rodrigues", "Nascimento", "Lima",
            "Gomes", "Martins", "Araujo", "Carvalho", "Ribeiro", "Barbosa", "Fernandes", "Pinto", "Melo", "Teixeira",
            "Silveira", "Andrade", "Campos", "Dantas", "Batista", "Vieira", "Maciel", "Machado", "Moreira", "Nascimento",
            "Cunha", "Dias", "Fonseca", "Borges", "Freitas", "Marques", "Guimarães", "Rezende", "Cardoso", "Faria",
            "Lopes", "Viana", "Figueiredo", "Campos", "Tavares", "Lima", "Sá", "Costa", "Zanetti", "Bastos",
            "Mendes", "Ramos", "Montenegro", "Franco", "Azevedo", "Peixoto", "Pimentel", "Santana", "Serrano", "Ribeiro",
            "Moura", "Corrêa", "Lima", "Queiroz", "Fagundes", "Chaves", "Mota", "Cavalcanti", "Paiva", "Gonçalves",
            "Araújo", "Siqueira", "Henrique", "Machado", "César", "Motta", "Pereira", "Fagundes", "Souza", "Soares",
            "Xavier", "Barros", "Pereira", "Nascimento", "Chaves", "Lins", "Brito", "Menezes", "Brandão", "Vasconcelos",
            "Rios", "Simões", "Miranda", "Lima", "Antunes", "Pereira", "Costa", "Monteiro", "Borges", "Santos"
    );

    public static Integer gerarIdade() {
        return new Random().nextInt(0, 120);
    }

    public static String gerarNomeCompleto() {
        Random random = new Random();
        String nome = NOMES.get(random.nextInt(NOMES.size()));
        String sobrenome = SOBRENOMES.get(random.nextInt(SOBRENOMES.size()));
        return String.format("%s %s", nome, sobrenome);
    }

}
