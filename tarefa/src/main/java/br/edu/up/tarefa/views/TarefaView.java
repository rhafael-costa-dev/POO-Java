package br.edu.up.tarefa.views;

import br.edu.up.tarefa.controllers.TarefaController;
import br.edu.up.tarefa.enums.StatusTarefa;
import br.edu.up.tarefa.models.Desenvolvedor;
import br.edu.up.tarefa.models.Tarefa;
import br.edu.up.tarefa.utils.ProviderScanner;

public class TarefaView {

    private TarefaView() {
    }

    public static void iniciar() {
        var op = 9;
        do {
            exibirMenu();
            op = ProviderScanner.getScanner().nextInt();
            decisor(op);
        } while (op != 9);
    }

    private static void exibirMenu() {
        System.out.println("### MENU TAREFAS ###");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Remover");
        System.out.println("4 - Listar");
        System.out.println("5 - Buscar");
        System.out.println("9 - Voltar");
        System.out.print("Escolha uma opção: ");
    }

    private static void decisor(int op) {
        switch (op) {
            case 1:
                cadastrar();
                break;

            default:
                break;
        }
    }

    private static void cadastrar() {
        var scanner = ProviderScanner.getScanner();
        scanner.nextLine();

        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.println("Projeto: ");
        String projeto = scanner.nextLine();

        System.out.println("Prazo: ");
        String prazo = scanner.nextLine();

        var tarefa = new Tarefa(titulo,
                null,
                StatusTarefa.PENDENTE,
                projeto,
                new Desenvolvedor(usuario)
        );

        new TarefaController().cadastar(tarefa);
    }

}
