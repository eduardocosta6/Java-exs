import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir segundo numero"));
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1 para Adiçao / 2 para Subtração / 3 para Multiplicação / 4 para  divisão  / 5 para resto de divisão"));
		switch(op) {
		 case 1 : {
			 int sum = n1 + n2;
			 System.out.println(sum);
			 break; 
		 } case 2 : {
			 int sub = n1 - n2;
			 System.out.println(sub);
			 break;
		 } case 3 : {
			 int mult = n1 * n2;
			 System.out.println(mult);
			 break;
		 } case 4 : {
			 int div = n1 / n2;
			 System.out.println(div);
			 break;
		 } case 5 : {
			 int rest = n1 % n2 ;
			 System.out.println(rest);
			 break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		}
		
	
	}

}
