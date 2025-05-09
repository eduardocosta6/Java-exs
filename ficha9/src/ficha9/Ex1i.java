package ficha9;

import javax.swing.JOptionPane;

public class Ex1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir um numero"));
		int divisor = 2;
		
		boolean isPrimo = true;
		
		
		if (n1 <1){
			isPrimo = false;
		} else {
			
			for ( divisor = 2; divisor < n1; divisor++ ) {
				if (n1 % divisor == 0  ) {
					isPrimo =  false;
					break;
				}
				
			}
			
		}
		 if ( isPrimo ) {
			 System.out.println( n1 + " É primo ");
		 } else  {
			 System.out.println(n1 + " Não é primo ");
		 }
		
	}

}

