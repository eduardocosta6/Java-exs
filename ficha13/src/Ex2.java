import javax.swing.*;

public class Ex2 {


    // funcao para menu switch case
    public static int pedirNumInt( String s) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

        return n1;
    }

    // funcao de inserir users
    public static int input(String[] nome, int[] idade , String[] local, int count) {

            nome[count] = JOptionPane.showInputDialog("Name:");
            idade[count] = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            local[count] = JOptionPane.showInputDialog("Localidade:");

            System.out.println("Novo user adicionado na lista");
            return count + 1 ;
    }

    // funcao para case 2 para chamar especifico user
    public static void cliente(String[] nome, int[] idade, String[] local, int count ) {

        int i = pedirNumInt("insira um numero de 1 a 10") - 1;

        if( i >= 0 && i < count) {
            System.out.println(nome[i]);
            System.out.println(local[i]);
            System.out.println(idade[i]);
        } else {
            System.out.println(" O user no existe");
        }



    }

    public static void total(String[] nome, int[] idade, String[] local, int count) {

            for( int i = 0; i < count; i++){
                System.out.println(nome[i] + " " + idade[i] + " " + local[i]);
            }


    }

    public static void main(String[] args) {

        //arrays com informaçao
         String[] nome = new String[10];
         int[] idade =  new int[10];
         String[] local = new String[10];

         int count = 0;


        int op;


            do {

            op = pedirNumInt("1 para inserir novo cliente / 2 para mostrar cliente x / 3 mostrar todos os clientes / 0 sair");


            switch(op) {
                case 1 : {

                    if ( count >= 10){
                        System.out.println("A lista está cheia");
                    }
                    count = input(nome, idade, local, count);

                    break;
                } case 2 : {
                    cliente(nome, idade, local, count);

                    break;
                } case 3 : {
                    total(nome, idade, local, count);
                    break;
                } case 0 : {
                    System.out.println("===Programa terminado===");
                    break;
                }default : {
                    System.out.println("===ERROR===");
                    break;
                }
            }

        } while ( op != 0);


    }
}
