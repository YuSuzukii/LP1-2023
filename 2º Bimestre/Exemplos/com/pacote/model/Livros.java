package com.pacote.model;

public class Livros {
    private String Titulo;
    private String Autor;
    private int Ano;

    public Livros(String Titulo, String Autor, int ano) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ano = Ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setName(String name) {
        this.Titulo = name;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }
}
