import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
}
