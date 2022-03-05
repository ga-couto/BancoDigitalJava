package a;


public abstract class Conta implements IConta {
	
	protected static int AGENCIAL_PADRAO = 0001;
	private static int SEQUENCIAL = 001;

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIAL_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirDadosConta() {
		
		System.out.printf("Cliente: %s\n", this.cliente.getNome());
		System.out.printf("Conta: %d\n", this.numero);
		System.out.printf("Agencia: %d\n", this.agencia);
		System.out.printf("Saldo: %.2f\n", this.saldo);
		System.out.println("");
	}
	

}
