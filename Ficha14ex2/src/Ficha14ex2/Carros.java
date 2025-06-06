package Ficha14ex2;

import java.security.SecureRandom;

public class Carros {


    //var class
    private static int qts = 0;



    // var instancia
    private String marca;
    private String modelo;
    private String tipo;
    private String combustivel;
    private int anoConstrucao;
    private String cor;
    private double preco;


    // constrotores

    public Carros(String marca, String modelo, String tipo, String combustivel, int anoConstrucao, String cor, double preco) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setCombustivel(combustivel);
        setAnoConstrucao(anoConstrucao);
        setCor(cor);
        setPreco(preco);
        qts++;
    }


    //metodos class
    public static int getQts(){
        return qts;
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca() {

        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    public String getCombustivel(){
        return this.combustivel;
    }

    public void setAnoConstrucao(int anoConstrucao){
        this.anoConstrucao = anoConstrucao;
    }
    public int getAnoConstrucao(){
        return this.anoConstrucao;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString(){
        return "Marca:" + this.marca + "  Modelo:" + this.modelo + "  Tipo:" + this.tipo + "  Combustivel:" + this.combustivel + "  Ano de Construção:" + this.anoConstrucao + "  Cor" + this.cor + "  Preço" + this.preco;
    }
}
