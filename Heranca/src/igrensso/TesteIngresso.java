package igrensso;

public class TesteIngresso {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.00);
        IngressoVip vip = new IngressoVip(50.00, 30.00);

        System.out.println(ingresso);
        System.out.println(vip);
    }

}
