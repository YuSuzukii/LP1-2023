package com.pacote.model;

public class Dono {
    private String nome;
    private long CPF;

    public Dono(String nome, long CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    public void mostrarnome(){
        System.out.println("Nome do dono: " + nome);
    }

}
