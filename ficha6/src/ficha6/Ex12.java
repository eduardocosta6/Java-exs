package ficha6;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int password = Integer.parseInt(JOptionPane.showInputDialog("Insira a Password"));
		
		if ( password  == 1234 ) {
			System.out.println ("Acesso permitido");
		}else if (password != 1234) {
			System.out.println ("Acesso negado");
		}

	}

}
