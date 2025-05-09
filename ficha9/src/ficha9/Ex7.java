package ficha9;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int in = 0;
		int out = 0;

		for( i = 1; i <=10 ; i++){
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
			
			if( n1 < 10 || n1 > 20) {
				in ++;
			} else {
				out ++;
			}
			
		}
		
		System.out.println(in + " Numero dentro do intrevalo de [10,20]");
		System.out.println(out +  " Numero fora do intrevalo de [10,20]");
	}

}
