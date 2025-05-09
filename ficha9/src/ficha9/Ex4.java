package ficha9;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		int count ;
		int fatorial = 1 ;

		if ( n1 < 1 || n1 > 20){
			System.out.println("===ERRO===");
		} else {
			for ( count = 1; count <= n1; count ++) {
				fatorial *= count;
				System.out.println(fatorial);
			}
			
		}
		
		
		
	}

}



