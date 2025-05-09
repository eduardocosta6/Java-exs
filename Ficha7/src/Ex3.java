import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia  = Integer.parseInt(JOptionPane.showInputDialog("Inserir dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Inserir mes"));
		
		 switch(mes) {
		 case 1 : {
				 if (dia < 1 || dia > 31) {
				 System.out.println("===ERRO===");
				 break;
			 }
		 } case 2 : {
			 if (dia < 1 || dia > 28) {
				 System.out.println("===ERRO===");
				 break;
			 } 
		 } case 3 : {
			 
			 if (dia < 1 || dia > 31 ) {
				 System.out.println("===ERRO===");
				 break;
			 }if (dia >= 1 || dia <= 19) {
				 System.out.println("Inverno");
			 } else if (dia >= 20  || dia <= 31) {
				 System.out.println("Primavera");
			 }
			 break;
		 }case 4 : {
			 if (dia < 1 || dia > 30 ) {
				 System.out.println("===ERRO===");
				 break;
			 }
			 
		 }case 5 : {
			 if (dia < 1 || dia > 31 ) {
				 System.out.println("===ERRO===");
				 break;
			 }
			 
		 }case 6 : {
			 if (dia < 1 || dia > 30 ) {
				 System.out.println("===ERRO===");
				 break;
				 }if (dia >= 1 || dia <= 20) {
					 System.out.println("Primavera");
				 } else if (dia >= 21  && dia <= 31) {
					 System.out.println("Verão");
				 }
				 break;
			 }case 7 : { 
			 if (dia < 1 || dia > 31 ) {
				 System.out.println("===ERRO===");
				 break;
		 }
		 }case 8 : {
				if (dia < 1 || dia > 31) {
				 System.out.println("===ERRO===");
				 break;
			 }
			 
		 }case 9 : {
			   if (dia < 1 || dia > 30) {
				 System.out.println("===ERRO==="); 
				 break;
				 }  if ( dia >= 1 || dia <= 21) {
					 System.out.println("Verão");
				 }else if (dia >= 22  || dia <= 30) {
					 System.out.println("Outono");
				 }
				 break;
		 }case 10 : {
			 if (dia < 1 || dia > 31) {
				 System.out.println("===ERRO===");
				 break;
			 }
		 }case 11 : {
			 if (dia < 1 || dia > 30 ) {
				 System.out.println("===ERRO===");
				 break;
			 }
			 
		 }case 12 : {
			 if (dia < 1 || dia > 31) {
				 System.out.println("===ERRO==="); 
				 break;
				 }  if ( dia >= 1 || dia <= 20) {
					 System.out.println("Outono");
				 }else if (dia >= 21  || dia <= 30) {
					 System.out.println("Inverno");
				 }
				 break;
			}default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
	}

}
