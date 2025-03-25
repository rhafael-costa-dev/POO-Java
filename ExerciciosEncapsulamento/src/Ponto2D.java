public class Ponto2D {

    private Double x;
    private Double y;

    public double[] obterCoordenadas() {
        return new double[]{x, y};
    }

    public void definirCoordenadas(Double x, Double y) {
        if (isCoordenadasValidas(x, y)) {
            this.x = x;
            this.y = y;
        }
    }

    private boolean isCoordenadasValidas(Double x, Double y) {
        return (!x.isNaN() || !x.isInfinite() || !y.isNaN() || y.isInfinite());
    }

}
