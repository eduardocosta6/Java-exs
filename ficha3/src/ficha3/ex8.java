package ficha3;
import javax.swing.JOptionPane;
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		double	r = Double.parseDouble(JOptionPane.showInputDialog("Inserir resistencia em ohms"));
		
		double	i = Double.parseDouble(JOptionPane.showInputDialog("Inserir intensidade em amperes"));
		
		double v = r * i ;
		
		System.out.println(v);
		
	}

}
