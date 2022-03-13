package a;

import java.util.Scanner;

public abstract class Conta implements IConta {
	
	protected static int AGENCIAL_PADRAO = 0001;
	private static int SEQUENCIAL = 001;
	
	
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cartao cartao;
	protected Menu menu;
	
	public Conta() {
		this.agencia = Conta.AGENCIAL_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		
	}
	



	public int getAgencia() {
		return agencia;
	}

	public int getnumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	

	public Cartao getCartao() {
		return cartao;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void cobrarTaxaDeServicoQualquerConta() {
		double saldo = getSaldo();
		if (getSaldo() > 0 && getSaldo() <= getSaldo()) {
			setSaldo(saldo - 5);			
		}
	}
	public void cobrarTaxaDeSaque() {
		double saldoTaxa = getSaldo();
		if (getSaldo() > 0 && getSaldo() <= getSaldo()){
			setSaldo(saldoTaxa - 2);
		}
		
	}
	
	public double sacar(double valorSaque) {
		double saldoAgora = getSaldo();
		System.out.println("Seu saldo era de "+saldoAgora);
		if (valorSaque > 0 && valorSaque <= getSaldo()) {
			saldoAgora -= valorSaque;
		}else {
			System.out.println("Você não possui saldo para realizar este saque. Seu saldo é de: ");
		}
		setSaldo(saldoAgora);
		cobrarTaxaDeSaque();
		return getSaldo();
	}
	
	
	public void solicitarCartao(String titular) {
		Cartao cartao = new Cartao(); //Criando novo cartão!
		cartao.setTitular(titular);
		System.out.println("Titular: "+ cartao.getTitular());
		System.out.println("Número do Cartao: "+ cartao.getNumeroCartao());
	}
	@Override
	public double depositar(double valorDepositado) {
		double saldo = getSaldo();
		System.out.println("Seu saldo era de "+saldo);
		if (valorDepositado > 0) {
			saldo += valorDepositado;
		}
		setSaldo(saldo);
		return saldo;
	}

	@Override
	public void transferir(double valorDepositadoNaContaDestino, IConta contaDestino) {
		double saldo = getSaldo();
		System.out.println("Seu saldo era de "+ saldo);
		setSaldo(saldo - valorDepositadoNaContaDestino);
		cobrarTaxaDeServicoQualquerConta();
		System.out.println("Seu saldo era de "+ saldo);
	}
	
	protected void imprimirDadosConta() {
		
		System.out.println("");
		System.out.printf("Conta: %d\n", this.numeroConta);
		System.out.printf("Agencia: %d\n", this.agencia);
		System.out.printf("Saldo: %.2f\n", this.saldo);
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return "Conta{"+
				"/ numero= "+ numeroConta +
				"/ saldo= "+ saldo +
				"/ cartao= "+ cartao +
				"}";
	}
	

}
