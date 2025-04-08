import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteNomeAleatorios {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File dir = new File("c:\\positivo");
        File arq = new File(dir, "sistema-alunos.csv");

        var resultDir = ArquivoUtils.criarDiretorio(dir);
        System.out.println("Diretorio foi criado? " + resultDir);

        var resultArq =  ArquivoUtils.criarArquivo(arq);
        System.out.println("Arquivo foi criado? " + resultArq);

        System.out.println("Necessário definir o número de alunos a serem criado!");
        System.out.print("Informa a quantidade de alunos: ");
        var qtd =  scanner.nextInt();

        for (int i = 0; i < qtd; i++) {
            var idade = GerarDadosAleatorios.gerarIdade();
            var nome = GerarDadosAleatorios.gerarNomeCompleto();

            var pessoa = new Pessoa(nome, idade);

            ArquivoUtils.escrever(arq, pessoa);
        }

    }



}
