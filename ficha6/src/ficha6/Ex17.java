package ficha6;

import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A =  Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
		int B =  Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		
		
		if ( A == B) {
			int soma = A + B;
			System.out.println("A + " + "B = " + soma);
		} else {
			int multi = A * B;
			System.out.println("A x " + "B = " + multi);
			
		}
	}

}
