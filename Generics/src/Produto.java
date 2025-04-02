public class Produto {
    private String nome;
    private Double preco;
    private Integer Quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        Quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Quantidade = quantidade;
    }
}
