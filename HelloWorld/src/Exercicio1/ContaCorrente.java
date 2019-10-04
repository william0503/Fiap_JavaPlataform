package Exercicio1;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String titular) {
		super(titular);
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor + 0.1);
	}
	
	@Override
	public String getTipo() {
		return "Conta corrente";
	}
}
