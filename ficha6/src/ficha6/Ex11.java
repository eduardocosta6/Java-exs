package ficha6;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog(" A que horas o papagaio cantou"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog(" A que minutos o papagaio cantou"));
		int papagaio = Integer.parseInt(JOptionPane.showInputDialog(" o papagio estava a cantar? [0 para nao e 1 para sim ]")); 
		
		int totalM = hora * 60 + minutos;
		double totalHoras =  totalM / 60;
		
		if (totalHoras < 7 && papagaio == 1  || totalHoras >= 20 && papagaio == 1 ) {
			System.out.println("Temos problemas");
		} else {
			System.out.println("Não temos problemas");
		}

	}

}
