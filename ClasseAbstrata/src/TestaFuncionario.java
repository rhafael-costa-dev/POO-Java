import funcionario.Funcionario;
import funcionario.Gerente;
import funcionario.Programador;

public class TestaFuncionario {

    public static void main(String[] args) {
        var gerente = new Gerente("João", 1000.00);
        var programador = new Programador("Anna", 1000.00);

        System.out.println("### Gerente");
        gerarResultado(gerente);
        System.out.println("### Programador");
        gerarResultado(programador);

    }

    private static void gerarResultado(Funcionario f) {
        System.out.println(f.getNome() + " - R$: " + f.getSalario());
        f.aumentarSalario();
        System.out.println(f.getSalario());
    }

}
