package funcionario;

public class Funcionario {

    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println(String.format("CPF: %s\nNome: %s", cpf, nome));
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
