import java.util.ArrayList;
import java.util.List;

public class Pedido {

    List<Produto> produtos;

    public Pedido() {
        produtos =  new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularValorTotal() {
        double valor = 0.0;
        for (Produto p : produtos) {
            valor += p.getPreco() * p.getQuantidade();
        }
        return valor;
    }

}
