package veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {
        Carro city = new Carro("Honda", "City", 2025, 4);
        Veiculo hb20 = new Carro("Hyndai", "Hb20s", 2025, 4);
        Veiculo moto = new Moto("Honda", "SG 150", 2020);

        city.exibirInformacoes();
        System.out.println("##############");
        hb20.exibirInformacoes();
        System.out.println("##############");
        moto.exibirInformacoes();
    }

}
