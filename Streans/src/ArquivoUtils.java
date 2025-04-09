import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtils {

    public static boolean criarDiretorio(File file) {
        var result = true;
        if (!file.exists()) {
            result = file.mkdir();
        }
        return result;
    }

    public static boolean criarArquivo(File file) throws IOException {
        var result = true;
        if (!file.exists()) {
            result = file.createNewFile();
        }
        return result;
    }

    public static boolean escrever(File file, Pessoa pessoa) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw =  new PrintWriter(fw);

        pw.println(String.format("%s; %d", pessoa.getNome(), pessoa.getIdade()));
        pw.close();
        fw.close();

        return true;
    }

    public static List<Pessoa> leitura(File file) throws IOException {
        if (!file.exists()) {
            return null;
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = "";
        List<Pessoa> pessoas = new ArrayList<>();
        while ( ( linha = bufferedReader.readLine() ) != null) {
            var dados = linha.split(";");
            var pessoa = new Pessoa(dados[0], Integer.parseInt(dados[1].trim()));

            pessoas.add(pessoa);
        }
        fileReader.close();
        bufferedReader.close();

        return pessoas;
    }
}
