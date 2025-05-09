package ficha3;

import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	tm = Integer.parseInt(JOptionPane.showInputDialog("Inserir tempo em minutos"));
		
		int	vo = Integer.parseInt(JOptionPane.showInputDialog("Inserir velocidade inicial (m/s)"));

		int so = Integer.parseInt(JOptionPane.showInputDialog("Inserir deslocamento inicial (M)"));
		
		int	a = Integer.parseInt(JOptionPane.showInputDialog("Inserir acelaração (m/s²)"));
		
		int t = tm * 60; 
		
		int s = so + (vo * t) + ((int)((double) 1/2 * a * t * t));
		
		System.out.println("deslocamento final: " + s + "m"); 
	}

}