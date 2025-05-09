import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1 para tipo A 2 para tipo B e 3 para tipo C"));
		
		double distanciaKM = Double.parseDouble(JOptionPane.showInputDialog("insira a distancia em km"));
		
		
		 switch(tipo) {
		 case 1 : {
			 int litros = 12;
			 double TA = distanciaKM / litros;
			 System.out.println(TA);
			 break;
		 } case 2 : {
			 int litros = 9;
			 double TB = distanciaKM / litros;
			 System.out.println(TB);
			 break;
		 } case 3 : {
			 int litros = 8;
			 double TC = distanciaKM / litros;
			 System.out.println(TC);
			 break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }

	}

}
