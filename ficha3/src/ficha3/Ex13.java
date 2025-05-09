package ficha3;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// inserir notas dos testes
		double teste1 = Double.parseDouble(JOptionPane.showInputDialog("Insere a nota do primeiro teste de 0 a 20"));
		
		double teste2 = Double.parseDouble(JOptionPane.showInputDialog("Insere a nota do primeiro teste de 0 a 20"));
		
		// inserir notas dos trabalhos praticos
		
		double trab1 = Double.parseDouble(JOptionPane.showInputDialog("Insere a nota do primeiro trabalho de 0 a 20"));
		
		double trab2 = Double.parseDouble(JOptionPane.showInputDialog("Insere a nota do primeiro trabalho de 0 a 20"));
		
		double trab3 = Double.parseDouble(JOptionPane.showInputDialog("Insere a nota do primeiro trabalho de 0 a 20"));
		
		
		// inserir nota trabalho final
		
		double trabf = Double.parseDouble(JOptionPane.showInputDialog("Insere a nota do trabalho final de 0 a 20"));
		
		// medias
		
		double mediaTestes = (teste1 + teste2) /2;
		
		double mediaTrabalhos = (trab1 + trab2 + trab3) /3;
		
		// medias em percentagem
		
		double mediaT = mediaTestes * 0.60;
		
		double mediaTr = mediaTrabalhos * 0.20;
		
		double mediaTrF = trabf * 0.20;
		
		
		// nota final
		
		double notaFinal = mediaT + mediaTr + mediaTrF;
		

		
		System.out.println(notaFinal);
		
	}

}
