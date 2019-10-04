package Interface;

public abstract class Funcionario {
	private int numero;
	private String nome;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int numero) {
		setNome(nome);
		setNumero(numero);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void trabalha()
	{
		System.out.println(nome + " está trabalhando...");
	}

	public abstract int getBonificacao();
}
