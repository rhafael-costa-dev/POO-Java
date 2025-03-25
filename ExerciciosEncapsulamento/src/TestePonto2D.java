public class TestePonto2D {

    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D();
        ponto.definirCoordenadas(10.0, 12.0);

        for (double valor : ponto.obterCoordenadas()) {
            System.out.println(valor);
        }
    }
}
