package TratamentoErros;

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
		ContaCorrente cc = new ContaCorrente("José");
		
				
		for (int i = 0; i <= 15; i++) {
			cc.deposita(i+1000);
			System.out.println(cc.getSaldo());
			if (i == 5) {
				cc = null;
			}
		}
	
		System.out.println("fim metodo2");		
	}
	
	
}
