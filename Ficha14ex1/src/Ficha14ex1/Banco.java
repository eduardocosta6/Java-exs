package Ficha14ex1;

import javax.swing.*;

public class Banco {

    // funcao para menu switch case
    public static int pedirNumInt( String s) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

        return n1;
    }
    public static int insertClient(Clientes[] ac,  int count){

        String nome = JOptionPane.showInputDialog("Inserir Nome");
        String morada = JOptionPane.showInputDialog("Inserir Morada");
        int bi = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero bi"));
        int nif = Integer.parseInt(JOptionPane.showInputDialog("Inserir nif "));
        int nrCliente = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero de Cliente"));

        ac[count] = new Clientes(nome, morada, bi, nif, nrCliente);
        count++;

        System.out.println("O User foi inserido no sistema");

        return count;
    }

    public static int showAll(Clientes[] ac, int count) {
        for(int i = 0; i < count; i++){
            System.out.println(ac[i].toString());
        }

        return count;
    }

    public static void specificUser(Clientes[] ac, int count)  {

        int i = pedirNumInt("insira um numero de 1 a 100") - 1;

        if( i >= 0 && i < count) {
            System.out.println(ac[i]);
        } else {
            System.out.println(" O user no existe");
        }

    }




    public static void main(String[] args) {

        int op = 0;
        int count = 0;

        Clientes[] ac = new Clientes[100];

        do {

            op = pedirNumInt("1 para inserir users \n" +
                    "2 para mostrar todos os users \n" +
                    "3 para mostrar um user especifico \n" +
                    "0 sair");

            switch (op){
                  case 1: {
                      if(count >= 100) {
                          System.out.println("A lista está cheia");
                      }
                     count = insertClient( ac, count);

                      break;
                } case 2: {
                    showAll(ac, count);
                    break;
                } case 3: {
                    specificUser(ac, count);
                    break;
                } case 0: {
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



        } while( op != 0);
    }
}
