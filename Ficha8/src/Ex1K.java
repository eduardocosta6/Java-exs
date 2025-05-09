import javax.swing.JOptionPane;

public class Ex1K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero que deseja"));
		
		if (n1 > 20) {
			System.out.println("===ERRO===");
			
		}else {
		
		do {
			System.out.println(n1);
			n1 ++;
		} while (n1 <=15);
		
		}
	}

}
