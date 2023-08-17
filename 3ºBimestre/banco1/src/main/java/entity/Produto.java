package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int IdProd;
    @Column
    private String NomeProd;
    @Column
    private float Preco;
    private List<Produto> produtos = new ArrayList<>();

    public Produto(String nomeProd, float preco) {
        NomeProd = nomeProd;
        Preco = preco;
    }

    public int getIdProd() {
        return IdProd;
    }

    public void setIdProd(int idProd) {
        IdProd = idProd;
    }

    public String getNomeProd() {
        return NomeProd;
    }

    public void setNomeProd(String nomeProd) {
        NomeProd = nomeProd;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        Preco = preco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Id=" + IdProd +
                ", Nome='" + NomeProd + '\'' +
                ", Sobrenome='" + Preco + '\'' +
                '}';
    }


}
