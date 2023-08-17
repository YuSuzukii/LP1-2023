import entity.Endereco;
import entity.Pessoa;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jackson", "Wang", "teamwang@gmail.com", new Endereco("Stardust", "Galaxy"));
        Pessoa p2 = new Pessoa("Chaelin", "Lee", "iamthebest@gmail.com",new Endereco("Sun", "MilkWay"));
        Pessoa p3 = new Pessoa("Maria", "Hwasa", "mariah@gmail.com", new Endereco("Star", "Constelation"));
        Pessoa p4 = new Pessoa("Ian", "Dpr", "Dparian@gmail.com", new Endereco("Moon", "Sky"));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);


        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        //ambos forEach quanto o for exibem as informacoes das pessoas da mesma forma, apenas metodologias diferentes//
        pessoas.forEach(p -> System.out.println(p.toString()));
        for (Pessoa p : pessoas) {
            System.out.println(p.toString());
        }

            Endereco e1 = new Endereco("Stardust", "Galaxy");
            Endereco e2 = new Endereco("Sun", "MilkWay");
            Endereco e3 = new Endereco("Star", "Constelation");
            Endereco e4 = new Endereco("Moon", "Sky");

            Session session2 = HibernateUtil.getSessionFactory().openSession();

            Transaction transaction2 = session2.beginTransaction();

            session2.persist(e1);
            session2.persist(e2);
            session2.persist(e3);
            session2.persist(e4);

            transaction2.commit();

            List<Endereco> enderecos = session2.createQuery("from endereco", Endereco.class).list();

            enderecos.forEach(e -> System.out.println(e.toString()));
    }
}




