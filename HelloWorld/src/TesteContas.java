
public class TesteContas {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("José",0001);
		System.out.println("Novo cliente: Titular: " + conta1.getTitular() + ", conta: " + conta1.getNumeroConta() + ", Saldo atual: R$" + conta1.getSaldo());
		conta1.deposita(100);
		System.out.println("Deposito recebido, novo saldo: R$" + conta1.getSaldo());
		
		System.out.println("");
		
		ContaBancaria conta2 = new ContaBancaria("Maria",0002);
		System.out.println("Novo cliente: Titular: " + conta2.getTitular() + ", conta: " + conta2.getNumeroConta() + ", Saldo atual: R$" + conta2.getSaldo());
		conta2.deposita(1000);
		System.out.println("Deposito recebido, novo saldo: R$" + conta2.getSaldo());
		
		conta2.saque(50);
		System.out.println("Novo saldo: R$" + conta2.getSaldo());
		
		conta2.saque(960);
		System.out.println("Novo saldo: R$" + conta2.getSaldo());

	}

}
