package ficha10;

public class Ex6G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int tamanho = 5;
		 
		 
		 for(int l = 1; l <= tamanho; l++) {
			 for ( int c = 1; c < l ; c++) {
				 System.out.print("  ");		 
				 }
			 
			 for ( int x = 1; x <= tamanho - l + 1 ; x++) {
				 System.out.print("* ");	
			 }
			 
			 for(int z = 1; z <= tamanho; z++) {
				 for ( int c = 1; c <= tamanho; c++) {
					 if ( c <= z) {
						 System.out.print("* ");
					 }
				 }
				 System.out.print("\n");
			 }
		 
		 }

		 
	}

}
