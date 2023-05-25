public class Funcionarios {
    private String Nome;
    private String CPF;

    public Funcionarios(String nome, String CPF) {
        Nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}