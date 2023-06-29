package model;

import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Orcamento implements ExibirInterface {
    private String dataEntrega;
    private Boolean entregue;

    public Pedido(String dataEntrega, Boolean entregue) {
        this.dataEntrega = dataEntrega;
        this.entregue = false;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

}
