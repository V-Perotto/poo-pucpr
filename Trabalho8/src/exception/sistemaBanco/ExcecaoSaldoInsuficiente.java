package exception.sistemaBanco;

public class ExcecaoSaldoInsuficiente extends Exception {
	
	public ExcecaoSaldoInsuficiente() {
		super();
	}
	
	public ExcecaoSaldoInsuficiente(String message) {
		super(message);
	}
}
