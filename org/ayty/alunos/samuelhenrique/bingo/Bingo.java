package org.ayty.alunos.samuelhenrique.bingo;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		int[] numBingo = new int[90];
		
		
		System.out.println("######################## Bem vindo ao bingo de Samuel ##############################");
		
		
		System.out.println("Quantos participantes desejam jogar?\nOBS: máximo de 5 ");
		
		int quantJogadores = leitor.nextInt();
		
		int[][] jogadores = new int[quantJogadores][5];
		
		for(int i = 0; i < jogadores.length; i++) {
			
			for(int j = 0; j < jogadores[i].length; j++) {
				
				jogadores[i][j] = random.nextInt(91);
			}
		}
		
	
		for(int i = 0; i < jogadores.length; i++) {
			
			for(int j = 0; j < jogadores[i].length; j++) {
				
				System.out.print(jogadores[i][j] + " ## ");
			}
			System.out.println();
		}
		
		leitor.close();
	}

}
