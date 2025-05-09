import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Calcular Voltagem / 2 - calcular Intensidade / 3 - calcular Resistencia / 0 - para sair"));
		
		
		 do {
			 switch(operacao) {
			 case 1 : {
				 int i = Integer.parseInt(JOptionPane.showInputDialog("Inserir intensidade em amperes"));
				 int r = Integer.parseInt(JOptionPane.showInputDialog("Inserir  resistencia em ohms"));
				 double voltagem = i * r;
				 System.out.println("A voltagem  é " + voltagem);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Calcular Voltagem / 2 - calcular Intensidade / 3 - calcular Resistencia / 0 - para sair"));
				 break;
			 } case 2 : {
				 int u = Integer.parseInt(JOptionPane.showInputDialog("Inserir volts"));
				 int r = Integer.parseInt(JOptionPane.showInputDialog("Inserir  resistencia em ohms"));
				 double intensidade = u / r;
				 System.out.println("A intensidade é " + intensidade);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Calcular Voltagem / 2 - calcular Intensidade / 3 - calcular Resistencia / 0 - para sair"));
				 break;
			 } case 3 : {
				 int u = Integer.parseInt(JOptionPane.showInputDialog("Inserir volts"));
				 int i = Integer.parseInt(JOptionPane.showInputDialog("Inserir intensidade em amperes"));
				 double resistencia = u / i;
				 System.out.println("A resistencia é " + resistencia);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Calcular Voltagem / 2 - calcular Intensidade / 3 - calcular Resistencia / 0 - para sair"));
				break;
			 } case 0 : {
				 System.out.println("SAIR ");
				break;
			 } default : {
				 System.out.println("===ERROR===");
				 break;
			 }
			 }
		 } while (operacao != 0);
	}

}
