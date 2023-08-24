package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int IdProd;
    @Column
    private String NomeProd;
    @Column
    private Double Preco;

    public Produto(String nomeProd, Double preco) {
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

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "IdProd=" + IdProd +
                ", NomeProd='" + NomeProd + '\'' +
                ", Preco=" + Preco +
                '}';
    }
}
