package ficha12;

import javax.swing.JOptionPane;
public class Ex2 {
	
	// #######################################
	
	
	public static void intensidade(double a, double b) {
		
		double i = 0;
		
		i = a / b;
		
		System.out.println("A intensidade é " + i);
	}
	
	// #######################################
	
	
	public static void resistencia(double a, double b) {

		double r =0 ;
		r = a / b;
		System.out.println("A resistencia é " + r);
	}
	
	public static void voltagem(double a, double b) {
		
		double voltagem = 0;
		
		voltagem = a * b;
		
		
		System.out.println("A voltagem é " + voltagem);
	}
	
	//################################################
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		
		do {
			 n1 = Integer.parseInt(JOptionPane.showInputDialog(" 1-resistencia / 2-intensidade / 3-voltagem / 0-Sair"));
		
		
		 switch(n1) {
		 case 1 : {
			 double v = Double.parseDouble(JOptionPane.showInputDialog("Inserir voltagem"));
			 double i = Double.parseDouble(JOptionPane.showInputDialog("Inserir intensidade"));
			 
			 resistencia(v, i);
			 break;
		 } case 2 : {
			 double v = Double.parseDouble(JOptionPane.showInputDialog("Inserir voltagem"));
			 double r = Double.parseDouble(JOptionPane.showInputDialog("Inserir resistencia"));
			 
			 intensidade(v, r);
			 break;
		 } case 3 : {
			 double i = Double.parseDouble(JOptionPane.showInputDialog("Inserir intensidade"));
			 double r = Double.parseDouble(JOptionPane.showInputDialog("Inserir resistencia"));
			 voltagem(i, r);
			 break;
		 }
		 case 0 : {
			 System.out.println("o programa fechou");
			 break;
		 }default : {
			 System.out.println("===ERROR===");
		 }
		 }
		 } while ( n1 !=0);
	
		
	

}
}