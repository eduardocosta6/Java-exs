package ficha6;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int macaco1 = Integer.parseInt(JOptionPane.showInputDialog(" [macaco 1 ]Inserir 0 para macaco feliz e 1 para macaco triste"));
		int macaco2 = Integer.parseInt(JOptionPane.showInputDialog(" [macaco 2 ]Inserir 0 para macaco feliz e 1 para macaco triste"));
		
		if (macaco1 == 1 && macaco2 == 1 || macaco1 == 0 && macaco2 == 0 ) {
			System.out.println("temos problemas.");
			
		} else if (macaco1 == 0 && macaco2 == 1 || macaco1 == 1 && macaco2 == 0 ) {
			System.out.println("Não temos problemas.");
		} else {
			System.out.println("ERROR");
		}
	
	}
}
