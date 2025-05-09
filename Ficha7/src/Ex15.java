import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia =  Integer.parseInt(JOptionPane.showInputDialog("Insira o dia"));
		int mes =  Integer.parseInt(JOptionPane.showInputDialog("Insira o mes"));
		int ano =  Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
		
		int dtJuliana = (1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12*((mes-14)/12)))/12-(3*((ano+4900+(mes - 14)/12)/100))/4+dia-32075;
		
		int diaFinal = (dtJuliana % 7) + 1;
		
		 switch(diaFinal) {
		 case 1 : {
			 System.out.println("Segunda Feira");
			 break;
		 } case 2 : {
			 System.out.println("Terça Feira");
			 break;
		 } case 3 : {
			 System.out.println("Quarta Feira");
			break;
		 } case 4 : {
			 System.out.println("Quinta Feira");
			break;
		 } case 5 : {
			 System.out.println("Sexta Feira");
			break;
		 } case 6 : {
			 System.out.println("Sábado");
			break;
		 } case 7 : {
			 System.out.println("Domingo");
			break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
	}

}
