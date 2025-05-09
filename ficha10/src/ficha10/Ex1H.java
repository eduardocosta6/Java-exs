package ficha10;

public class Ex1H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 5;
		 for(int i = 1; i <= n; i++) {
			 for ( int c = 1; c <= n; c++) {
				 if (c == n - 2 || i == n - 2) {
					 System.out.print(" 0 ");
				 } else {
					 System.out.print(" 1 ");
				 }
			 }
			 System.out.print("\n");
		 }


	}

}
