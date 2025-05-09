package ficha12;

import javax.swing.JOptionPane;

public class Ex7 {

	
	public static int conta(int x, int a, int b) {
		
		int n = 0;

		 for( n = a ; n < b; n++ ) {
				
				if ( n % x == 0) {
					
					System.out.println(n + " É divisivel por " + x);
					
					
				}
		 }
		 return n;
				} 
					
				
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  x = Integer.parseInt(JOptionPane.showInputDialog("Inserir valor do divisor"));
		int a = Integer.parseInt(JOptionPane.showInputDialog("Inserir valor de A"));
		int  b = Integer.parseInt(JOptionPane.showInputDialog("Inserir valor de B"));
		
		
		int r = conta(x, a, b);
		
		System.out.println(r + " É divisivel por " + x);

	}

}
