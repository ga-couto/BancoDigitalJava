package a;

import java.util.Scanner;

public class Menu {
	
	//N�o preciso utilizar as vari�veis abaixo pq posso chamalas atrav�s da conta PAI (Conta) -> Polimorfirmo
		//ContaCorrente contaCorrente = null;   -> Se eu liberar essa vari�vel, consigo chamala na opcao 5 "Empr�stimo" mas irei utilizar um alterador (instanceof) para chamar o empr�stimo.
		//ContaPoupanca contaPoupanca = null;
	private Scanner scan;
	public Cliente [] registros; //Criando array de registros
	private Conta [] contas;
	public Cartao [] cartoes;
	Conta conta;
	Conta contaDestino;
	Cartao cartao;
	Cliente registro;
	int opcaoValidada;
	
	
	public Menu(Scanner scan) {
		this.scan = scan;
		registros = new Cliente[10];
		contas = new Conta[10];
		cartoes = new Cartao[10];
		
	}
	
	public int getOpcaoValidada() {
		return opcaoValidada;
	}

	public void setOpcaoValidada(int opcaoValidada) {
		this.opcaoValidada = opcaoValidada;
	}



	public String exibeMenu() {
		
		return "------- Escolha uma op��o abaixo --------- \n"+
		"1 - Registrar-se \n"+                 		//ok
	    "2 - Criar nova Conta \n"+              	//ok
	    "3 - Sacar \n"+                        		//ok
	    "4 - Depositar \n"+ 						//ok
		"5 - Solicitar empr�stimo \n"+				//ok
		"6 - Solicitar cartao \n"+					//ok
	   	"7 - Transferir \n"+			
	    "8 - Ver dados da Conta usando M�todo \n"+	//ok
	    "9 - Ver dados da Conta usando ToString \n"+//ok
	    "0 - Finalizar \n";							//ok
	}
	
	
	
	public void validarOpcao(int opcao) {
		
		while(true) {
			if(opcao ==1 && registros != null) {
				System.out.println("Voc� escolheu registrar-se para poder utilizar as funcionalidades abaixo.");
				setOpcaoValidada(1);
				break;
			}
			if(opcao !=1 && registros != null) {
				setOpcaoValidada(opcao);
				System.out.println("Bem vindo Senhor(a) ");
				break;
			}
			System.out.println("Valida��o de entrada - passou sem validar!!!");
			break;
		}
	}
	public void selecionaOpcaoMenu(int opcao) {
		switch(opcao) {
    	case 1:{
    		Cliente registro = new Cliente();
    		System.out.println("Digite seu nome: ");
    		registro.setNome(scan.next());
    		
    		System.out.println("Digite seu telefone: ");
    		registro.setTelefone(scan.next());
    		
    		System.out.println("Digite seu ano de nascimento: ");
    		registro.setAnoNacimento(scan.next());
    		
    		System.out.println("Digite seu endere�o: ");
    		registro.setEndereco(scan.next());
    		
    		System.out.println("Digite seu e-mail: ");
    		registro.setEmail(scan.next());
    		
    		System.out.println("Ol�, "+ registro.getNome());
    		
    		//Essas duas linhas abaixo n�o sao elegantes para realizar a incrementa��o do n�mero do registro criado. Vou utilizar o "for".
    		//registros[index++] = registro;//Salvando o registro no array de registros e utilizando o "index" para salvar outros registro.
    										// O "[index++]" vai implementar depois q a linha for executada.
    		//Utilizando o "for" para incrementar o n�mero do registro.
    		
    		for(int i = 0; i < registros.length; i++) {
    			if(registros[1] == null) {
    				registros[i] = registro;
    				break;
    			}
    		}
    	}
    	case 2:{
    		System.out.println("Escolha o tipo de conta que deseja abrir no BGC (Banco Gabriel Couto): ");
    		System.out.println("1 - Conta Corrente ");
    		System.out.println("2 - Conta Poupan�a ");
    		short tipoConta = scan.nextShort();
    		if(tipoConta == 1) {
    			conta = new ContaCorrente(); //Aqui estou trabalhando com polimorfismo! A Conta est� assumindo tipo de Conta Corente.
    		}else {
    			conta = new ContaPoupanca();
    		}
    		
    		for(int i = 0; i < contas.length; i++) {
    			if(contas[1] == null) {
    				contas[i] = conta;
    			}
			}
    		System.out.println("Conta do tipo '"+ tipoConta +"' foi criada com sucesso. N�mero da conta criada: " + conta.getnumeroConta());
    		break;
    	}
        case 3:{
        	System.out.println("Digite o valor do saque: ");
        	double valorSaque = scan.nextDouble();
        	if(conta != null) {
        		double valorAtualizadoAposSaque = conta.sacar(valorSaque);
        		System.out.println("Valor dispon�vel "+ valorAtualizadoAposSaque);
        		break;
        	}
        	System.out.println("Registre-se para poder ter uma conta e realizar saques.");
        	break;
        }
        case 4:{
        	System.out.println("Digite o valor do dep�sito: ");
        	double valorDeposito = scan.nextDouble();
        	if(conta != null) {
        		double valorSaldoAtualizado = conta.depositar(valorDeposito);
        		System.out.println("Saldo dispon�vel: "+ valorSaldoAtualizado);
        		break;
        	}
        	System.out.println("Registre-se para poder ter uma conta e realizar depositos.");
        	break;
        }
        case 5:{
        	System.out.println("Digite o valor do empr�stimo: ");
        	double valorEmprestimo = scan.nextDouble();
        	if(conta != null) {
        		if(conta instanceof ContaCorrente ) {
        			ContaCorrente contaCorrente = (ContaCorrente)conta;
        			contaCorrente.realizarEmprestimo(valorEmprestimo);
        		}
        		break;
        	}
        	System.out.println("Registre-se para poder ter uma conta e realizar depositos.");
        	break;
        }
        case 6:{
        	if(registros != null) {
        		System.out.println("Digite o nome do titular: ");
        		String titularCartao = scan.next();
        		conta.solicitarCartao(titularCartao);
        		
        		for(int i = 0; i < cartoes.length; i++) {
        			if(cartoes[1] == null) {
        				cartoes[i] = cartao;
        				System.out.println("Cart�o criado com sucesso! ");
        				break;
        			}
    			}
        		break;
        	}else {
        		System.out.println("Por favor, registre-se!");
        	}
        	break;
        }
        case 7:{
        	System.out.print("Digite o valor da Transfer�ncia: ");
        	double valor = scan.nextDouble();
        	conta.transferir(valor, contaDestino);
        }
        case 8:{
        	if (conta != null) {
        		System.out.println("Dados da conta: ");
        		System.out.println(conta);
        		break;
        	}else {
        		System.out.println("A conta n�o foi criada! Registre-se e crie uma conta.");
        	}
        	break;
        }
        case 9:{
        	conta.imprimirExtrato();
        }
        	
        default:
            System.out.println("Op��o inv�lida! Tente uma op��o entre '0 e 8'");
		}
	}
}
	
	

