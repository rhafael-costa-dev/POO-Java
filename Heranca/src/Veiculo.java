public class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Método Classe Veiculo");
        System.out.println(String.format("Marca: %s\nModelo: %s\nAno: %d", marca, modelo, ano));
    }
}
