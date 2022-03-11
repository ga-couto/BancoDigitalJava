package a;

public class Excecoes {

	public class ContaNaoEncontradaException extends Exception{
	    public ContaNaoEncontradaException(){
	        super("Conta abstrata não encontrada!");
	    }
	    
	    public class NaoEhContaEspecialException extends Exception{
	        public NaoEhContaEspecialException(){
	            super("Operação não realizada, não é uma conta especial!");
	        }
	    }
	    
	    public class NaoEhContaPoupancaException extends Exception{
	        public NaoEhContaPoupancaException(){
	            super("Operação não realizada, não é uma conta poupança!");
	        }
	    }
	    
	    public class SaldoNegativoException extends Exception{
	        public SaldoNegativoException(){
	            super("Operação não realizada. Saldo negativo!");
	        }
	    }
	    
	    public class ValorNegativoException extends Exception{
	        public ValorNegativoException(){
	            super("Operação não realizada. Valor negativo!");
	        }
	    }
	    
	    public class VetorVazioException extends Exception{
	        public VetorVazioException(){
	            super("Nenhuma conta cadastrada!");
	        }
	    }
	    
	}
}
