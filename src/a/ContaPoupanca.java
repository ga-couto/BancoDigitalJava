package a;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Seu Extrato - Conta Poupan�a --- \n");
		super.imprimirDadosConta();
	}
	
}
