package com.pacote.model;

public class Funcionarios {
    private String Nomee;
    private long CPF;

    public Funcionarios(String Nomee, long CPF) {
        this.Nomee = Nomee;
        this.CPF = CPF;
    }
    public String getNomee() {
        return Nomee;
    }

    public void setNomee(String Nomee) {
        this.Nomee = Nomee;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
}
