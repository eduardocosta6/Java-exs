import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes =  Integer.parseInt(JOptionPane.showInputDialog("Inseriro codigo do produto de 1  a 15"));
		
		 switch(mes) {
		 case 1 : {
			 System.out.println("Alimentação nao perecivel");
				break;
		 } case 2 : {
			 
		 } case 3 : {
			 
		 } case 4 : {
			 System.out.println("Alimentação  perecivel");
				break;
		 } case 5 : {
			 
		 } case 6 : {
			 System.out.println("Vestuário");
				break;
		 } case 7 : {
			 System.out.println("Higiene Pessoal");
				break;
		 } case 8 : {
			 
		 } case 9 : {
			 
		 } case 10 : {
			 
		 } case 11 : {
			 
		 } case 12 : {
			 
		 }  case 13 : {
			 
		 }  case 14 : {
			 
		 }  case 15 : {
			 System.out.println("Limpeza e Utensílios Domésticos");
				break;
		 }  default : {
			 System.out.println("===ERROR===");
			 System.out.println("Código inválido");
			 break;
		 }
		 }


	}

}
