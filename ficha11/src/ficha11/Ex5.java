package ficha11;

public class Ex5 {

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5;
		int e1, e2;

		// Gerar 5 números diferentes entre 1 e 50
		 n1 = 1 + (int) ( 49 * Math.random());

		do {
			n2 = 1 + (int) ( 49 * Math.random());
		} while (n2 == n1);

		do {
			n3 = 1 + (int) ( 49 * Math.random());
		} while (n3 == n1 || n3 == n2);

		do {
			n4 = 1 + (int) ( 49 * Math.random());
		} while (n4 == n1 || n4 == n2 || n4 == n3);

		do {
			n5 = 1 + (int) ( 49 * Math.random());
		} while (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4);

		// Gerar 2 estrelas diferentes entre 1 e 12
		e1 = 1 + (int) ( 11 * Math.random());

		do {
			e2 = 1 + (int) ( 11 * Math.random());
		} while (e2 == e1);

		// Mostrar resultado
		System.out.println("Números: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
		System.out.println("Estrelas: " + e1 + " " + e2);
	}
}



