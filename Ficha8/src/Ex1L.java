import javax.swing.JOptionPane;

public class Ex1L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int numero ;
		
		
		

		        numero =  Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero que deseja  (0 para parar)"));

		        while (numero != 0) {
		        	  soma += numero;
		            System.out.println( soma + " EScreve um numero (0 para parar): ");
		            numero =  Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero que deseja"));
		        }

		        System.out.println("A soma final é: " + soma);
		    }
		
		
	}

