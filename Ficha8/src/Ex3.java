import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 5 - Resto da Divisão /  0 - para sair"));
		
		
		 do {
			 switch(operacao) {
			 case 1 : {
				 int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro número"));
				 int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir  segundo número"));
				 double sum = n1 + n2;
				 System.out.println("O resultado da soma é " + sum);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 5 - Resto da Divisão /  0 - para sair"));
				 break;
			 } case 2 : {
				 int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro número"));
				 int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir  segundo número"));
				 double sub = n1 - n2;
				 System.out.println("O resultado da subtração é " + sub);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 5 - Resto da Divisão /  0 - para sair"));
				 break;
			 } case 3 : {
				 int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro número"));
				 int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir  segundo número"));
				 double mult = n1 * n2;
				 System.out.println("O resultado da multiplicação é " + mult);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 5 - Resto da Divisão /  0 - para sair"));
				break;
			 } case 4 : {
				 int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro número"));
				 int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir  segundo número"));
				 double div = n1 / n2;
				 System.out.println("O resultado da divisão é " + div);
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 5 - Resto da Divisão /  0 - para sair"));
				break;
			 }  case 5 : {
				 int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro número"));
				 int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir  segundo número"));
				 double rest = n1 % n2;
				 System.out.println("O resultado do resto da divisão é " + rest );
				 operacao = Integer.parseInt(JOptionPane.showInputDialog("Inserir 1- Somar / 2 - Subtrair / 3 - Multiplicar / 4 - Dividir / 5 - Resto da Divisão /  0 - para sair"));
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
