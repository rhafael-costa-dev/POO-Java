package pessoa;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println(String.format("Olá! Meu nome é %s tenho %d anos!", nome, idade));
    }
}
