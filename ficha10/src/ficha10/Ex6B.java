package ficha10;

public class Ex6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamanho = 5;
		 for(int l = 1; l <= tamanho; l++) {
			 for ( int c = 1; c <= tamanho; c++) {
				 if(l == 1 || l == 5 || c == 1 || c == 5) {
					 System.out.print(" * ");
				 } else {
					 System.out.print("   ");
				 }
			 }
			 System.out.print("\n");
		 }

	}

}
