package a;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);//Aqui eu criei um Objeto e não preciso criar na classe "Menu". Só preciso passa-lo p o construtor da classe Menu.
    										// O Objeto (Classe Menu) Depende dessa variável "scan" criada. No momento que vou contruir o menu através do "Menu menu = new Menu(scan)" preciso passar o scan para informar que tem que utilizar o scan da classe "Menu".
	Menu menu = new Menu(scan);// Aqui passa o "scan" como parametro do construtor da classe "Menu".
	//		Registro registro = null;
	//		Conta conta = null;
	
	int opcao;
	
		while(true) {
			
	        System.out.println(menu.exibeMenu());
	        opcao = scan.nextInt();
			
	        if(opcao == 0) {
	        	break;
	        }
	        
	        menu.validarOpcao(opcao);
	        menu.selecionaOpcaoMenu(menu.opcaoValidada);
  		}
	        
	}
}   


		

