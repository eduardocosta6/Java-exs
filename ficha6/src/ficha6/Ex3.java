package ficha6;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sexo = Double.parseDouble(JOptionPane.showInputDialog("Inserir 1 para mulher ou 2 para homem"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("inserir altura"));
		
		if ( sexo == 1) {
			
			double totalM = (62.1 * altura) - 44.7;
			
			System.out.println(totalM);
		} else if (sexo == 2) {
			
			double totalH = (72.7 * altura) - 58;
			
			System.out.println(totalH);
			
		}

	}

}
