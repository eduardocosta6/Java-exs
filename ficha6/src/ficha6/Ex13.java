package ficha6;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int macasQ = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de maças"));
		
		double macasP = 0.30;
		double macasP2 = 0.25;
		
		if (macasQ >= 12) {
			double total =  macasQ * macasP2;
			System.out.println(total);
		}else if (macasQ < 12 ) {
			double total=  macasQ * macasP;
			System.out.println(total);
		}
		
	}

}
