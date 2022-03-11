package a;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import a.Excecoes.ContaNaoEncontradaException.SaldoNegativoException;
import a.Excecoes.ContaNaoEncontradaException.ValorNegativoException;

public class Main {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
        
	Registro registro = null;
	
	Conta conta = null;
	//Não preciso utilizar as variáveis abaixo pq posso chamalas através da conta PAI (Conta) -> Polimorfirmo
	//ContaCorrente contaCorrente = null;   -> Se eu liberar essa variável, consigo chamala na opcao 5 "Empréstimo" mas irei utilizar um alterador (instanceof) para chamar o empréstimo.
	//ContaPoupanca contaPoupanca = null;
	int opcao;
	
	while(true) {
		System.out.println("------- Escolha uma opção abaixo ---------");
    	System.out.println("1 - Registrar-se");
        System.out.println("2 - Criar nova Conta");
        System.out.println("3 - Sacar");
        System.out.println("4 - Depositar");
        System.out.println("5 - Solicitar empréstimo");
        System.out.println("6 - Solicitar cartao");
        System.out.println("7 - Ver dados da Conta");
        System.out.println("8 - Transferir");
        System.out.println("0 - Finalizar");
		
        
        opcao = scan.nextInt();
		
        if(opcao == 0) {
        	break;
        }
        
        if(opcao != 1 && registro == null) {
        	System.out.println("Por favor, crie um registro");
        	continue;
        }
        
        switch(opcao) {
        	case 1:{
        		registro = new Registro();
        		System.out.println("Digite seu nome: ");
        		registro.setNome(scan.next());
        		
        		System.out.println("Digite seu telefone: ");
        		registro.setTelefone(scan.next());
        		
        		System.out.println("Digite seu ano de nascimento: ");
        		registro.setAnoNacimento(scan.next());
        		
        		System.out.println("Digite seu endereço: ");
        		registro.setEndereco(scan.next());
        		
        		System.out.println("Digite seu e-mail: ");
        		registro.setEmail(scan.next());
        		
        		
        	}
        	case 2:{
        		
        		
        		System.out.println("Escolha o tipo de conta: ");
        		System.out.println("1 - Conta Corrente ");
        		System.out.println("2 - Conta Poupança ");
        		
        		short tipoConta = scan.nextShort();
        		if(tipoConta == 1) {
        			conta = new ContaCorrente(); //Aqui estou trabalhando com polimorfismo!
        		}else {
        			conta = new ContaPoupanca();
        		}
        		System.out.println("Conta %d foi criada com sucesso " +conta.getnumeroConta());
        		
        		 break;
        	}
            case 3:{
            	System.out.println("Digite o valor do saque: ");
            	
            	double valorSaque = scan.nextDouble();
            	if(conta != null) {
            		double valorSaqueAtualizado = conta.depositar(valorSaque);
            		System.out.println("Valor disponível "+ valorSaqueAtualizado);
            	}
            	
            	
            	break;
            }
            case 4:{
            	System.out.println("Digite o valor do depósito: ");
            	
            	double valorSaque = scan.nextDouble();
            	if(conta != null) {
            		double valorSaldoAtualizado = conta.depositar(valorSaque);
            		System.out.println("Saldo disponível: "+ valorSaldoAtualizado);
            	}
            	break;
            }
            case 5:{
            	System.out.println("Digite o valor do empréstimo: ");
            	
            	double valorEmprestimo = scan.nextDouble();
            	if(conta != null) {
            		if(conta instanceof ContaCorrente ) {
            			ContaCorrente contaCorrente = (ContaCorrente)conta;
            			contaCorrente.realizarEmprestimo(valorEmprestimo);
            		}
            	}
            	
            	
            	break;
            }
            case 6:{
            	System.out.println("Escolha o tipo do cartão: ");
            	System.out.println("1 - Débito");
            	System.out.println("2 - Crédito");
            	System.out.println("3 - Débito/Crédito");
            	
            	if(registro != null) {
            		
            		//conta.solicitaCartao(registro.getNome(), tipoCartao);
            		System.out.println("Cartão criado com sucesso! ");
            		
            	}else {
            		System.out.println("Por favor, registre-se!");
            	}
            		
            	
            	break;
            }
            case 7:{
            	if (conta != null) {
            		System.out.println("Dados da conta: ");
            		System.out.println(conta);
            	}else {
            		System.out.println("A conta não foi criada!");
            	}
            	break;
            }
            case 8:{
            	
            	System.out.println("Digite o valor da Transferência: ");
            	double valorTransferencia = scan.nextDouble();
            	
            	System.out.println("Digite o número da conta: ");
            	
            	
            	break;
            }
            	
            default:
                System.out.println("Opção inválida!");
        }
		}
	}   
}

		

