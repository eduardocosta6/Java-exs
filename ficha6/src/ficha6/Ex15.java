package ficha6;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho de lado1"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamaho de lado2"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho de lado3"));
		
		if ( lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triangulo é Equilátero");
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("O triangulo é Isóscele");
		} else  {
			System.out.println("O triangulo é Escaleno");
		}
	}

}
