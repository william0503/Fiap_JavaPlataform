package Exercicio1;

public class Teste {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca("José");
		System.out.println(c1.getTipo() + ", titular: " + c1.getTitular() + ", conta: " + c1.getNumeroConta());
		c1.deposita(100);
		System.out.println("Saldo atual: R$" + c1.getSaldo());		
		c1.saque(50);
		System.out.println("Saldo atual: R$" + c1.getSaldo());
		
		System.out.println("");
				
		ContaCorrente c2 = new ContaCorrente("João");
		System.out.println(c2.getTipo() + ", titular: " + c2.getTitular() + ", conta: " + c2.getNumeroConta());
		c2.deposita(50);
		System.out.println("Saldo atual: R$" + c2.getSaldo());		
		c2.saque(10);
		System.out.println("Saldo atual: R$" + c2.getSaldo());
		
		System.out.println("");
		
		ContaCorrente c3 = new ContaCorrente("Pedro");
		System.out.println(c3.getTipo() + ", titular: " + c3.getTitular() + ", conta: " + c3.getNumeroConta());
		c3.deposita(50);
		System.out.println("Saldo atual: R$" + c3.getSaldo());		
		c3.saque(60);
		System.out.println("Saldo atual: R$" + c3.getSaldo());
	}
}
