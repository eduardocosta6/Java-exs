import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cachorro quente 1,70€ / Bifana Simples 2,30 / Bifana com ovo 2,60 / Hambúrguer 2,40 / Cheeseburger 2,50 / Sumo 1,00");
		int comida =  Integer.parseInt(JOptionPane.showInputDialog("Inserir o codigo do produto de 100 a 105"));
		int quantidade =  Integer.parseInt(JOptionPane.showInputDialog("Inserir a quantidade"));
		
		double preco1 = 1.70;
		double preco2 = 2.30;
		double preco3 = 2.60;
		double preco4 = 2.40;
		double preco5 = 2.50;
		double preco6 = 1.00;
		
		 switch(comida) {
		 case 100 : {
			 double cachorro = quantidade * preco1;
			 System.out.println(cachorro);
			 break;
		 } case 101 : {
			 double bifanaS = quantidade * preco2;
			 System.out.println(bifanaS);
			 break;
		 } case 102 : {
			 double bifanaOvo = quantidade * preco3;
			 System.out.println(bifanaOvo);
			 break;
		 } case 103 : {
			 double hamburger = quantidade * preco4;
			 System.out.println(hamburger);
			 break;
		 } case 104 : {
			 double cheeseburger = quantidade * preco5;
			 System.out.println(cheeseburger);
			 break;
		 } case 105 : {
			 double sumo = quantidade * preco6;
			 System.out.println(sumo);
			 break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }

	}

}
