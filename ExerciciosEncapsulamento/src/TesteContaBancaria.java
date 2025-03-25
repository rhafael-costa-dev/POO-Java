public class TesteContaBancaria {

    public static void main(String[] args) {
        ContaBancaria cc = new ContaBancaria();

        System.out.println(cc.depositar(100.0));
        System.out.println(cc.depositar(-150.0));


        System.out.println(cc.getSaldo());

        System.out.println(cc.sacar(50.0));
        System.out.println(cc.sacar(1000.0));

        System.out.println(cc.getSaldo());
    }

}
