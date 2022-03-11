package a;

public class Cartao {
	
	
	protected String titular;
	protected Cartao cartao;
	protected short tipo; //?????????????????????/
	protected short tipoCartao; //?????????????????????/
	
	public Cartao() {
		
	}
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}


	public Cartao getCartao() {
		return cartao;
	}


	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}


	public short getTipo() {
		return tipo;
	}


	public void setTipo(short tipo) {
		this.tipo = tipo;
	}


	public short getTipoCartao() {
		return tipoCartao;
	}


	public void setTipoCartao(short tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	
	
	
	
}
