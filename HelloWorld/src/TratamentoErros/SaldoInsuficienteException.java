package TratamentoErros;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
