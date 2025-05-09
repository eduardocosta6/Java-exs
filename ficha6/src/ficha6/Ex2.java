package ficha6;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Inserir nota do primeiro teste "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Inserir nota do segundo teste "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Inserir nota do terceiro teste "));
		
		
		double media1 = nota1*3 ;
		
		double media2 = nota2*4 ;
		
		double media3 = nota3*5 ;
		
		double media = (media1 + media2 + media3) /12;
		
		
		if (media < 7.5) {
			System.out.println("Reprovado " + "com media de : " + media);
		} else if ( media < 9.5) {
			System.out.println("Admitido a exame " + "com media de : " + media);
		} else {
			System.out.println("Dispensado a exame " + "com media de : " + media);
		}
			
			
	}

}
