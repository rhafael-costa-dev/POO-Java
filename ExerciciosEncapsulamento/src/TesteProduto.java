public class TesteProduto {

    public static void main(String[] args) {
        Produto produto =  new Produto("Maça", 1.25, 10);

        imprimir(produto);
        System.out.println("########################");
        produto.setPreco(-2.50);
        produto.setQuantidadeEmEstoque(-1);

        imprimir(produto);
        System.out.println("########################");

        produto.setPreco(3.85);
        produto.setQuantidadeEmEstoque(20);

        imprimir(produto);
        System.out.println("########################");
    }

    private static void imprimir(Produto p) {
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Qtd: " + p.getQuantidadeEmEstoque());
    }
}
