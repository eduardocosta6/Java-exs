package ficha10;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamanho = 5;

		for (int l = 1; l <= tamanho; l++) {

		    for (int c = 1; c < l; c++) {
		        System.out.print("  ");
		    }

		    System.out.print(l + " ");

		    int espacos = (tamanho - l) * 2 - 1;
		    for (int s = 1; s <= espacos; s++) {
		        System.out.print("  ");
		    }

		    if (l != tamanho) {
		        System.out.print(l);
		    }

		    System.out.println();
		}

		for (int l = tamanho - 1; l >= 1; l--) {

		    for (int c = 1; c < l; c++) {
		        System.out.print("  ");
		    }

		    System.out.print(l + " ");

		    int espacos = (tamanho - l) * 2 - 1;
		    for (int s = 1; s <= espacos; s++) {
		        System.out.print("  ");
		    }

		    System.out.print(l); 

		    System.out.println();
		}
		
		

	}

}



