package ficha6;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Inserir um numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Inserir um numero"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Inserir um numero"));
		
		double maior = n1;
		
		if (n2 > maior) {
			
			maior = n2;
		}  if (n3 > maior) {
			
			maior = n3;
		}
		System.out.println(maior);

	}

}
