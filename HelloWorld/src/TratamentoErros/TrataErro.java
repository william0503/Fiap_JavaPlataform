package TratamentoErros;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class TrataErro {
	public static void main(String[] args) {
		System.out.println("inicio main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("Deu ruim!");
		}
		
		System.out.println("fim main");
	}

	static void metodo1() {
		System.out.println("inicio metodo1");
		metodo2();
		System.out.println("fim metodo1");		
	}
	
	static void metodo2() {
		
		System.out.println("inicio metodo2");
		
		
		
		ContaCorrente cc = new ContaCorrente("José", "rua x", "00000000002",LocalDate.of(1994, 6, 28));		
		metodo3(cc);
		System.out.println(cc.getDataNascimento());
//		for (int i = 0; i <= 15; i++) {
//			cc.deposita(i+1000);
//			System.out.println(cc.getSaldo());
//			if (i == 5) {
//				cc = null;
//			}
//		}
		
		System.out.println("fim metodo2");
		
	}

	static void metodo3(ContaCorrente conta) {
				
		float valorDeposito = Float.valueOf(JOptionPane.showInputDialog("Valor depósito:"));
		conta.deposita(valorDeposito);
		System.out.println(conta.getSaldo());
		
		ContaCorrente c2 = new ContaCorrente("pedro", "rua y", "00000000002", LocalDate.of(1992, 3, 5));
		boolean validaCpf = conta.equals(c2);
		
		float valorSaque = Float.valueOf(JOptionPane.showInputDialog("Sacar:"));
		try {
			conta.saca(valorSaque);
		} catch (SaldoInsuficienteException e) {			
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		System.out.println("cpf é igual? " + validaCpf);
		
		
	}	
}
