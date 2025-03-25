public class TesteCarro {

    public static void main(String[] args) {
        Carro cvic = new Carro("Honda", "CIVC", 2025);
        cvic.atualizarQuilometragem(1000.00);
        cvic.atualizarQuilometragem(1000.00);
        cvic.fazerRevisão();
        cvic.atualizarQuilometragem(1000.00);
        cvic.fazerRevisão();
    }

}
