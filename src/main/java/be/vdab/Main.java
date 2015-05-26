package be.vdab;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jeansmits on 26/05/15.
 */
public class Main {
    public static void main(String[] args) {

        // Set up
        EntityManager em;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("RealDolmenPersistenceUnit");
        em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        // Ready to do stuff!
        BookRepositoryBean brb = new BookRepositoryBean(em);

        List<Book> books = brb.findAllBooks();
        for(Book b:books) {
            System.out.println(b.toString());
        }

        // Tear down
        em.getTransaction().commit();
        em.close();
        entityManagerFactory.close();// Set up
    }
}
