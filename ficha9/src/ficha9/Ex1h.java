package ficha9;

import javax.swing.JOptionPane;

public class Ex1h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		int soma = 0;
		int i  ;
		
		
		for(i  = a ; i <= b; i++ ) {
			soma += i;
			
			System.out.println(soma + " ");
		}

	}

}
