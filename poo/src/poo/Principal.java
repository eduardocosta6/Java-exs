package poo;

public class Principal {

    public static void main(String[] args) {
        Cliente c1 = new Cliente ("Maria", 25);

        Cliente c2 = new Cliente("Manue");

        Cliente c3 = new Cliente();


        Cliente[] ac = new Cliente[3];

        ac[0] = c1;
        ac[1] = c2;
        ac[2] = c3;


        System.out.println(c1.getNome());
        System.out.println(c1.getIdade());
        System.out.println(c1.toString());
        System.out.println(c1);

        c2.setIdade(30);
        System.out.println(c2.toString());


        c3.setNome("Quim");
        c3.setIdade(20);
        System.out.println(c3.toString());


        for(int i = 0; i < ac.length; i++){
            ac[i].toString();
        }
    }
}
