package funcionario;

import javax.xml.stream.events.Comment;
import java.util.List;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "111.111.111-11");
        Funcionario f2 = new Piloto("Manoel", "222.222.222-22", "AB:9887");
        Funcionario f3 = new ComissarioDeBordo("Mario", "111.111.111-11", List.of("Inglês", "Espanhol"));

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
    }
}
