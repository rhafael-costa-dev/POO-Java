package veiculo;

public class Carro extends Veiculo {

    private Integer portas;

    public Carro() { }
    public Carro(String marca, String modelo, Integer ano, Integer portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }
    public Integer getPortas() {
        return portas;
    }
    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(
                String.format("Marca: %s\nModelo: %s\nAno: %d\nNro Portas: %d",
                        super.getMarca(),
                        super.getModelo(),
                        super.getAno(),
                        this.portas));
    }
}
