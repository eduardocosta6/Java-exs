package ficha9;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int div = Integer.parseInt(JOptionPane.showInputDialog("Inserir divisor"));
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro numero do intrevalo"));
		
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir segundo numero do intrevalo"));
		
		
		int n = 0;
		
		

		for( n = n1 ; n <= n2; n++ ) {
			
			if ( n % div == 0) {
				
				System.out.println(n + " É divisivel por " + div);
			} 
				
			
		}
		
		

	}

}
