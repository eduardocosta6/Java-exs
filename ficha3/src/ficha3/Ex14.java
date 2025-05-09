package ficha3;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inserir valores altura paredes

		double alt1 = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura da parede 1 em metros"));
		
		double alt2 = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura da parede 2 em metros"));
		
		double alt3 = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura da parede 3 em metros"));
		
		double alt4 = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura da parede 4 em metros"));
		
		// inserir valores comprimento paredes

		double comp1 = Double.parseDouble(JOptionPane.showInputDialog("Insere o comprimento  da parede 1 em metros"));
				
		double comp2 = Double.parseDouble(JOptionPane.showInputDialog("Insere o comprimento  da parede 2 em metros"));
				
		double comp3 = Double.parseDouble(JOptionPane.showInputDialog("Insere o comprimento  da parede 3 em metros"));
			
		double comp4 = Double.parseDouble(JOptionPane.showInputDialog("Insere o comprimento  da parede 4 em metros"));
		
		
		// inserir valores aluta das janelas
		
		double janA1 = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura da janela 1 em metros"));
		
		double janA2 = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura da janela 2 em metros"));
		
		
		// inserir comprimento janelas 
		
		double janC1 = Double.parseDouble(JOptionPane.showInputDialog("Insere o comprimento da janela 1 em metros"));
		
		double janC2 = Double.parseDouble(JOptionPane.showInputDialog("Insere o comprimento da janela 2 em metros"));


		// tamanho total da sala em metros
		
		double metrosP1 = alt1 * comp1;
		
		double metrosP2 = alt2 * comp2;
		
		double metrosP3 = alt3 * comp3;
		
		double metrosP4 = alt4 * comp4;
		
		
		// tamanho total das janelas em metros
		
		double metrosJ1 = janA1 * janC1;
				
		double metrosJ2 = janA2 * janC2;
		
		// total da casa em m quadrados
		
		double totalm2 = metrosP1 + metrosP2 + metrosP3 + metrosP4;
		
		// total janelas em m quadrados
		
		double totalJm2 = metrosJ1 + metrosJ2;
		
		// total casa sem janelas me m2
		
		double totalCm2 = totalm2 - totalJm2;
		
		
		
		// total da tinta em litros
		
		double TotalTinta = (totalCm2 * 20); 
		
		
		
		System.out.println(TotalTinta + "litros");
		
		
		

	}

}
