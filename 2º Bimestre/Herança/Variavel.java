package Herancaa;

public class Variavel extends Gastos{
    private int tempoEmMeses;

    public Variavel(String nome, double valor, int tempoEmMeses) {
        super(nome, valor);
        this.tempoEmMeses = tempoEmMeses;
    }

    public int getTempoEmMeses() {
        return tempoEmMeses;
    }

    public void setTempoEmMeses(int tempoEmMeses) {
        this.tempoEmMeses = tempoEmMeses;
    }
}

