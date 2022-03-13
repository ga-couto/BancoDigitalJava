package a;

public class Cartao {
	
	
	private static int SEQUENCIAL_CARTAO = 001;
	
	public String titular;
	protected short tipoCartao;
	public int numeroCartao;
	
	public Cartao() {
		this.numeroCartao = SEQUENCIAL_CARTAO++;
	}
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}



	public int getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


	
	
}
