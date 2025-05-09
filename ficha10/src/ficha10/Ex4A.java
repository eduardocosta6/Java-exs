package ficha10;

public class Ex4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int tamanho = 5;  

	        for (int l = 1; l <= tamanho; l++) {

	            for (int c = 1; c <= l; c++) {
	                System.out.print(c + " ");
	            }


	            int espacos = (tamanho - l) * 2;  
	            for (int s = 1; s <= espacos; s++) {
	                System.out.print("  ");
	            }


	            for (int c = 1; c <= l; c++) {
	                System.out.print(l - c + 1 + " ");
	            }

	            System.out.println();  
	        }
	}
 }



