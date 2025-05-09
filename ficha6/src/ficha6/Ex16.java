package ficha6;

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ang1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a amplitude do angulo [ tendo em conta que a soma dos 3 tem de ser 180]"));
		int ang2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a amplitude do angulo [ tendo em conta que a soma dos 3 tem de ser 180]"));
		int ang3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a amplitude do angulo [ tendo em conta que a soma dos 3 tem de ser 180]"));
		
		int sum = ang1 + ang2 + ang3;
		
		if (sum != 180) {
			System.out.println("=======Erro========");
			System.out.println(" O total não é 180");
		} else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("O triângulo é retângulo");
		} else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
			System.out.println("O triângulo é Obtusângulo");
		} else if (ang1 < 90 || ang2 < 90 || ang3 < 90) {
			System.out.println("O triângulo é Acutângulo");
		}
		
	}

}
