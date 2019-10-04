package Heranca;

public class Motorista extends Funcionario {
	private int cnh;
	
	public Motorista() {
		super();
	}
	
	public Motorista(String nome, int numero) {
		super(nome, numero);
	}
	
	public void dirige() {
		System.out.println(getNome() + " está dirigindo...");
	}
	
	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public void trabalha() {
		System.out.println("Motorista " + getNome() + " está trabalhando...");
	}
	
	public int getBonificacao() {
		return 60;
	}
}
