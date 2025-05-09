package ficha11;

import javax.swing.*;

public class Ex6 {

    public static void main(String[] args) {

        int guess = 0;
        int count;
        int n1 = 1 + (int) (99 * Math.random());
        do {

            for ( count = 0; guess != n1; count++){
                guess = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));


            if ( guess == n1) {
                System.out.println("Certo");
            } else if ( guess > n1) {
                System.out.println("Errado o numero é mais baixo");
            } else if ( guess < n1) {
                System.out.println("Errado o numero é mais alto");
            }
            }




        } while ( guess != n1);
        System.out.println(count + "Tentativas");
        
    }
    
}
