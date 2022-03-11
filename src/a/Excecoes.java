package a;

public class Excecoes {

	public class ContaNaoEncontradaException extends Exception{
	    public ContaNaoEncontradaException(){
	        super("Conta abstrata n�o encontrada!");
	    }
	    
	    public class NaoEhContaEspecialException extends Exception{
	        public NaoEhContaEspecialException(){
	            super("Opera��o n�o realizada, n�o � uma conta especial!");
	        }
	    }
	    
	    public class NaoEhContaPoupancaException extends Exception{
	        public NaoEhContaPoupancaException(){
	            super("Opera��o n�o realizada, n�o � uma conta poupan�a!");
	        }
	    }
	    
	    public class SaldoNegativoException extends Exception{
	        public SaldoNegativoException(){
	            super("Opera��o n�o realizada. Saldo negativo!");
	        }
	    }
	    
	    public class ValorNegativoException extends Exception{
	        public ValorNegativoException(){
	            super("Opera��o n�o realizada. Valor negativo!");
	        }
	    }
	    
	    public class VetorVazioException extends Exception{
	        public VetorVazioException(){
	            super("Nenhuma conta cadastrada!");
	        }
	    }
	    
	}
}
