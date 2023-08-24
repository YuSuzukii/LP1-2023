package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int Id;
    @Column
    private String Nome;
    @Column
    private String Sobrenome;
    @Column
    private String Email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdEnd")
    private Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    @JoinColumn(name = "IdProd")
    private List<Pedido> pedidos = new ArrayList<>();
    //@OnetoOne serve para ligar as tabelas 1 para 1
    //CascadeType.ALL serve para cadastrar em um e levar p outro


    public Pessoa(String nome, String sobrenome, String email, Endereco endereco) {
        Nome = nome;
        Sobrenome = sobrenome;
        Email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Sobrenome='" + Sobrenome + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
    //criar classe produto, deve ter id, nome, preco, e criar pedido cm pessoa, id e lista de produtos
}
