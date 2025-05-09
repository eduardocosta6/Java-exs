package ficha6;

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		
		if (n1  % 10 == 0) {
			System.out.println("O numero é divisivel por 10");
		} else if (n1  % 5 == 0) {
			System.out.println("O numero é divisivel por 5");
		} else if (n1 % 2 == 0) {
			System.out.println("O numero é divisivel por 2");
		} else {
			System.out.println("O numero nao é divisivel por 10, 5 nem 2 ");
		}

	}

}
