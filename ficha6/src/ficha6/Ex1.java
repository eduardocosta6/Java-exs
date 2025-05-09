package ficha6;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Inserir a sua idade"));
		
		if (idade <= 6) {
			System.out.println("Golfinho");
		} else if (idade <= 10 ) {
			System.out.println("Infantil");
		} else if (idade <= 13) {
			System.out.println("Juvenil");
		} else if ( idade <= 17) {
			System.out.println("Tubarão");
		} else {
			System.out.println("Cota");
		}
	}

}
