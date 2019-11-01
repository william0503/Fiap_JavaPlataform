package Exercicio2;

import Exercicio1.ContaCorrente;

public enum ClassificacaoCliente {
	POTENCIAL(400000,500000),
	MEDIO(200000,399999),
	BAIXO(0,199999);
	
	private int valorMinimo;
	private int valorMaximo;
	
	private ClassificacaoCliente(int valorMinimo, int valorMaximo) {
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
	}
	
	public boolean isCompatible(ContaCorrente conta) {
		return (conta.getSaldo() >= valorMinimo && conta.getSaldo() <= valorMaximo);
	}
}
