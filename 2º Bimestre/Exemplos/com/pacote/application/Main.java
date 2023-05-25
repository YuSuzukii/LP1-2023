package com.pacote.application;
import com.pacote.model.*;
public class Main {
        public static void main(String[] args){
            Biblioteca b = new Biblioteca("Lonely");
            Dono dono = new Dono ("Jyp", 456789123l);
            Funcionarios f1 = new Funcionarios("Iu", 123456789l);
            Funcionarios f2 = new Funcionarios("Jackson Wang", 123789456l);
            Livros l1 = new Livros("Wakawaka", "Shakira", 2010);
            Livros l2 = new Livros("Love Scenario", "Ikon", 2020);
            Livros l3 = new Livros("Derniére Danse", "Ilada", 2004);
            b.mostrarnomeb();
            b.addLivros(l1);
            b.addLivros(l2);
            b.addLivros(l3);
            b.mostrarlivros();
            dono.mostrarnome();
            b.addFuncionarios(f1);
            b.addFuncionarios(f2);
            b.mostrarfunc();
        }

}
