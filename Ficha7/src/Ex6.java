import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currency =  Integer.parseInt(JOptionPane.showInputDialog("Inserir para qual moeda quer converter 1 Us dolar / 2 libras / 3 yuan / 4 franco suiço"));
			
		double euro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em euros"));
		
		
		 switch(currency) {
		 case 1 : {
			 double usValue = 1.08;
			 double us = euro * usValue;
			 System.out.println(us);
			 break;
		 } case 2 : {
			 double ukValue = 1.29;
			 double uk = euro * ukValue;
			 System.out.println(uk);
			 break;
		 } case 3 : {
			 double chValue = 7.84;
			 double ch = euro * chValue;
			 System.out.println(ch);
			 break;
		 } case 4 : {
			 double swValue = 0.95;
			 double sw = euro * swValue;
			 System.out.println(sw);
			 break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
		
		

	}

}
