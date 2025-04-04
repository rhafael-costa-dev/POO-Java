import java.io.*;
import java.util.Scanner;

public class TesteLivro {
    private static final String SEPARADOR = ";";
    public static void main(String[] args) throws IOException {
        var arq = criarEstrutura();
        System.out.println(arq);;
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("### MENU ###");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Imprimir Livro");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            op = scanner.nextInt();

            if (op == 1) {
                var livro = criarNovoLivro(scanner);
                cadastraLivro(arq, livro);
            } else if (op == 2) {
                imprimirLivros(arq);2

            }

        } while (op != 0);
    }

    private static void imprimirLivros(String arq) throws IOException {
        // Fazendo a leitura dos dados do arquivo
        FileReader fileReader = new FileReader(arq);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha;

        while ( (linha = bufferedReader.readLine()) != null) {
            Livro livro = new Livro();
            livro.parse(linha);
            System.out.println(livro);
        }
    }

    private static void cadastraLivro(String arq, Livro livro) throws IOException {
        FileWriter fw = new FileWriter(arq, true);
        PrintWriter pw = new PrintWriter(fw);

        System.out.println(System.lineSeparator());

        pw.write(livro.getISBN().toString());
        pw.write(SEPARADOR);
        pw.write(livro.getTitulo());
        pw.write(SEPARADOR);
        pw.write(livro.getAutor());
        pw.write(SEPARADOR);
        pw.write(livro.getGenero());
        pw.write(SEPARADOR);
        pw.println(livro.getNumeroPaginas().toString());

        pw.close();
    }

    private static String criarEstrutura() throws IOException {
        File dir = new File("c:\\livros");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File arq = new File(dir, "informacoes.txt");
        if (!arq.exists()) {
            arq.createNewFile();
        }

        return arq.getAbsolutePath();
    }

    private static Livro criarNovoLivro(Scanner scanner) {
        Livro livro =  new Livro();
        System.out.print("ISBN: ");
        livro.setISBN(scanner.nextLong());

        scanner.nextLine();

        System.out.print("Titulo: ");
        livro.setTitulo(scanner.nextLine());

        System.out.print("Autor: ");
        livro.setAutor(scanner.nextLine());

        System.out.print("Gênero: ");
        livro.setGenero(scanner.nextLine());

        System.out.print("Número de Paginas: ");
        livro.setNumeroPaginas(scanner.nextInt());

        return livro;
    }

}
