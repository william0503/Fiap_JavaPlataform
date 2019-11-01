package TratamentoErros;

public class ContaCorrente {

	String titular; 
	float saldo;
	public ContaCorrente(String titular) {
		this.titular = titular;
	}
	
	void deposita(float valor) {
		saldo += valor;
	}
	
	float saca(float valor) {
		saldo -= valor;
		return saldo; 
	}
	
	float getSaldo() {
		return saldo;
	}
}
