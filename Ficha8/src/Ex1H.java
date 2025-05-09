import javax.swing.JOptionPane;

public class Ex1H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduza valor de A"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduza valor de B"));
		int soma = 0;
		do {
			soma += n1;
			 n1 ++;
		} while (n1 <= n2);
		
		System.out.print(soma+ " ");
	}

}
