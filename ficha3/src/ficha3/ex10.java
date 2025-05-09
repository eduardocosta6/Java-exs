package ficha3;

import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precoIni = Double.parseDouble(JOptionPane.showInputDialog("Inserir o preço inicial"));
		
		double desconto =  Double.parseDouble(JOptionPane.showInputDialog("Inserir o valor do desconto"));
		
		double descontoFull = precoIni * desconto ; 
		
		double  precoFinal = precoIni - descontoFull ;
		
		
		System.out.println("total descnto:" + descontoFull);
		
		System.out.println("preco final :" + precoFinal);
		
		
	}

}
