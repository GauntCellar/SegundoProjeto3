package Rascunhos;

import java.util.Scanner;

public class Tarefa {

    public static void main(String[] args) {
        // Declaração de variáveis
        String nome, sexo, paisOrigem, paisDestino;
        int idade;

        Scanner read = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite seu nome: ");
        nome = read.next();
        System.out.println("Digite seu sexo: ");
        sexo = read.next();
        System.out.println("Digite seu país de origem: ");
        paisOrigem = read.next();
        System.out.println("Digite o país de destino: ");
        paisDestino = read.next();

        System.out.println("Digite sua idade: ");
        idade = read.nextInt();

        // Processamento e saída de dados
        if (idade >= 18 || !paisOrigem.equals("Brasil")) {
            System.out.println(nome + " pode sair do país de origem.");
        } else {
            System.out.println(nome + " não pode sair do país de origem por ser menor de idade.");
        }

        System.out.println(nome + " está indo para " + paisDestino + ".");

        read.close();
    }
}
