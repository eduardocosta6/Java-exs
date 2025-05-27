import javax.swing.*;

public class Ex7 {


    // funcao para menu switch case
    public static int pedirNumInt( String s) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

        return n1;
    }

    public static int random(int x)  {

        return
        -5 + ( int) ( 41 * Math.random());
    }

    public static void check(int max[], int min[])  {
        for( int k = 0 ; k < max.length ; k++ )  {
            int a, b;

            do {
                a = random(0);
                b = random(0);
            } while ( a == b);

            if ( a < b) {
                min[k] = a;
                max[k] = b;
            } else  {
                min[k] = b;
                max[k] = a;
            }
        }
    }

    public static int menor(int min[]) {

        int menorValor = min[0];
        for (int i = 1; i < min.length; i++) {
            if (min[i] < menorValor) {
                menorValor = min[i];
            }
        }
        return menorValor;
    }


    public static int maior(int max[]) {

        int maiorValor = max[0];
        for ( int i = 1; i < max.length; i++) {
            if (max[i] > maiorValor) {
                maiorValor = max[i];
            }
        }
        return maiorValor;
    }

    public static void main(String[] args) {

        int op = 0;

        int[] max = new int[30];

        int[] min = new int[30];


         check(max, min);


         do {

             op = pedirNumInt("1 para mostrar todas as temperaturas maximas \n" +
                     "2 para mostrar toda as temperaturas minimas \n" +
                     "3 calcular a amplitude \n" +
                     "0 sair");

             switch ( op ) {
                 case 1 : {
                     int s = maior(max);
                           System.out.print("A maior temparatura é  " + s);
                     break;
                 } case 2 : {
                     System.out.println( " \n");
                     int s = menor(min);
                     System.out.print("A menor temparatura é  " + s);

                     break;
                 } case 3 : {
                     System.out.println( " \n");
                     int  s =  menor( min);
                     int r = maior(max);

                     int y = r - s;

                     System.out.println(" A maior  amplitude termica é " + y);

                     break;

                 } case 0 : {
                     System.out.println( " \n");
                     System.out.println("========================");
                     System.out.println("========================");
                     System.out.println("===Programa terminado===");
                     System.out.println("========================");
                     System.out.println("========================");
                     break;

                 } default: {
                     System.out.println("===ERROR===");
                     break;
                 }
             }
         } while ( op != 0);











    }
}
