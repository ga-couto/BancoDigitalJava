package a;


public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	public void cobrarTaxaDeSaqueContaPoupanca() {
		double saldo = getSaldo();
		setSaldo(saldo - 10);
	}
	
	
	@Override
	public double sacar(double valorSaque) {
		double saldo = getSaldo();
		if (valorSaque > 0 && valorSaque <= 100) {
			saldo -= valorSaque;
		}
		setSaldo(saldo);
		cobrarTaxaDeSaqueContaPoupanca();
		return getSaldo();
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("--- Seu Extrato - Conta Poupança --- \n");
		super.imprimirDadosConta();
	}

	
	
	
}
