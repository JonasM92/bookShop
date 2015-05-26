package be.vdab;

import javax.persistence.*;
import java.util.List;

public class BookRepositoryBean implements BookRepository {
    private EntityManager em;
    public BookRepositoryBean(EntityManager em) {
        this.em = em;
        // Set up
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("RealDolmenPersistenceUnit");
        EntityManager entityManager =
                entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        // Ready to do stuff!
        // Tear down
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
    @Override
    public List<Book> findAllBooks() {
        return em.createQuery("select b from Book b", Book.class).getResultList();
    }




}