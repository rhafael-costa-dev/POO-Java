package br.edu.up.tarefa.utils;

import java.util.Scanner;

public class ProviderScanner {
    private static final Scanner scanner = new Scanner(System.in);
    private ProviderScanner() { }

    public static Scanner getScanner() {
        return scanner;
    }

}
