package org.ayty.alunos.samuelhenrique.pooListaExercicios;

public class ContaCorrente {
	
	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	
	public boolean verificarSaldo(String numConta, String numAgencia ) {
		if(confirmarConta(numConta, numAgencia)) {
			if(saldo < 0) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	public double debitarValorSaldo(double valorSacar) {
		return saldo -= valorSacar;
	}
	
	public boolean sacarDinheiro(double valorSacar, String numConta, String numAgencia) {
		
		if(confirmarConta(numConta, numAgencia)) {	
			
			// tem saldo
			
			if(valorSacar <= saldo) {
				debitarValorSaldo(valorSacar);
				return true;
			}else { // n�o tem saldo
				if(especial) { //limite especial tem saldo
					
					boolean ResVerificadoSaldo = verificarSaldo(numConta, numAgencia);
					
					if(ResVerificadoSaldo) { //Se o saldo for negativo, subtrair o saldo do limite do cheque especial
						double limite = limiteEspecial - saldo;
						
						if(valorSacar <= limite) {
							limite -= valorSacar;
							return true;
						}else { // limite especial n�o tem saldo
							return false;
						}
					}else {
						return false;
					}
				} else {
					return false;
				}
			}	
		}else {
			return false;
		}
	}
	
	public boolean depositarDinheiro(double valorDepositar, String numConta, String numAgencia) {
		if(confirmarConta(numConta, numAgencia)) {
			saldo += valorDepositar;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean confirmarConta(String numConta, String numAgencia) {
		//Conta confere
		if(numAgencia.equals(agencia) && numConta.equals(numero)) {
			return true;
		}else {// Houve uma diverg�ncia nos dados
			return false;
		}
	}
	
	public String consultarSaldo(String numConta, String numAgencia) {
		if(confirmarConta(numConta, numAgencia)) {
			String respostaEvento = "O saldo da conta �: " + saldo + "\n";
			return respostaEvento;
		}else {
			String respostaEvento = "Dados incorretos\n";
			return respostaEvento;
		}
	}
	
	public String consultarChequeEspecial(String numConta, String numAgencia) {
		if(confirmarConta(numConta, numAgencia)) {
			if(especial) {
				String respostaEvento = "Voc� tem limite especial de: " + limiteEspecial + "\n";
				return respostaEvento;
			}else {
				String respostaEvento = "Voc� n�o tem limite especial\n";
				return respostaEvento;
			}
		}else {
			String respostaEvento = "Dados incorretos\n";
			return respostaEvento;
		}
	}
}
