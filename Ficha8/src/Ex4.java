import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String[] args) {
        
        int op;
        int soma = 0;
        int n1;
        int maior = 0;
        int menor = 0;
        int count = 0;

        
        do {
          
        	// menu
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    " Menu: \n" + 
                    " 1 - Introduzir número \n" + 
                    " 2 - Mostrar Maior \n" +
                    " 3 - Mostrar Menor \n" +
                    " 4 - Mostrar Soma \n" +
                    " 5 - Mostrar Média \n" +
                    " 0 - Sair \n"));

           // loop
            switch (op) {
                case 1: {
                	n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero"));

                	// achar menor e maior
                    soma += n1;
                    count++;
                    
                    if (count == 1) {
                        maior = n1;
                        menor = n1;
                    } else {
                        if (n1 > maior) {
                            maior = n1;
                        } else if (n1 < menor) {
                            menor = n1;
                        }
                    }

                    break;
                }
                case 2: {
                	
                    if (count > 0) {
                        System.out.println("Maior número: " + maior);
                    } else {
                        System.out.println("Nenhum número  inserido");
                    }
                    break;
                }
                case 3: {

                    if (count > 0) {
                        System.out.println("Menor número: " + menor);
                    } else {
                        System.out.println("Nenhum número  inserido");
                    }
                    break;
                }
                case 4: {

                    if (count > 0) {
                        System.out.println("Soma dos números: " + soma);
                    } else {
                        System.out.println("Nenhum número  inserido");
                    }
                    break;
                }
                case 5: {
                	//media
                    if (count > 0) {
                        double media = soma / count;
                        System.out.println("Média dos números: " + media);
                    } else {
                        System.out.println("Nenhum número  inserido");
                    }
                    break;
                }
                case 0: {

                    System.out.println(" encerrado");
                    break;
                }
                default: {
                    System.out.println("===ERRO===");
                    break;
                }
            }
        } while (op != 0); 
    }
}
