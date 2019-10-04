package Exercicio1;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String titular) {
		super(titular);
	}
	
	@Override
	public String getTipo() {
		return "Cont poupança";
	}

}
