package a;


public interface IConta {
	
	
	double depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	public void imprimirExtrato();
	
	
}
