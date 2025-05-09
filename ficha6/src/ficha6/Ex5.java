package ficha6;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
		
		if (n1 % n2 == 0) {
			System.out.println( n1 + " é multiplo de " + n2);
		} else if (n2 % n1 == 0) {
			System.out.println( n2 + " é multiplo de " + n1);
		} else {
			System.out.println("Os numeros nao sao multiplos");
		}

	}

}
