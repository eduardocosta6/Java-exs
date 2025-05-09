package ficha3;
import javax.swing.JOptionPane;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double burger = Double.parseDouble(JOptionPane.showInputDialog("quantos hamburgers vai desejar [preço 2€]"));
		double cheeseBurger = Double.parseDouble(JOptionPane.showInputDialog("quantos cheeseburgers vai desejar [preço 2.5€]"));
		double fries = Double.parseDouble(JOptionPane.showInputDialog("quantos batatas fritas vai desejar [preço 0.75€]"));
		double juice = Double.parseDouble(JOptionPane.showInputDialog("quantos sumos vai desejar [preço 1€]"));
		
		// preço hamburger
		double burgerP = burger * 2;
		
		// preco cheeseburger
		double cheeseBurgerP = cheeseBurger * 2.5;
		
		// preco batatas fritas
		double friesP = fries * 0.75;
		
		// preco sumos 
		double juiceP = juice * 1;
		
		
		//preco total
		double totalP = burgerP + cheeseBurgerP + friesP + juiceP;
		
		
		
		
		System.out.println(" Burger : " + (int) burger + " CheeseBurger : " + (int)cheeseBurger + " Batatas Fritas : " + (int)fries + " Sumos : " + (int)juice + "  Total a pagar : " + totalP + "€" );
	}

}
