package funcionario;

public class Piloto extends Funcionario {

    private String licensa;

    public Piloto(String nome, String cpf, String licensa) {
        super(nome, cpf);
        this.licensa = licensa;
    }

    @Override
    public void exibirDados() {
        System.out.println(String.format("CPf: %s\nNome: %s\nLicensa: %s", super.getCpf(), super.getNome(), this.licensa));
    }

    public String getLicensa() {
        return licensa;
    }
}
