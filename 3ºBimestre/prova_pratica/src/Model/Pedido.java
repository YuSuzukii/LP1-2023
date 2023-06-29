package Model;

public class Pedido extends Orcamento{
    private String DataEntrega;
    private Boolean Entregue;

    public Pedido(String DataEntrega) {
        this.DataEntrega = DataEntrega;
        Entregue = false;
    }
}
