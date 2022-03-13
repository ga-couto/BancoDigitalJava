package a;

import a.Excecoes.ContaNaoEncontradaException.SaldoNegativoException;
import a.Excecoes.ContaNaoEncontradaException.ValorNegativoException;

public class ContaCorrente extends Conta {

	
	
	
	public ContaCorrente() {
	}
	
	public void realizarEmprestimo(double valorEmprestimo) {
		double saldo = getSaldo();//Emcapsulamento!!!!!!!
		System.out.println("Seu saldo era de : "+ saldo);
			if(valorEmprestimo <= 30000) {
				saldo += valorEmprestimo;
				setSaldo(saldo);//Atualizando saldo da classe "Conta" atrav�s do encapsulamento!
				System.out.println("Seu saldo atual � de : "+ saldo);
			}else {
				System.out.println("Seu limite � de R$30.000,00. N�o podemos liberar esse empr�stimo!");
			}
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Seu Extrato - Conta Corrente --- \n");
		super.imprimirDadosConta();
	}
	
	
	

			
	
}
