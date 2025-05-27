import javax.swing.*;

public class Ex8 {

    public static int pedirNumInt(String s) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

        return n1;
    }


    // funcao de inserir users
    public static int input(String[] nome, int[] idade, int count) {

        nome[count] = JOptionPane.showInputDialog("Name:");
        idade[count] = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        System.out.println("Novo user adicionado na lista");
        return count + 1 ;
    }

    //mostrar todos os users
    public static void total(String[] nome, int[] idade, int count) {

        for( int i = 0; i < count; i++){
            System.out.println(nome[i] + " " + idade[i] );
        }

    }

    // funcao de inserir ofertas viagens
    public static int inputViagem(String[] destino, double[] preco, int[] quantDias,  int[] quantPessoas, int count1) {

        destino[count1] = JOptionPane.showInputDialog("Destino:");
        preco[count1] = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
        quantDias[count1] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias:"));
        quantPessoas[count1] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pessoas:"));
        System.out.println("Nova oferta adicionada na lista");
        return count1 + 1 ;
    }

    //mostrar todos as viagens
    public static void totalViagens(String[] destino, double[] preco, int[] quantDias,  int[] quantPessoas, int count1) {

        for( int i = 0; i < count1; i++){
            System.out.println(destino[i] + " " + preco[i] + " " + quantDias[i] + " " + quantPessoas[i] );
        }

    }

    // funcao de marcar viagens
    public static int marcarViagem(int[] codCliente, int[] codViagem, int[] numDias, int[] numPessoas,  String[] data, int count2) {

        codCliente[count2] = Integer.parseInt(JOptionPane.showInputDialog("Código do cliente:"));
        codViagem[count2] = Integer.parseInt(JOptionPane.showInputDialog("Código da Viagem:"));
        numDias[count2] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias:"));
        numPessoas[count2] = Integer.parseInt(JOptionPane.showInputDialog("Numero de pessoas:"));
        data[count2] = JOptionPane.showInputDialog("Data:");
        System.out.println("Nova oferta adicionada na lista");
        return count2 + 1 ;
    }



    public static void main(String[] args) {


        // campos dos clientes
        String[] nome = new String[10];
        int[] idade =  new int[10];

        // campos ofertas de viagens
        String[] destino = new String[10];
        double[] preco = new double[10];
        int[] quantDias = new int[10];
        int[] quantPessoas = new int[10];

        // campos de marcaçoes de viagens cliente
        int[] codCliente = new int[10];
        int[] codViagem = new int[10];
        int[] numDias = new int[10];
        int[] numPessoas = new int[10];
        String[] data = new String[10];

        int op = 0;
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        do {

            op = pedirNumInt("1- Inserir Cliente \n" +
                    "2- Inserir Oferta Viagem  \n" +
                    "3- Marcar Viagem Cliente \n" +
                    "4- Mostrar Clientes \n" +
                    "5- Mostrar Ofertas de Viagem \n" +
                    "6- Mostrar Viagens Marcadas \n " +
                    "0- Sair");



            switch (op) {
                case 1: {
                    if ( count >= 10){
                        System.out.println("A lista está cheia");
                    }


                    count = input(nome, idade, count);

                    break;
                } case 2: {
                    if ( count >= 10){
                        System.out.println("A lista está cheia");
                    }
                    count1 =  inputViagem(destino, preco, quantDias, quantPessoas, count1);
                    System.out.println();
                    break;
                } case 3: {
                   /* totalViagens(destino, preco, quantDias, quantPessoas, count1);
                    total(nome, idade, count);*/

                    for ( int f = 0; f < count.length; f++){
                        System.out.println(nome[f]);
                    }

                   count2 =  marcarViagem(codCliente, codViagem,  numDias, numPessoas, data,  count2);
                    break;

                } case 4: {

                    total(nome, idade, count);
                    break;

                } case 5: {
                    totalViagens(destino, preco, quantDias, quantPessoas, count1);
                    break;
                } case 6: {

                    break;
                } case 0: {

                    break;
                } default: {
                    break;

                }

            }

        }while (op != 0) ;

    }
}

