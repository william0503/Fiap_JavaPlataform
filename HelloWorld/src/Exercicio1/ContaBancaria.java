package Exercicio1;

public class ContaBancaria {
	private String titular;	
	private int numeroConta;	
	protected double saldo;
	
	private static int id;	
	
	public ContaBancaria(String titular) {
		this.titular = titular;		 
		saldo = 0;
		id++;
		numeroConta = id;
	}
	
	public String getTitular() {
		return titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Deposito realizado: R$" + valor);
	}
	
	public void saque(double valor) {
		if(valor <= saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado: R$" + valor);
		}
		else
			System.out.println(String.format("Seu saque de R$%s não pode ser maior do que o saldo disponível", valor) );
	}
	
	public String getTipo() {
		return "Conta";
	}
}

