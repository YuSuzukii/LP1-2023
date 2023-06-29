package model;
import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;
public class Orcamento implements ExibirInterface {
    private static Long idBase;
    private Long id;
    private List<ItemPedido> Itens = new ArrayList<>();
    private double ValorTotal;


    public Orcamento() {
        this.id = id;
    }

    public static void setIdBase(Long idBase) {
        Orcamento.idBase = idBase;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItens(List<ItemPedido> itens) {
        Itens = itens;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }

    public void addItem(ItemPedido Item){
        Itens.add(Item);
    }
    public void removerItem(Long id){
        Itens.remove(id);
    }

    void ExibirInterface() {

    }
}
