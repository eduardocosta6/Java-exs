package ficha6;

import javax.swing.JOptionPane;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 =  Integer.parseInt(JOptionPane.showInputDialog("Insira nota 1 de 0 a 100"));
		int nota2 =  Integer.parseInt(JOptionPane.showInputDialog("Insira nota 2 de 0 a 100"));
		int nota3 =  Integer.parseInt(JOptionPane.showInputDialog("Insira nota 3 de 0 a 100"));
		int me =  Integer.parseInt(JOptionPane.showInputDialog("Insira a média de exercicios de 0 a 100"));
		int id =  Integer.parseInt(JOptionPane.showInputDialog("Insira ID do aluno"));
		
		int ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7 ;
		
		
		if (ma > 100) {
			System.out.println("====ERRO====");
		} else if (ma >= 90) {
			System.out.println("[A] Aprovado");
			System.out.println(" O aluno com o ID " + id + " teve as notas : " + nota1 + ", " + nota2 + ", " + nota3 + " / média dos exercicios :" + me );
		} else if ( ma >= 75) {
			System.out.println("[B] Aprovado");
			System.out.println(" O aluno com o ID " + id + " teve as notas : " + nota1 + ", " + nota2 + ", " + nota3 + " / média dos exercicios :" + me );
		} else if ( ma >= 60) {
			System.out.println("[C] Aprovado");
			System.out.println(" O aluno com o ID " + id + " teve as notas : " + nota1 + ", " + nota2 + ", " + nota3 + " / média dos exercicios :" + me );
		} else if ( ma >= 40) {
			System.out.println("[D] Reprovado");
			System.out.println(" O aluno com o ID " + id + " teve as notas : " + nota1 + ", " + nota2 + ", " + nota3 + " / média dos exercicios :" + me );
		}else if ( ma < 40) {
			System.out.println("[E] Reprovado");
			System.out.println(" O aluno com o ID " + id + " teve as notas : " + nota1 + ", " + nota2 + ", " + nota3 + " / média dos exercicios :" + me );
		} 
		
	}

}
