package model;

import repository.ExibirInterface;

public class ItemPedido implements ExibirInterface {
    private static Long idBase;
    private Long id;
    private String peca;
    private String modelo;
    private String tamanho;
    private double valor;

    public ItemPedido(String peca, String modelo, String tamanho, double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public static Long getIdBase() {
        return idBase;
    }

    public static void setIdBase(Long idBase) {
        ItemPedido.idBase = idBase;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void entregar(){

    }
    void ExibirInterface(){

    }
}
