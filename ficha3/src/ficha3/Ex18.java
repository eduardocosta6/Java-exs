package ficha3;

import javax.swing.JOptionPane;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Inserir Peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Inserir altura"));
		
		
		double imc = peso / (altura * altura) ;
		
		System.out.println("IMC = " + imc );
		
		
	}

}
