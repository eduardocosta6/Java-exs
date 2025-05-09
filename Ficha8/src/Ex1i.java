import javax.swing.JOptionPane;

public class Ex1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero que deseja"));
		
		int divisor = 2;
		boolean isPrimo = true;
		
		do { 
			if (n1 % divisor == 0 && divisor != n1) {
            isPrimo = false;
            break;
			}
			
			divisor ++;
		} while (divisor < n1);
		
		if (isPrimo && n1 > 1) {
			System.out.print( " primo ");
		} else {
			System.out.print( "nao  primo ");
		}
	}

}
