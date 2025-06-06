package Ficha14ex1;

public class Clientes {


    //var class
    private static int qts = 0;


    //var instancia
    private String nome;
    private String morada;
    private int bi;
    private int nif;
    private int nrCliente;

    //constrotores

    public Clientes(String nome, String morada, int bi, int nif, int nrCliente) {
        setNome(nome);
        setMorada(morada);
        setBi(bi);
        setNif(nif);
        setNrCliente(nrCliente);
        qts++;
    }

    public Clientes(String nome,  int bi, int nif, int nrCliente) {
        setNome(nome);
        setMorada(morada);
        setBi(bi);
        setNif(nif);
        setNrCliente(nrCliente);
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

    public void setMorada(String morada){
        this.morada = morada;
    }
    public  String getMorada(){
        return this.morada;
    }

    public void  setBi(int bi){
        this.bi = bi;
    }
    public int getBi(){
        return this.bi;
    }

    public void setNif( int nif){
        this.nif = nif;
    }

    public int getNif(){
        return this.nif;
    }

    public void setNrCliente(int nrCliente){
        this.nrCliente = nrCliente;
    }

    public int getNrCliente() {
        return this.nrCliente;
    }

    @Override
    public String toString(){
        return "nome:" + this.nome + "  morada:" + this.morada + "  bi:" + this.bi + "  nif:" + this.nif + "  Numero do cliente:" + this.nrCliente;
    }
}
