package br.tec.abrindoportas.controller;

import java.util.Scanner;

public class Tarefa {

	public static void main(String[] args) {
		//BLOCO - Declaração de varíaveis
		String nome, sexo, paisOrigem, paisDestino;
		int idade;
		
		Scanner read = new Scanner(System.in);
		
		//BLOCO - Entrada de dados
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
		
		//BLOCO - Processamento e saída de dados
		if (idade >= 18) {
			System.out.println(nome + " é maior de idade, portanto está autorizado a embarcar na viagem");
		} else {
			System.out.println(nome + " é menor de idade, portanto não está autorizado a embarcar na viagem");
			}
			
		}

	}


