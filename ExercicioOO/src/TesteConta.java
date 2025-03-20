import java.time.LocalDate;

public class TesteConta {

    public static void main(String[] args) {
        // Criando a Conta Aluno e atribuindo valores
        Conta contaAluno = new Conta();
        contaAluno.name = "João";
        contaAluno.numero = 33658;
        contaAluno.agencia = 9999;
        contaAluno.saldo = 0.0;
        contaAluno.dataCriacao = LocalDate.now();

        // Criando a Conta Professor e atribuindo valores
        Conta contaProfessor = new Conta();
        contaProfessor.name = "Ana";
        contaProfessor.numero = 33658;
        contaProfessor.agencia = 9999;
        contaProfessor.saldo = 0.0;
        contaProfessor.dataCriacao = LocalDate.now();

        // Criando a Conta Terceiro com base na conta de aluno
        Conta contaTerceiro = contaAluno;

        // Alterando o nome do aluno
        contaAluno.name = "Ana";

        // Testando os métodos da classe conta
        contaAluno.depositar(110.00);
        contaAluno.sacar(10.00);
        contaAluno.calcularRendimento();
        System.out.println(contaAluno.recuperarDadosParaImpressao());
        System.out.println(contaTerceiro.recuperarDadosParaImpressao());

        // Comparando usando ==
        if (contaAluno == contaTerceiro) {
            System.out.println("SIM são iguais");
        } else {
            System.out.println("NÃO são iguais");
        }

        if (contaAluno.equals(contaProfessor)) {
            System.out.println("SIM são iguais");
        } else {
            System.out.println("NÃO são iguais");
        }


    }

}
