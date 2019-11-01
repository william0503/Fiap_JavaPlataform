package Exercicio2;

import Exercicio1.ContaCorrente;

public class TesteEnum {
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("josé");
		c1.deposita(100000);
		
		System.out.println("Potencial: " + ClassificacaoCliente.POTENCIAL.isCompatible(c1));
		System.out.println("Medio: " + ClassificacaoCliente.MEDIO.isCompatible(c1));
		System.out.println("Baixo: " + ClassificacaoCliente.BAIXO.isCompatible(c1));
		
		ContaCorrente c2 = new ContaCorrente("josé");
		c2.deposita(300000);
		
		System.out.println("Potencial: " + ClassificacaoCliente.POTENCIAL.isCompatible(c2));
		System.out.println("Medio: " + ClassificacaoCliente.MEDIO.isCompatible(c2));
		System.out.println("Baixo: " + ClassificacaoCliente.BAIXO.isCompatible(c2));
		
		ContaCorrente c3 = new ContaCorrente("josé");
		c3.deposita(450000);
		
		System.out.println("Potencial: " + ClassificacaoCliente.POTENCIAL.isCompatible(c3));
		System.out.println("Medio: " + ClassificacaoCliente.MEDIO.isCompatible(c3));
		System.out.println("Baixo: " + ClassificacaoCliente.BAIXO.isCompatible(c3));
	}
}
