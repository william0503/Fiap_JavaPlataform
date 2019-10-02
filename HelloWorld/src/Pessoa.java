
public class Pessoa {
	private int id;
	private String nome;
	private int idade; 
	private double peso;
	private static int quantidadePessoas;
	
	public Pessoa(String nome) {
		this.nome = nome;		
		id = quantidadePessoas++;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		id = quantidadePessoas++;
	}
	
	public Pessoa(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		id = quantidadePessoas++;
	}
	
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	
	public void caminha(){
		System.out.println(getNome() + " está caminhando...");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;		
	}
}
