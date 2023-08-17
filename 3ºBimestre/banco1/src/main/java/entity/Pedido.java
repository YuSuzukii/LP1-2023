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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa")
    private Pessoa pessoa;



}
