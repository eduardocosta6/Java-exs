import javax.swing.*;

public class Ex3 {


    // funcao para menu switch case
    public static int pedirNumInt( String s) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

        return n1;
    }

    public static int random(int x)  {

        x = 1 + ( int) ( 100 * Math.random());


        return x;
    }

    public static int maior(int num[]) {

        int maiorValor = num[0]; // Inicializa com o primeiro elemento do array
        for ( int i = 1; i < num.length; i++) {
            if (num[i] > maiorValor) {
                maiorValor = num[i]; // Atualiza o maior valor se encontrar um valor maior
            }
        }
        return maiorValor;
    }

    public static int menor(int num[]) {

        int menorValor = num[0]; // Inicializa com o primeiro elemento do array
        for (int i = 1; i < num.length; i++) {
            if (num[i] < menorValor) {
                menorValor = num[i]; // Atualiza o menor valor se encontrar um valor menor
            }
        }
        return menorValor;
    }
    public static double media(int num[], int s, double r) {
        for (int i = 0; i < num.length; i++) {
            s += num[i];
        }

        r = s / num.length;
        return r;
    }




    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        int op;
        int[] num = new int[10];


        for( int l = 0; l < num.length; l++){
            num[l] = random(x);
        }


        do {

            op = pedirNumInt("1 para Mostrar maior valor / 2 para mostrar o menor valor / 3 calcular a média / 0 sair");


            switch(op) {
                case 1 : {
                    int  s =  maior( num);
                        System.out.println("O maior valor é : " + s);

                    for ( i = 0 ; i < num.length ; i++){
                        System.out.print(num[i] + "  ");
                    }

                    break;
                } case 2 : {
                    int  s =  menor( num);
                        System.out.println( " \n");
                        System.out.println("O menor valor é : " + s);
                    for ( i = 0 ; i < num.length ; i++){
                        System.out.print(num[i] + " ");
                    }

                    break;
                } case 3 : {
                    double s = media(num, x, i);

                    System.out.println( " \n");

                    System.out.println("A média dos valores é : " + s);

                    for ( i = 0 ; i < num.length ; i++){
                        System.out.print(num[i] + " ");
                    }
                    break;
                } case 0 : {
                    System.out.println( " \n");
                    System.out.println("========================");
                    System.out.println("========================");
                    System.out.println("===Programa terminado===");
                    System.out.println("========================");
                    System.out.println("========================");


                    break;
                }default : {

                    System.out.println( " \n");
                    System.out.println("===========");
                    System.out.println("===ERROR===");
                    System.out.println("===========");
                    break;
                }
            }

        } while ( op != 0);


    }




}
