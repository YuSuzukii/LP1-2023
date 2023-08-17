package entity;

import jakarta.persistence.*;

@Entity(name="endereco")
@Table(name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int IdEnd;
    @Column
    private String Rua;
    @Column
    private String Cidade;

    public Endereco(String rua, String cidade) {
        Rua = rua;
        Cidade = cidade;
    }

    public int getIdEnd() {
        return IdEnd;
    }

    public void setIdEnd(int idEnd) {
        IdEnd = idEnd;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "Id=" + IdEnd +
                ", Rua='" + Rua + '\'' +
                ", Cidade='" + Cidade + '\'' + '}';
    }
    //Lembrar de criar a entity na pasta resources <mapping class="entity.nomeDaEntidade"/>//
}

