
public class ContaBancaria {
	private String titular;
	public String getTitular() {
		return titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	private double saldo;
	private int numeroConta;
	
	public ContaBancaria(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta; 
		saldo = 0;		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		if(valor <= saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado");
		}
		else
			System.out.println("Seu saque não pode ser maior do que o saldo disponível");
	}
}
