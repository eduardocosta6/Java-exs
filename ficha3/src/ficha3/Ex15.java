package ficha3;
import javax.swing.JOptionPane;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horaEntra = Integer.parseInt(JOptionPane.showInputDialog("Insere a hora de entrada "));
		int minEntra = Integer.parseInt(JOptionPane.showInputDialog("Insere os minutos da entrada"));
		int horaSaidaA = Integer.parseInt(JOptionPane.showInputDialog("Insere a hora de saida para o almoço "));
		int minSaidaA = Integer.parseInt(JOptionPane.showInputDialog("Insere os minutos de saida para o almoço  "));
		
		int horaEntraA = Integer.parseInt(JOptionPane.showInputDialog("Insere a hora de entrada depois de almoço"));
		int minEntraA = Integer.parseInt(JOptionPane.showInputDialog("Insere os minutos da entrada depois almoço"));
		int horaSaida= Integer.parseInt(JOptionPane.showInputDialog("Insere a hora de saida "));
		int minSaida = Integer.parseInt(JOptionPane.showInputDialog("Insere minutos de saida"));
		
		
		int minTotalM =  minSaidaA - minEntra  ;
		
		int minTotalT = minSaida - minEntraA;
		
		
		int minTotal =  minTotalM + minTotalT;
		
	

	
		
		int  horaManha = horaSaidaA - horaEntra;
		
		int  horaTarde = horaSaida - horaEntraA;
		
		int horaTotal = horaManha + horaTarde;
		
		
		int horaTotalM =  horaTotal * 60;
		
		
		int totalM = horaTotalM + minTotal;
		
		
		int horas = totalM / 60;
		
		int min = totalM % 60;
		
			
		
		System.out.println( horas+ ":" +min);
	}

}
