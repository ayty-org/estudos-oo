package org.ayty.alunos.samuelhenrique.listaexercicio1617;

import java.util.Scanner;

public class ListaExercicioss_16_17 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		//Quest�o 2
		/*int sair = 0;
		do {
			
			System.out.println("Ol�, Digite seu nome: ");
			String nome = leitor.next();
			
			System.out.println("Digite uma senha: ");
			String senha = leitor.next();
			
			if (senha.equals(nome)) {
				System.out.println("O nome n�o pode ser igual a senha");
			}else {
				sair = 1;
			}
			
		}while (sair == 0);
		
		System.out.println("Pronto!!");*/
		
		// Quest�o 1
		/*boolean sair = true;
		do {
			
			System.out.println("Digite uma nota entre 0 e 10: ");
			double nota = leitor.nextDouble();
			if (nota >= 0 && nota <= 10) {	
				sair = true;
			}else {
				System.out.println("Nota inv�lida")
				sair = false;
			}
		}while(!sair);
		
		System.out.println("Pronto");*/
		
		// Quest�o 3
		
		/*boolean infoValida = false;
		String nome;
		
		do {
			System.out.println("Entre com o nome: ");
			nome = leitor.next();
			
			if (nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa de no m�nimo 3 caracteres");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		int idade;
		
		do {
			
			System.out.println("Digite sua idade");
			idade = leitor.nextInt();
			
			if (idade >= 0 && idade >=150 ) {
				infoValida = true;
			}else {
				System.out.println("A idade tem que ser entre 0 e 150");
			}
			
		}while (!infoValida);*/
		
		// Quest�o 12
		
		/*int num;
		System.out.println("Bem vindo a tabuada, digite um n�mero entre 0 e 10: ");
		
		num = leitor.nextInt();
		System.out.println("Tabuada de " + num + ":");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}*/
		
		
		//Quest�o 20
		/*System.out.println("Informe o n�mero de pessoas");
		int numPessoas = leitor.nextInt();
		int soma = 0;
		int media;
		
		for(int i = 0; i < numPessoas; i++) {
			System.out.println("Informe a idade da pessoa " + (i+1));
			int idade = leitor.nextInt();
			
			soma += idade;
		}
		
		System.out.println("A m�dia de idade �: " + (media = soma/numPessoas));
		
		if(media >= 0 && media <= 25) {
			System.out.println("A turma � jovem");
		}else if(media >= 26 && media <= 60) {
			System.out.println("A turma � adulta");
		}else if (media > 60) {
			System.out.println("A turma � idosa");
		}*/
		
		// Quest�o 21
		
		/*System.out.println("Informe a quantidade de turmas:");
		int quantTurmas = leitor.nextInt();
		int alunosTotal = 0;
		double media = 0;
		
		for(int i = 1; i <= quantTurmas; i++ ) {
		
			
			
			boolean valido = true;
			
			do {
			
				System.out.println("Informe a quantidade de alunos da turma " + (i));
				int quantAlunos = leitor.nextInt();
			
				if(quantAlunos <= 40) {
					valido = false;
					alunosTotal += quantAlunos;
				}else {
					System.out.println("O n�mero de alunos n�o pode ser maior que 40");
				}
			}while(valido);
			
		}
		media = alunosTotal/quantTurmas;
		
		System.out.println("M�dia de alunos por turma � " + media);*/
		
		// Quest�o 25
		
		/*boolean sair = false;
		String valorSair;
		int qtdProdutos;
		
		double valorTotal = 0;
		double dinheiro;
		double valorCompra;
		
		String output;
		
		do {
			System.out.println("Deseja informar uma nova compra? 'S/N'");
			valorSair = leitor.next();
			
			if(valorSair.equalsIgnoreCase("N")) {
				sair = true;
				break;
			}else if (valorSair.equalsIgnoreCase("S")) {
				
				output = "Lojas Tabajara\n";
				System.out.println("Informe a quantidade de produtos: ");
				qtdProdutos = leitor.nextInt();
				
				valorTotal = 0;
				
				for(int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Valor do produto " + i);
					valorCompra = leitor.nextDouble();
					
					valorTotal += valorCompra;
					
					output += "Produto " + i + ": R$ " + valorCompra + "\n";
				}
				System.out.println("Valor toral: " + valorTotal);
				output += "Total: R$ " + valorTotal + "\n";
				
				System.out.println("Informe o dinheiro para pagar:");
				dinheiro = leitor.nextDouble();
				
				output  += "Dinheiro: R$ " + dinheiro + "\n" + "Troco: R$ " + (dinheiro - valorTotal);
				
				System.out.println(output);
				
			}else {
				System.out.println("Valor inv�lido, verifique a entrada");
			}
			
			
		}while (!sair);*/
		
		
		leitor.close();
	}

}
