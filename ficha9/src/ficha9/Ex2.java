package ficha9;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero de 1 a 20"));
		String nome = JOptionPane.showInputDialog("Inserir Nome");
		
		int i ;
		
		
		if ( n1 < 1 || n1 > 20) {
			System.out.print( "===ERRO===");
			
		} else {
			for(i = 1; i <= n1; i++) {
				System.out.println( nome );
			}
			
		}
		
		
		
		
		
		
		
	}

}
