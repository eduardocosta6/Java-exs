import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		int count = 1;
		int fatorial = 1 ;
		 
		
		do {
			
			fatorial *= count;
			count ++;
			System.out.println(fatorial);
		} while( count <= n1);
 
	}

}
