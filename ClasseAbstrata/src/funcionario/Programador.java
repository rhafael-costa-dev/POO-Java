package funcionario;

public class Programador extends Funcionario {

    public Programador(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentarSalario() {
        var novoSalario = this.getSalario() * 1.20;
        setSalario(novoSalario);
    }
}
