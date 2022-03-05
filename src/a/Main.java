package a;


public class Main {

	public static void main(String[] args) {
		
		//Criando Clientes
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel Couto Cabral Carneiro");
		Cliente laiana = new Cliente();
		laiana.setNome("Laiana de Pontes Azevedo");
		
		
		//Criando contas para os clientes cadastrados
		IConta cc = new ContaCorrente(gabriel);
		ContaPoupanca cp = new ContaPoupanca(gabriel);
		IConta cp2 = new ContaPoupanca(laiana);
		
		
		//Realizando movimentações nas contas
			
		
		
		cc.depositar(500);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cp2.imprimirExtrato();
		
	}

}
