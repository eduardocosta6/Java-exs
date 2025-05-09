package ficha12;

import javax.swing.*;

public class Ex8 {

	public static double square( double a, double l) {
		double s = 0;

		s = a * l;

		return s;
	}

	public static double trian( double b, double a) {
		double s = 0;

		s = ( b * a) / 2;

		return s;
	}
	public static int pedirNumInt( String s) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

		return n1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int op;

		do {

			op = pedirNumInt("1 para grupo de terrenos A / 2  para grupo de terrenos B / 0 para sair");

			double x = 100 + (double) ( 100 * Math.random());

			switch(op) {
				case 1 : {
					// TerrenosA


					System.out.println();
					break;
				} case 2 : {
					// Terrenos 2
					double r = pedirNumInt("da ca um numero ");

					System.out.println(r);
					break;
				} case 0 : {
					System.out.println("Programa terminado");
					break;
				} default : {
					System.out.println("===ERROR===");
					break;
				}
			}


		} while( op!= 0);




		
	}

}
