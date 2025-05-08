public class TestaConta {

    public static void main(String[] args) {
        ContaPoupanca c = new ContaPoupanca();
        c.setSaldo(1000.00);
        imprimir(c);

        ContaCorrente c1 = new ContaCorrente();
        c1.setSaldo(1200.00);
        imprimir(c1);
    }

    private static void imprimir(Conta cp) {
        cp.imprimirExtrato();
    }

}
