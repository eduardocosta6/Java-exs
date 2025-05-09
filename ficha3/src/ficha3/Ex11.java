package ficha3;
import javax.swing.JOptionPane;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raio = Double.parseDouble(JOptionPane.showInputDialog("Insere o raio da base do cilindro"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Insere a altura  do cilindro"));
		
		double volume = raio * altura;
		
		System.out.println(volume);
		
		
	}

}
