package ficha6;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double horaT = Integer.parseInt(JOptionPane.showInputDialog("Insira as horas total"));
		double minT= Integer.parseInt(JOptionPane.showInputDialog("Insira minutos total"));
		
		double hora1 = 2;
		double hora2 = 3.5;
		
		
		double hora = horaT * 60 + minT;
		
		double min30 = hora / 30;
		
		
		if ( min30 <= 2 ) {
			System.out.println(hora1 + "€ ");
		} else if (min30 <= 4) {
			System.out.println(hora2 + "€ ");
		} else {
			System.out.println((min30 - 4) * 0.5 + hora2 + "€ ");
		}
			
		
		
	}

}
