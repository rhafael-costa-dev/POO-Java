import java.io.*;

public class Teste {

    public static void main(String[] args) throws IOException {
        // Propriedades
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("file.separator"));

        File dir = new File("C:\\Java");
        // verifica se o diretorio existe
        if (!dir.exists()) {
            System.out.println("Criando diretorio " + dir.getName());
            // cria o diretorio
            var result = dir.mkdir();
        }

        File file = new File(dir, "dados.txt");
        // verifica se o arquivo existe
        if (!file.exists()) {
            System.out.println("Criando arquivo " + file.getName());
            // cria o arquivo
            var result = file.createNewFile();
        }

        // Escrevendo informações no arquivo
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.println("Iniciando a escrita dos dados");
        for (int i = 1; i < 11; i++) {
            printWriter.println(String.format("Linha %d ", i));
        }
        printWriter.close();
        System.out.println("Escrita dos dados realizada com sucesso");

        // Fazendo a leitura dos dados do arquivo
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha;
        while ( (linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }

        /*
        TODO: Renomeando o nome de um arquivo
        File file2 = new File(dir, "Banana.txt");
        var r = file.renameTo(file2);

        TODO: Apaga diretorios ou Arquivos
        System.out.println(file.delete());
        System.out.println(file2.delete());
        System.out.println(dir.delete());

        TODO: Lista todos os arquivos (Dir ou File) de um endereço
        File all = new File("C:\\");
        for(File f : all.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f.getName() + " é um DIR");
                continue;
            }
            System.out.println(f.getName() + " é um FILE");
        }
        */

    }

}
