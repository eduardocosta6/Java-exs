package poo;

public class Cliente {

    //var class

    private static int qts=0;

    // ver instancia
    private String nome;
    private  int idade;

    // construtores
    public Cliente(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
        qts++;
    }

    public Cliente(String nome) {
        setNome(nome);
        qts++;
    }

    public Cliente() {
        qts++;
    }

    //metodos class
    public static int getQts(){
        return qts;
    }


    //metodos instancia
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString(){
        return "nome:" + this.nome + "  idade:" + this.idade;
    }

}
