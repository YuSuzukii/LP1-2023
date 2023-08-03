import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Agendamentos {
    private char data;
    private char hora0;
    private char horaf;

    public Agendamentos(char data, char hora0, char horaf, List<Agenda> itensAgenda) {
        this.data = data;
        this.hora0 = hora0;
        this.horaf = horaf;
    }


    public Agendamentos() {

    }
}

