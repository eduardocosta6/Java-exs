package ficha9;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 ;
		
		int par = 0;
		int impar = 0;
		
		
		for( n1 = 0; n1 <= 10; n1++ ) {
			if( n1 % 2 == 0) {
				 par++;
				 
			} else {
				impar++;
				
			}
				
		} 
		
		System.out.println( par + " numeros pares");
		System.out.println( impar + " numeros impares");

	}

}
