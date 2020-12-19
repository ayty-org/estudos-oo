package org.ayty.alunos.samuelhenrique.pooListaExercicios;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		boolean sair = true;
		
		do {
			System.out.println("Escolha o número de uma operação a ser feita\n"
					+ "1. Sacar uma valor\n"
					+ "2. Depositar dinheiro\n"
					+ "3. Consultar saldo\n"
					+ "4. Verificação de cheque especial\n"
					+ "5. Finalizar");
			
			int evento = leitor.nextInt();
			
			switch(evento){
				case 1: {
					System.out.println("Informe o valor a ser retirado");
					double valorSaque = leitor.nextDouble();
					
					System.out.println("Informe a agência: ");
					String numAgencia = leitor.next();
					
					System.out.println("Informe o número da conta: ");
					String numConta = leitor.next();
					
					boolean resultadoEvento = conta.sacarDinheiro(valorSaque, numConta, numAgencia);
					
					
					if(resultadoEvento) {
						System.out.println("Dinheiro sacado com sucesso\n");
					}else {
						System.out.println("Saldo insuficiente\n");
					}
				}break;
				
				case 2: {
					System.out.println("Informe o valor a ser depositado");
					double valorDeposito = leitor.nextDouble();
					
					System.out.println("Informe a agência: ");
					String numAgencia = leitor.next();
					
					System.out.println("Informe o número da conta: ");
					String numConta = leitor.next();
					
					boolean resultadoEvento = conta.depositarDinheiro(valorDeposito, numConta, numAgencia);
					
					if(resultadoEvento) {
						System.out.println("Dinheiro depositado com sucesso\n");
					}else {
						System.out.println("Dados incorretos\n");
					}
				}break;
				
				case 3: {
					System.out.println("Informe a agência: ");
					String numAgencia = leitor.next();
					
					System.out.println("Informe o número da conta: ");
					String numConta = leitor.next();
					
					String resConsultarSaldo = conta.consultarSaldo(numConta, numAgencia);
					
					System.out.println(resConsultarSaldo);
				}break;
				
				case 4: {
					System.out.println("Informe a agência: ");
					String numAgencia = leitor.next();
					
					System.out.println("Informe o número da conta: ");
					String numConta = leitor.next();
					
					String resConsultarChequeEspecial = conta.consultarChequeEspecial(numConta, numAgencia);
					System.out.println(resConsultarChequeEspecial);
				}break;
				
				case 5: {
					sair = false;
				}break;
				
				default: {
					System.out.println("Opção inválida, tente novamente");
				}
			}
			
		}while(sair);
		
		System.out.println("FINALIZADO!!!");
		
		leitor.close();

	}

}
