
public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("José", 50);
		p1.caminha();
		System.out.println("Olá " + p1.getNome());
		System.out.println(p1.getQuantidadePessoas());
		
		Pessoa p2 = new Pessoa("Maria", 30);
		System.out.println(p1.getQuantidadePessoas());
				
		Pessoa p3 = new Pessoa("Maria", 30);
		System.out.println(p1.getQuantidadePessoas());		
	}
}
