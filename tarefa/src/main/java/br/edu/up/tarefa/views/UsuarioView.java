package br.edu.up.tarefa.views;

import br.edu.up.tarefa.utils.ProviderScanner;

public class UsuarioView {

    public static void iniciar() {
        var op = 9;
        do {
            exibirMenu();
            op = ProviderScanner.getScanner().nextInt();

        } while (op != 9);
    }

    private static void exibirMenu() {
        System.out.println("### MENU USUÁRIO ###");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Remover");
        System.out.println("4 - Listar");
        System.out.println("5 - Buscar");
        System.out.println("9 - Voltar");
    }
}
