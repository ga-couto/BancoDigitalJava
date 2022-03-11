package a;
import java.util.Scanner;

public class Cliente {
	public String nome;
	private int anoNascimento;
	private String cpf;
	private int rg;
	private String contato;
	private String endereco;
	
	


	public Cliente(Cliente cliente) {
		super();
		this.nome = nome;
	}
	public void novoCliente() {
    	//Cliente nome = scan.next();
		
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	
	
	
	
}
