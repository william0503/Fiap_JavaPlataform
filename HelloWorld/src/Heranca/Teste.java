package Heranca;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("João");
		f1.setNumero(1);
		
		Funcionario[] funcs = new Funcionario[3];
		funcs[0] = f1;
		funcs[1] = new Funcionario("Pedro",32);
		funcs[2] = new Motorista("Geraldo", 965);
		
		System.out.println(funcs[0].getNome());
		funcs[1].trabalha();
		funcs[2].trabalha();
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(funcs[0]);
		cb.registra(funcs[2]);
		
		System.out.println(cb.getTotalBonificacao());
	}
}
