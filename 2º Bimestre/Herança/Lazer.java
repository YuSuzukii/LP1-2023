package Herancaa;

public class Lazer extends Gastos {
    private boolean importante;

    public Lazer(String nome, double valor, boolean importante) {
        super(nome, valor);
        this.importante = importante;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    public void mudarValor(double valor){
        this.setValor(valor + (valor * 0.5));
    }
}
