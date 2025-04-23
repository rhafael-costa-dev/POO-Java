package pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        var pessoa = new Pessoa("Jose", 25);
        var aluno = new Aluno("Anna", 20, "123456");
        var professor = new Professor("Rhafael", 38, 1000.00, "Java");

        apresentar(pessoa);
        apresentar(aluno);
        apresentar(professor);
    }

    private static void apresentar (Pessoa p) {
        p.apresentar();
        System.out.println("###########");
    }

}
