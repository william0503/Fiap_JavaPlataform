package Interface;

public class Diretor extends Funcionario implements Autenticavel{
	private String _senha = "1234";
	
	@Override
	public boolean autentica(String senha) {
		return _senha.equals(senha);			
	}

	@Override
	public int getBonificacao() {
		return 60;
	}
	
}
