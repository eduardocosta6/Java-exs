package ficha3;

import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double horas = Double.parseDouble(JOptionPane.showInputDialog("Inserir total de horas durante o mes"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Inserir quantia  de euros por hora"));
		
		// achar salario bruto
		double salarioB = horas * salario;
		
		// achar quantia para a segurança social
		double salarioSS = salarioB * 0.11;
		
		// quantia para o IRS
		double salarioIRS = salarioB * 0.235;
		
		// salario liquido
		double salarioL = salarioB - salarioSS - salarioIRS;
		
		
		System.out.println("Salario Bruto: " + salarioB);
		System.out.println("Desconto para a Segurança  Social: " + salarioSS);
		System.out.println("Valor retido para efeito de IRS: " + salarioIRS);
		System.out.println("Salario Liquido: " + salarioL);
	}

}
