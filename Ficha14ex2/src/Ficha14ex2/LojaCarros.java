package Ficha14ex2;

import javax.swing.*;

public class LojaCarros {
    // funcao para menu switch case
    public static int pedirNumInt( String s) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(s));

        return n1;
    }

    public static String pedirMarca( String s) {

        String n2 = JOptionPane.showInputDialog("Inserir Marca de carros que pretende ver mais");

        return n2;
    }

    public static int inserirCarro(Carros[] ac,  int count){

        String marca = JOptionPane.showInputDialog("Inserir Marca do carro");
        String modelo = JOptionPane.showInputDialog("Inserir Modelo do carro");
        String tipo = JOptionPane.showInputDialog("Inserir tipo de carro");
        String combustivel = JOptionPane.showInputDialog("Inserir tipo de combustivel");
        int anoConstrucao = Integer.parseInt(JOptionPane.showInputDialog("Inserir ano de fabrico do carro"));
        String cor = JOptionPane.showInputDialog("Inserir cor do carro");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Inserir preço do carro"));

        ac[count] = new Carros(marca, modelo, tipo, combustivel, anoConstrucao, cor, preco);
        count++;

        System.out.println("O Carro foi inserido no sistema");

        return count;
    }

    public static int showAll(Carros[] ac, int count) {
        for(int i = 0; i < count; i++){
            System.out.println(ac[i].toString());
        }

        return count;
    }

    public static int specificBrand(Carros[] ac, int count) {
        String a = pedirMarca("Inserir Marca de carros que pretende ver");

        for (int k = 0; k < count; k++) {
            if (ac[k].getMarca().equals(a)) {
                System.out.println(ac[k]);
            }
        }

        return count;
    }


    public static void main(String[] args) {

        int op ;
        int count = 0;

        Carros[] ac = new Carros[200];

        do {

            op = pedirNumInt("1 para inserir carros \n" +
                    "2 para mostrar todos os carros no sistema \n" +
                    "3 para mostrar carros de uma marca especifica \n" +
                    "4 para mostrar carros com um tipo de combustivel especifico \n" +
                    "0 sair");

            switch (op){
                case 1 :{
                  count = inserirCarro(ac, count);
                    break;
                } case 2 :{
                    showAll(ac, count);
                    break;
                } case 3 :{
                    specificBrand(ac, count);
                    break;
                } case 4 :{

                } case 0 :{
                    System.out.println( " \n");
                    System.out.println("========================");
                    System.out.println("========================");
                    System.out.println("===Programa terminado===");
                    System.out.println("========================");
                    System.out.println("========================");
                    break;

                } default:{
                    System.out.println("===ERROR===");
                    break;

                }
            }

        } while (op != 0);

    }
}
