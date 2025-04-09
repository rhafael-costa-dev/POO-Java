import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TesteOrdenacao {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File dir = new File("c:\\positivo");
        File arq = new File(dir, "sistema-alunos.csv");

        int op;
        do {
            System.out.println("Seleciona a forma de ordenação dos dados!");
            System.out.println("1 - Ordenação por nome");
            System.out.println("2 - Ordenação por idade");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
        } while (op < 1 || op > 3);

        File newArq;
        var pessoas = ArquivoUtils.leitura(arq);
        var time = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        switch (op) {
            case 1:
                newArq = new File(dir, time + "-alunos-sort-by-name.csv");
                Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
                escrever(newArq, pessoas);
                break;
            case 2:
                newArq = new File(dir, time + "-alunos-sort-by-idade.csv");
                Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
                escrever(newArq, pessoas);
                break;
        }

    }

    private static void escrever(File arq, List<Pessoa> pessoas) throws IOException {
        for (Pessoa pessoa : pessoas) {
            ArquivoUtils.escrever(arq, pessoa);
        }
    }

}
