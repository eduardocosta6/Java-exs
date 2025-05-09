package ficha3;

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Inserir tempo em segundos "));
		
		int horas = segundos / 3600;
		
		int minutos = (segundos % 3600) / 60;
		
		int restoSegundos = segundos % 60;
		
		
		System.out.println ( segundos + "s " + "= " +  horas + "h " + minutos + "m " + restoSegundos + "s ");

	}

}
