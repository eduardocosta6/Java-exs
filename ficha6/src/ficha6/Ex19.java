package ficha6;

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double	precoO = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto"));
		
		System.out.println("esclha método de pagamento");
		System.out.println( "1 - Em dinheiro / 2 - Com cartão de crédito / 3 - Em duas vezes / 4 - Em tres vezes " );
		
		
		int metodoP = Integer.parseInt(JOptionPane.showInputDialog("Inserir o metudo de pagamento de 1 a 4"));
		
		if ( metodoP == 1 ) {
			double	precoFinal1 = precoO - (precoO * 0.10);
			System.out.println(precoFinal1 + "€");
		} else if (metodoP == 2) {
			double	precoFinal2 = precoO - (precoO * 0.15);
			System.out.println(precoFinal2 + "€");
		} else if ( metodoP == 3) {
			double precoFinal3 = precoO / 2;
			System.out.println("O preço da primeira parcela é de " + precoFinal3 + "€");
			System.out.println("O preço da segunda parcela é de " + precoFinal3 + "€");
			
		} else if (metodoP == 4) {
			double  precoFinal4 = (precoO + (precoO * 0.10)) / 3;
			System.out.println("O preço da primeira parcela é de " + precoFinal4 + "€");
			System.out.println("O preço da segunda parcela é de " + precoFinal4 + "€");
			System.out.println("O preço da terceira parcela é de " + precoFinal4 + "€");
		} else {
			System.out.println("====ERRO====");
		}
		
		

	}

}
