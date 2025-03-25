public class Carro {
    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Double quilometragem;
    public Carro(String marca, String modelo, Integer anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = 0.0;
    }

    public void trocarOleo() {
        System.out.println("Troca de óleo realizada com sucesso " +
                "nova troca deve ser realizada com " + (quilometragem + 2500) + "km");

    }
    public void fazerRevisão() {
        var message = String.format("Veiculo %s %s ano de fabricação %d com KM: %.2f",
                marca, modelo,anoFabricacao, quilometragem);
        System.out.println(message);

        if (quilometragem >= 2500) {
            trocarOleo();
        }

        System.out.println("Revisão realizada com sucesso");
    }
    public void atualizarQuilometragem(Double valor) {
        if (valor >= 0) {
            this.quilometragem += valor;
        }
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }
    public Double getQuilometragem() {
        return quilometragem;
    }
}
