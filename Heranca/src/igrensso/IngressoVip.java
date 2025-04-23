package igrensso;

public class IngressoVip extends Ingresso {
    private Double valorAdicional;
    public IngressoVip() {
    }
    public IngressoVip(Double preco, Double valorAdicional) {
        super(preco);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        return "R$ " + (super.getPreco() + valorAdicional) ;
    }

}
