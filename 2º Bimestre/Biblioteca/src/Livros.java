public class Livros {
    private String Nome;
    private String Autor;
    private String Ano;

    public Livros(String nome, String autor, String ano) {
        Nome = nome;
        Autor = autor;
        Ano = ano;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }
}