package com.heranca;

public class funcionario extends usuario {

    private double salario;

    public funcionario(String userName, String senha, int idade, double salario){
        super(userName, senha, idade);
    }
    public double getSalario(){
        return salario;
    }
    Override
    public String mostrar(){
        return "salario" + this.salario;
    }
    public void mostraNome(){

    }
}
