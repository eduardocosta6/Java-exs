package ficha9;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		
		int n;
		
		int t;
		for(n = 1; n <= 10; n++) {
			t = n1 * n;	
			
			System.out.println( n1 + " x " +  n +  " = " + t);
		}

	}

}
