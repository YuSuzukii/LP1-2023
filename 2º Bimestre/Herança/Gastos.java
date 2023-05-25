package Herancaa;

public class Gastos {
    private String nome;
    private double valor;

    public Gastos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void mudarValor(double valor){
        this.setValor(valor + (valor * 0.5));
    }
}


