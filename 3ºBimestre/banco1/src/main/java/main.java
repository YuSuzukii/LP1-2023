import entity.Pessoa;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class main {
    public static void main (String[]args){
        Pessoa p1 = new Pessoa("Jackson", "Wang", "teamwang@gmail.com");
        Pessoa p2 = new Pessoa("Chaelin", "Lee", "iamthebest@gmail.com");
        Pessoa p3 = new Pessoa("Maria", "Hwasa", "mariah@gmail.com");
        Pessoa p4 = new Pessoa("Ian", "Dpr", "Dparian@gmail.com");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        //ambos forEach quanto o for exibem as informacoes das pessoas, apenas metodologias diferentes//
        pessoas.forEach(p -> System.out.println(p.toString()));
        for (Pessoa p: pessoas){
            System.out.println(p.toString());
        }
    }
}
