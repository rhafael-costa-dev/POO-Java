public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setName("João");
        p.setIdade(10);
        p.setGenero("masculino");

        imprimir(p);

        p.setIdade(-10);
        p.setGenero("não-binário");

        imprimir(p);
    }

    private static void imprimir(Pessoa p) {
        System.out.println("Nome: " + p.getName());
        System.out.println("Idade:" + p.getIdade());
        System.out.println("Genero: " + p.getGenero());
        System.out.println();
    }
}
