import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Inserir um numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Inserir um numero"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Inserir um numero"));
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("1 para maior / 2 para menor / 3 para media / 4 para soma"));
		
		double maior = n1;
		
		if (n2 > maior) {
			
			maior = n2;
		}  if (n3 > maior) {
			
			maior = n3;
		} 
		
		
		double menor = n1;
		if (n2 < menor) {
			
			menor = n2;
		}  if (n3 < menor) {
			
			menor = n3;
		} 
		

		double media = (n1 + n2 +n3) / 3 ;
		
		
		double soma = n1 + n2 + n3;
		
		
		n1 = 2;
		 switch(op) {
		 case 1 : {
			 System.out.println(maior);
			 break;
		 } case 2 : {
			 System.out.println(menor);
			 break;
		 } case 3 : {
			 System.out.println(media);
			break;
		 }case 4 : {
			 System.out.println(soma);
			 break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
		
		
	}

}
