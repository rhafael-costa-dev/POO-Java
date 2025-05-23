package br.edu.up.tarefa.controllers;

import br.edu.up.tarefa.enums.StatusTarefa;
import br.edu.up.tarefa.models.Desenvolvedor;
import br.edu.up.tarefa.models.Tarefa;
import br.edu.up.tarefa.repositories.TarefaRepository;
import br.edu.up.tarefa.utils.ProviderScanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.List;


public class TarefaController {

    private static final Logger logger = LogManager.getLogger(TarefaController.class);
    private static final String FILE_NAME = "tarefas.txt";

    public void cadastar(Tarefa  tarefa) {
        new TarefaRepository().escrever(FILE_NAME, List.of(tarefa), true);
    }


}
