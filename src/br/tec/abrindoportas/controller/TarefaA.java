package br.tec.abrindoportas.controller;

import java.util.Scanner;

public class TarefaA {

    public void mediaAritmetica() {
       
    }

    public void verificaPar() {
    	
    }

            // BLOCO - INICIO

    public void escolha() {
        int diaSemana;
        try (Scanner read = new Scanner(System.in)) {
			System.out.println("Escolha um número para representar um dia da semana (1 a 7): ");
			diaSemana = read.nextInt();
		}

        for (diaSemana = 1; diaSemana <= 7; diaSemana++) {
        	
        }
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo:"+"Um novo ciclo está prestes a começar. Prepare-se para uma semana incrível!");
                break;
                
            case 2:
                System.out.println("Segunda-feira:"+"Novo dia, nova semana, novas oportunidades. Vamos começar com determinação!");
                break;
                
            case 3:
                System.out.println("Terça-feira:"+"Faça hoje melhor do que ontem. Siga em frente com confiança!");
                break;
                
            case 4:
                System.out.println("Quarta-feira:"+"Meio da semana, mas não meio do esforço. Continue persistindo!");
                break;
                
            case 5:
                System.out.println("Quinta-feira:"+"Você já chegou tão longe nesta semana. Continue avançando com força!");
                break;
                
            case 6:
                System.out.println("Sexta-feira:"+"Finalmente, o fim de semana está à vista! Termine a semana com energia!");
                break;
                
            case 7:
                System.out.println("Sábado:"+"Tempo para relaxar e recarregar. Aproveite seu sábado ao máximo!");
                break;
                
            default:
                System.out.println("Número inválido de dia da semana.");
        }
    }

    }

