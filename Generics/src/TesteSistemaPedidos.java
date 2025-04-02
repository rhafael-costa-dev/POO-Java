public class TesteSistemaPedidos {

    public static void main(String[] args) {
        var p1 = new Produto("Chocolate", 3.50, 5);
        var p2 = new Produto("Leite", 6.99, 1);

        var pedido1 = new Pedido();
        pedido1.addProduto(p1);
        pedido1.addProduto(p2);

        double valor = pedido1.calcularValorTotal();
        System.out.println("total do Pedido: " + valor);

        var cliente1 = new Cliente("Jose", "854878");
        cliente1.addPedido(pedido1);


    }
}
