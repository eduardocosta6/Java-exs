import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op  = Integer.parseInt(JOptionPane.showInputDialog("1-cubo / 2-Prisma Retangular / 3-Esfera / 4-cilindro / 5-cone / 6-Pirâmde"));
		double pi = 3.14;
		 switch(op) {
		 case 1 : {
			 int cubo  = Integer.parseInt(JOptionPane.showInputDialog("Inserir comprimento dos lados"));
			 
			 int totaCubo = cubo * cubo * cubo; 
			 System.out.println( totaCubo);
			 break;
		 } case 2 : {
			 double comp = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento"));
			 double largura = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura"));
			 double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura"));
			 
			 double prisma = comp * largura * altura;
			 
			 System.out.println(prisma);
			 break;
		 } case 3 : {
			 double raioEsfera = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio esfera"));
			 
			 double raio = (raioEsfera * raioEsfera * raioEsfera * pi * 4) / 3;
			 
			 System.out.println(raio);
			break;
		 } case 4 :{
			 double raioCil= Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do cilindro"));
			 double alturaCil = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do cilindro"));
			 
			 double cilindro = pi * raioCil * raioCil * alturaCil;
			 
			 System.out.println(cilindro);
			 break;
		 } case 5 :{
			 double raioCone= Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do cilindro"));
			 double alturaCone = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do cilindro"));
			 
			 double cone = (pi * raioCone * raioCone * alturaCone) / 3;
			 
			 System.out.println(cone);
			 break;
		 } case 6:{
			 double ladosPiramide= Double.parseDouble(JOptionPane.showInputDialog("Insira a medida dos lados"));
			 double alturaPiramide= Double.parseDouble(JOptionPane.showInputDialog("Insira a medida dos lados"));
			 
			 double piramide = (ladosPiramide * ladosPiramide * alturaPiramide) / 3;
			 
			 System.out.println(piramide);
			 break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
		
	}

}
