package com.pacote.model;
import java.util.List;
        import java.util.ArrayList;
public class Biblioteca {
    private String nome;
    Dono dono;
    private List<Livros> livros = new ArrayList<>();
    private List<Funcionarios> funcionarios = new ArrayList<>();
    public Biblioteca(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarlivros(){
        for(Livros i: livros){
            System.out.println("Nome do livro: " + i.getTitulo());
            System.out.println("Autor: "+ i.getAutor());
            System.out.println("Ano de lançamento: "+ i.getAno());
        }
    }
    public void addLivros(Livros Livros){
        this.livros.add(Livros);
    }
    public void mostrarnomeb(){
        System.out.println("Nome da biblioteca: "+nome);
    }
    public void mostrarfunc(){
        for(Funcionarios i: funcionarios){
            System.out.println("Nome do funcionário: " + i.getNomee());
        }
    }
    public void addFuncionarios(Funcionarios funcionarios){
        this.funcionarios.add((Funcionarios) funcionarios);
    }
}
