package Model;

import Repository.ExibirInterface;

import java.util.PrimitiveIterator;

public class ItemPedido implements ExibirInterface {
    private static Long IdBase;
    private Long Id;
    private String Peca;
    private String Modelo;
    private String Tamanho;
    private Double Valor;

    public ItemPedido(String Peca, String Modelo, String Tamanho, Double Valor) {
        this.Peca = Peca;
        this.Modelo = Modelo;
        this.Tamanho = Tamanho;
        this.Valor = Valor;
    }

    @Override
    public void Exibir(Boolean completo) {

    }
}
