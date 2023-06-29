package Model;

import Repository.ExibirInterface;

import java.util.List;

public class Orcamento implements ExibirInterface {
    private static Long IdBase;
    private Long Id;
    private List<ItemPedido> Itens;
    private Double ValorTotal;

    public Orcamento() {
        this.Id = IdBase++;
    }

    //IdBase é estatico, entao ele vai continuar somando, enquanto Id vai continuar1;

    public static Long getIdBase() {
        return IdBase;
    }

    public Long getId() {
        return Id;
    }

    public List<ItemPedido> getItens() {
        return Itens;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public static void setIdBase(Long idBase) {
        IdBase = idBase;
    }

    public void setItens(List<ItemPedido> itens) {
        Itens = itens;
    }

    public void setValorTotal(Double valorTotal) {
        ValorTotal = valorTotal;
    }

    @Override
    public void Exibir(Boolean completo) {

    }
}
