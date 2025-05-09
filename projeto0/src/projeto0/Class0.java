package projeto0;
import javax.swing.JOptionPane;
public class Class0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// comentario
		
		/*
		 * 
		 * comentario de varias linhas 
		 * 
		 * 
		 * 
		 */
		
		// declarar variaveis
		
		int n1;
		
		int n2, n3;
		
		int n4 = 10; //inicializar
		
		double d1 = 2.5;
		
		char l1 = 'A';
		
		boolean fim = false;
		
		String nome = "Maria";
		
		
		// atribuir valores
		
		n1 = 5;
		n2 = 100;
		n3 = 25;
		n4 = 11;
		
		
		// escrever (printing)
		
		System.out.println ("Hello World");
		
		System.out.println (n1);
		
		System.out.println("n1" + n1); //concatenar
		
		System.out.println ("n1" + n1 + "n2" + n2);
		
		System.out.println ("n1" + n1 + "\nn2" + n2);
		
		
		// operadores ariteméticos 
		
		// + - * /
		
		// % -> resto da divisão
		
		//++ --
		
		// +=
		
		
		
		n1 = n2 * n3;
		System.out.println ("n1=" + n1);
		
		
		n1++;
		System.out.println ("n1=" + n1);
		
		
		n1+=100;
		System.out.println ("n1=" + n1);
		
		// converter entre tipos 
		// string -> int
		String s = "100";
		
		n1=Integer.parseInt(s);
		
		
		// string -> double
		
		s = "2.5";
		d1 = Double.parseDouble(s);
		
		// numero -> String 
		s = String.valueOf(d1);
		
		
		// ler
		// string
		s = JOptionPane.showInputDialog("Inserir Nome");
		
		//int
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));
		
		//double
		d1 = Double.parseDouble(JOptionPane.showInputDialog("hjmhmjhjm"));
		
		// cast
		d1 = (double)200/(double)n2;
		System.out.println("d1" + d1);
		
		// ==========================
		
		//estruturas de controlo
		
		// condicionais e de repetição
		
		
		// condicionais - if .... ELSE, switch .... case~
		
		// repetição - do ... while,  for ...
		
		// operadores relacionais 
		// == =! > >= < <=
		
		// operadores logicos
		// E -> &&           ou -> ||
		// if
		
		
		n1 = 5;
		if (n1 == 5 ) {
			System.out.println("ok");
		}
		
		if(n1 < 4) {
		n1++;
	   } else {
		   n1 --;
	   }
		System.out.println(n1);
		
		
		n1 = 5;
		if ( n1 <= 3) {
			n1 += 2;
		} else if (n1 < 5) {
			n1 += 6 ;
		} else {
			n1 += 6;
		}
		
		
		
		n1 = 5;
		n2 = 2;
		// operadores logicos
		
		if (n1 == 5 && n2 > 10) {
			System.out.println("ok");
		}
		
		if (n1 == 5 || n2 > 10) {
			System.out.println("ok2");
		}
		
		// switch case
		 n1 = 2;
		 switch(n1) {
		 case 1 : {
			 System.out.println(n1);
			 break;
		 } case 2 : {
			 System.out.println(n1);
			 break;
		 } case 3 : {
			 System.out.println(n1);
			break;
		 } default : {
			 System.out.println("===ERROR===");
			 break;
		 }
		 }
		 
		 
		 // while
		 n1=1;
		 
		 do {
			 System.out.println("===ERROR===");
			 n1++;
		 } while ( n1 <=5);
		 
		 
		 // for
		 
		 for (int i = 1; i <= 5 ; i ++) {
			 System.out.println(i);  
		 }
		 
		 
		 // pattern
		 
		 int n = 10;
		 for(int i = 1; i <= n; i++) {
			 for ( int c = 1; c <= n; c++) {
				 if (c == n - 1) {
					 System.out.print("1");
				 } else {
					 System.out.print("0");
				 }
			 }
			 System.out.print("\n");
		 }
		
}
}