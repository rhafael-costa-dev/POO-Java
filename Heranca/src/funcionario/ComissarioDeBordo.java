package funcionario;

import java.util.List;

public class ComissarioDeBordo extends Funcionario {

    private List<String> idiomas;

    public ComissarioDeBordo(String nome, String cpf, List<String> idiomas) {
        super(nome, cpf);
        this.idiomas = idiomas;
    }

    @Override
    public void exibirDados() {
        System.out.println(String.format("CPf: %s\nNome: %s\nIdiomas: %s", super.getCpf(), super.getNome(), this.idiomas));
    }

    public List<String> getIdiomas() {
        return idiomas;
    }
}
