package br.edu.up.tarefa.views;

import br.edu.up.tarefa.utils.ProviderScanner;

public class PrincipalView {

    public static void inicio() {
        var op = 9;
        do {
            exibirMenu();
            op = ProviderScanner.getScanner().nextInt();

            decisor(op);
        } while (op != 9);
    }

    private static void exibirMenu() {
        System.out.println("### MENU PRINCIPAL ###");
        System.out.println("1 - Tarefas");
        System.out.println("2 - Usuários");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void decisor(int op) {
        switch (op) {
            case 1:
                TarefaView.iniciar();
                break;

            case 2:
                UsuarioView.iniciar();
                break;

            default:
                break;
        }
    }

}
