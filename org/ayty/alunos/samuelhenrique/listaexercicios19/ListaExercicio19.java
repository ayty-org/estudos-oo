package org.ayty.alunos.samuelhenrique.listaexercicios19;

import java.util.Scanner;

public class ListaExercicio19 {
public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// Questão 17
		/*int[] idade = new int[5];
		int sup35 = 0;
		int idadeDoCidadao;
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println("Digite a idade da pessoa " + (i+1));
			idadeDoCidadao = leitor.nextInt();
			idade[i] = idadeDoCidadao;
		}
		
		for(int idd : idade) {
			if(idd > 35) sup35++;
		}
		
		System.out.println("Quantidade de pessoas acima dos 35: " + sup35);*/
		
		// Questão22
		
		/*int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
		}
		int quant0 = 0;
		int quant1 = 0;
		for(int zeroUm : vetorA) {
			
			System.out.print(zeroUm);
			
			if(zeroUm == 0) quant0++;
			else quant1++;
		}
		
		System.out.println();
		
		System.out.println("Temos " + ((quant0 * 100)/vetorA.length) + "% de 0\nTemos " + ((quant1 * 100)/vetorA.length) + "% de 1");*/
		
		leitor.close();
	}

}
