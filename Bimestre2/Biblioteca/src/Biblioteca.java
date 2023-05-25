import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String NomeBiblioteca;
    private Dono dono;
    private List<Livros> Livros = new ArrayList<>();
    private List<Funcionarios> Funcionarios = new ArrayList<>();

    public Biblioteca(String nomeBiblioteca, Dono dono) {
        NomeBiblioteca = nomeBiblioteca;
        this.dono = dono;
    }

    public String getNomeBiblioteca() {
        return NomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        NomeBiblioteca = nomeBiblioteca;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public List<Livros> getLivros() {
        return Livros;
    }

    public void setLivros(List<Livros> livros) {
        Livros = livros;
    }

    public List<Funcionarios> getFuncionarios() {
        return Funcionarios;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        Funcionarios = funcionarios;
    }

    public static void mostrarLivros(){

    }

    public static void addLivros(){

    }

    public static void addFuncionario(){

    }
}