package project0_methods;

public class Methods {

	public static int soma( int a, int b) {
		int s = 0;
		
		s = a + b;
		
		return s;
	}
	
	
	// #################################################
	
	public static void tres () {
		System.out.println("tres");
	}
	//#######################################
	
	public static void dois () {
		System.out.println("dois");
		tres();
	}
	
	//##############################################################
	
	
	public static void um() {
		System.out.println("um");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// void
		// um tipo
		// parametros
		
		
		um();
		um();
		dois();
		
		
		
		int x = 125, y = 561;
		int r = 0;
		
		
		r = soma(x, y);
		System.out.println(r);
		
		r = soma(14587, y);
		System.out.println(r);
		
		r = soma(x, 14563);
		System.out.println(r);
		

	}

}
