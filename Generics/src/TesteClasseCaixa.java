public class TesteClasseCaixa {

    public static void main(String[] args) {
        var caixa = new Caixa<String>("Olá, Meu nome é Rhafael");
        var caixa2 = new Caixa<Double>(1500.00);

        System.out.println(caixa.getConteudo());
        System.out.println(caixa2.getConteudo());

        System.out.println(caixa.getConteudo().getClass());
    }

}
