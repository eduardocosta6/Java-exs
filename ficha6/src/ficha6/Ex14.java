package ficha6;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lados = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de lados"));
		int medida = Integer.parseInt(JOptionPane.showInputDialog("Insira a medida dos lados em cm"));
		
		if ( lados == 3) {
			int areaT = medida * medida / 2 ;
			System.out.println("É um triangulo com " + areaT + " de área!");
		} else if (lados == 4) {
			int areaQ = medida * medida;
			System.out.println("É um quadrado com " + areaQ + " de área!");
		} else if ( lados == 5) {
			System.out.println("É um Pentaguno ");
		}else {
			System.out.println("ERRO");
		}
	}

}
