import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op  = Integer.parseInt(JOptionPane.showInputDialog("1-Area retangulo \n"
				+ " 2- area Triangulo \n"
				+ " 3- Area Circunferencia \n"
				+ " 0 - sair"));
		double pi = 3.14;
		
	
		
		do {
			
		
		switch(op) {
		 	case 1 : {
		 		int retA  = Integer.parseInt(JOptionPane.showInputDialog("Inserir Altura do retangulo"));
		 		int retB  = Integer.parseInt(JOptionPane.showInputDialog("Inserir base do retangulo"));
		 		int totalRet = retA * retB; 
		 		System.out.println(totalRet);
		 		op  = Integer.parseInt(JOptionPane.showInputDialog("1-Area retangulo \n"
						+ " 2- area Triangulo \n"
						+ " 3- Area Circunferencia \n"
						+ " 0 - sair"));
			 break;
		 }	 case 2 : {
			 	int triA  = Integer.parseInt(JOptionPane.showInputDialog("Inserir Altura do triangulo"));
			 	int triB  = Integer.parseInt(JOptionPane.showInputDialog("Inserir base do triangulo"));
			 	int totaltri = triA * triB / 2; 
			 	System.out.println(totaltri);
			 	op  = Integer.parseInt(JOptionPane.showInputDialog("1-Area retangulo \n"
						+ " 2- area Triangulo \n"
						+ " 3- Area Circunferencia \n"
						+ " 0 - sair"));
			 break;
		 }	 case 3 : {
			 	int raio  = Integer.parseInt(JOptionPane.showInputDialog("Inserir o raio"));
			 	double totalcircle = pi * (raio * raio); 
			 	System.out.println(totalcircle);
			 	op  = Integer.parseInt(JOptionPane.showInputDialog("1-Area retangulo \n"
						+ " 2- area Triangulo \n"
						+ " 3- Area Circunferencia \n"
						+ " 0 - sair"));
			 break;
		 }  default : {
			 	System.out.println("===ERROR===");
			 break;
		 }
		 }
		
		} while (op != 0); 
			
		

	}

}
