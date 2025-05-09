package ficha10;

public class Ex6D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int tamanho = 5;
		 
		 
		 for(int l = 1; l <= tamanho; l++) {
			 for ( int c = 1; c <= tamanho - l; c++) {
				 System.out.print("  ");		 
				 }
			 
			 for ( int x = 1; x <= l ; x++) {
				 System.out.print("* ");	
			 }
		 
			 System.out.print("\n");
		 }
		 }

	

}
