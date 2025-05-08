package funcionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentarSalario() {
        var novoSalario = this.getSalario() * 1.10;
        setSalario(novoSalario);
    }
}
