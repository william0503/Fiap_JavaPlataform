package Heranca;

public class ControleBonificacao {
	private int totalBonificacao = 0;
	
	public void registra(Funcionario funcionario) {
		totalBonificacao += funcionario.getBonificacao();
	}

	public int getTotalBonificacao() {
		return totalBonificacao;
	}
	
}
