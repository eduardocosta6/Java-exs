import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia =  Integer.parseInt(JOptionPane.showInputDialog("Insira o dia"));
		int mes =  Integer.parseInt(JOptionPane.showInputDialog("Insira o mes"));
		int ano =  Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
		
		
		
		int n = Integer.parseInt (dia + "" + mes + "" + ano);
		
		int z = n % 9 ;
		
		 switch(z) {
		 case 1 : {
			 System.out.println("Irresistível");
			 break;
		 } case 2 : {
			 System.out.println("Impetuoso");
			 break;
		 } case 3 : {
			 System.out.println("Discreto");
			break;
		 } case 4 : {
			 System.out.println("Amoroso");
			break;
		 } case 5 : {
			 System.out.println("Tímido");
			break;
		 } case 6 : {
			 System.out.println("Conquistador");
			break;
		 } case 7 : {
			 System.out.println("Estudioso");
			break;
		 } case 8 : {
			 System.out.println("Sonhador");
			break;
		 } case 9 : {
			 System.out.println("Charmoso");
			break;
		 }  default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
		

	}

}
