package ficha6;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		
		if (n1 % 2 == 0) {
			System.out.println(n1 + " é um numero par ");
		} else {
			System.out.println(n1 + " nao é um numero par ");
		}
	}

}
