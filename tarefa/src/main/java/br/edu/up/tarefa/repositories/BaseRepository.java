package br.edu.up.tarefa.repositories;

import br.edu.up.tarefa.interfaces.Escrita;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class BaseRepository {
    private static final Logger logger = LogManager.getLogger(BaseRepository.class);

    public static void escrever(String fileName, List<Escrita> listaDados, boolean append) {
        logger.info("Iniciando a abertura do arquivo " + fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
            logger.info("Escrendo as informações no arquivo .txt");
            for (Escrita d : listaDados) {
                writer.write(d.dadoFormatado());
                writer.newLine();
            }
        } catch (IOException ex) {
            logger.error("Ocorreu um erro ao tentar salvar os dados da tarefa no arquivo.", ex);
        }
    }

}
