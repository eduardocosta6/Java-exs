import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, d, e, f, x, y;
		
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C"));
		d = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de D"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de E"));
		f = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de F"));
		
		x = ((c*e)-(b*f))/(a*e)-((b*d));
		
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		
		
		System.out.println( "X = " + x + " Y = " + y);
	}

}
