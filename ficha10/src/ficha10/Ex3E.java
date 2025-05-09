package ficha10;

public class Ex3E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int tamanho = 5;
		 for(int l = 1; l <= tamanho; l++) {
			 for ( int c = 1; c <= tamanho; c++) {
				 if (  c <= l) {
					 System.out.print( " " + c  + " ");
				 }
			 }
			 System.out.print("\n");
		 }

	}

}
