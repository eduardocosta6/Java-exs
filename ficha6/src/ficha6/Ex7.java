package ficha6;
import javax.swing.JOptionPane;
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Inserir Peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Inserir altura"));
		
		
		double imc = peso / (altura * altura) ;
		
		if (imc <= 18.5) {
			System.out.println( imc + " Estas abaixo do peso normal");
		} else if(imc <= 25 ) {
			System.out.println( imc + " O teu peso esta na faixa da normalidade");
		} else if (imc >=30) {
			System.out.println( imc + " Esás acima do  peso normal");
		} else {
			System.out.println( imc + "  Obesidade, precisa perder algum peso");
		}
	
	
	
	
	

	}

}


