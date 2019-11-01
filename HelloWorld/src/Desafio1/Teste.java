package Desafio1;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		boolean operacaoValida;
		int operacao;
		float op1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor:"));;
		
		do {
			
			operacao = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero da opera��o desejada (1 - soma, 2 - subtra��o, 3 - divis�o ou 4 - multiplica��o):"));
			operacaoValida = (operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4);
			if (!operacaoValida)
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida, tente novamente.");
			
		} while (!operacaoValida);
		
		float op2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo valor:"));
		
		Calculadora c = new Calculadora();
		switch (operacao) {
		case 1:
			System.out.println(op1 + " + " + op2 + " = " + c.somar(op1, op2));
			break;
		case 2:
			System.out.println(op1 + " - " + op2 + " = " + c.subtrair(op1, op2));
			break;
		case 3:
			System.out.println(op1 + " / " + op2 + " = " + c.dividir(op1, op2));
			break;
		case 4:
			System.out.println(op1 + " * " + op2 + " = " + c.multiplicar(op1, op2));
			break;
		default:
			break;
		}
	}
}
