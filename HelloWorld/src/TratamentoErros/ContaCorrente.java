package TratamentoErros;

import java.time.LocalDate;

public class ContaCorrente {
	
	private String titular;
	private String endereco;
	private String cpf; 
	private LocalDate dataNascimento;
		
	public ContaCorrente() { }
		
	float saldo;
	public ContaCorrente(String titular, String endereco, String cpf,
			LocalDate dataNascimento) {
		this.titular = titular;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public boolean equals(Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return (conta.cpf.equals(this.cpf));
		
	}
	
	void deposita(float valor) {
		saldo += valor;
	}
	
	float saca(float valor) throws SaldoInsuficienteException {
		if(valor > saldo)
			throw new SaldoInsuficienteException("Saldo insuficiente");
		
		saldo -= valor;
		return saldo; 
	}
	
	float getSaldo() {
		return saldo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
}
