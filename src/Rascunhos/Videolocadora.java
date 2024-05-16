package Rascunhos;

import java.util.Scanner;

public class Videolocadora {
	public void locar() {
		//BLOCO - Declaração de Varíaveis
		String nomeFilme, nomeUsuario, cpfUsuario, enderecoUsuario;
		final int TEMPOLOCACAO = 2;
		final double ACRESCIMO = 5.0;
		int duracaoLocacao, count;
		double duracaoFilme, valorFilme;
		
		Scanner read = new Scanner(System.in);
		
		for(count = 1; count < 5; count++) {
			
			
			//BLOCO - Entradada de dados
			System.out.println("Digite seu nome: ");
			nomeUsuario = read.next();
			System.out.println("Digite seu Cpf: ");
			cpfUsuario = read.next();
			System.out.println("Digite seu Endereço: ");
			enderecoUsuario = read.next();
			
			System.out.println("Filme a ser locado: ");
			System.out.println("Nome do Filme: ");
			nomeFilme = read.nextDouble();
			System.out.println("Valor do Filme: ");
			valorLocacao = read.nextDouble();
			System.out.println("Tempo do Filme: ");
			duracaoFilme = read.nextDouble();
			
			System.out.println("Prazo da entrega: ");
			duracaoLocacao = read.nextInt();
			
			// BLOCO - Processamento e Saída de dados
			if(duracaoLocacao <= TEMPOLOCACAO) {
				System.out.println("Muito obrigado, volte sempre: ");
			}else {
				if((duracaoFilme > TEMPOLOCACAO)&&(duracaoLocacao == 3)) {
					valorFilme = valorFilme + ACRESCIMO;
					System.out.println("A data da entrega do filme excedeu a 2 dias"
				    + " por isso será cobrado " +ACRESCIMO + "reais. "
				    + " Total será R$" + valorFilme);
				}
			}
		}
		

	}

}
