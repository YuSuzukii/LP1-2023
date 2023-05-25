package com.heranca;

public abstract class usuario {
    private String userName;
    private String senha;
    private int idade;

    public usuario(String userName, String senha, int idade) {
        this.userName = userName;
        this.senha = senha;
        this.idade = idade;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
