package Rascunhos;

import java.util.Scanner;

public class Funcoes {
	
	public void mediaAritmetica() {
		
	/*
	 * Criar um programa que recebe um numero e verifica se
	 */
		
	public void verificaPar() {
		
	//Função irá ler um inteiro e mostrar o dia da semana
	public void escolha() {
		int dayWeekend;
		Scanner read = new Scanner(System.in);
		
		while(dayWeekend != 0) {
		System.out.println("Digite o dia da semana:");
		System.out.println("1 = Domingo, \n 2 = Segunda, \n 0 = Sair");
		dayWeekend = read.nextInt();
		
		//Esta estrutura serve para escolher uma opção. Retorna dia da semana
		switch (dayWeekend) {
		case 1: {
			
		    System.out.println("Domingo");
		    break;
		}
		case 2: {
			
			System.out.println("Segunda-Feira");
			break;
		}
        case 3: {
			
		    System.out.println("Terça-feira");
		    break;
		}
		case 4: {
			
			System.out.println("Quarta-Feira");
			break;
		}
        case 5: {
			
		    System.out.println("Quinta-Feira");
		    break;
		}
		case 6: {
			
			System.out.println("Sexta-Feira");
			break;
		}
        case 7: {
			
		    System.out.println("Sabado");
		    break;
		}
		
		default: {
			System.out.println("Opção escolhida é existente.");
		}
			
		}
	
	}
