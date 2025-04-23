package igrensso;

public class Ingresso {

    private Double preco;

    public Ingresso () {
    }

    public Ingresso(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "R$ " + preco;
    }
}
