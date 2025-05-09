package ficha11;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x1 = 0 + (int) (20 * Math.random());
		double x2 = 0 + (int) (20 * Math.random());
		
		double  y = 0;
		double x = 0;
		
		double y1 = 5;
		double y2 = 4;
		
		double pi = Math.PI;
		
		double raio = 10;
		
		
		double dp1 =    Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2)) ;
		
		
		 System.out.println("Ponto: (" + x1 + ", " + y1 + ")");
	        System.out.println("Centro: (" + x + ", " + y + ")");
	        System.out.println("Raio: " + raio);
	        System.out.println("Distância do ponto ao centro: " + dp1);
		
		if ( dp1 <= raio) {
			System.out.println("p1 Está dentro da circuferência");
		} else {
			System.out.println("p1 Está fora da circuferência");
		}
		

	}

}
