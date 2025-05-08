package conta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato da conta.Conta ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Data: "+sdf.format(date));

    }

}
