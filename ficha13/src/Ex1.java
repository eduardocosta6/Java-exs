import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {

        int [] idade = new int[3];

        String [] nome = new String[3];


        for(int i= 0; i<nome.length;i++){
            nome[i]= JOptionPane.showInputDialog("Qual os nomes ?" );
            System.out.println( "nome : " +  nome[i]);
        }

        for(int f= 0; f<idade.length;f++){
            idade[f]= Integer.parseInt(JOptionPane.showInputDialog("Qual os  numeros ?" ));
            System.out.println( "idade : " +  idade[f]);
        }


    }
}
