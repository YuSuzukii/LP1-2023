package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int IdPed;
    @Column
    private Double total;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id")
    private Pessoa pessoa;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido-produto", joinColumns = @JoinColumn(name ="IdPed"), inverseJoinColumns = @JoinColumn(name = "IdProd"))
    private List<Produto> produtos;
// inverse serve para trazer a fk poara atabela, deve ser dps d joinColumns


    public Pedido(Pessoa pessoa, List<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public Pedido(Double total) {
        this.total = total;
    }

    public int getIdPed() {
        return IdPed;
    }

    public void setIdPed(int idPed) {
        IdPed = idPed;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public static void adicionarProd(){
        
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "IdPed=" + IdPed +
                ", total=" + total +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }
}
