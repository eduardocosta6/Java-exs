package ficha3;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double quantidadeEuro = Double.parseDouble(JOptionPane.showInputDialog("Insere a quantia em Euros"));
		
		
		double taxa = 1.0889;
		
		double quantidadeUsd = quantidadeEuro * taxa;
		
		
		System.out.println(quantidadeUsd);
		
	}

}
