package a;

public class ContaCorrente extends Conta {

	
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Seu Extrato - Conta Corrente --- \n");
		super.imprimirDadosConta();
	}

			
	
}
