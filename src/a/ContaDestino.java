package a;

public class ContaDestino extends Conta {
	
	
	
	int saldo;

	@Override
	public void imprimirExtrato() {
		
	}
	
	public double depositar(double valorDepositado) {
		double saldo = getSaldo();
		System.out.println("Seu saldo era de "+saldo);
		if (valorDepositado > 0) {
			saldo += valorDepositado;
		}
		setSaldo(saldo);
		return saldo;
	}
}
