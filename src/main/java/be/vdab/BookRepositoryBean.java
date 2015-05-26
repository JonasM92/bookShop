package be.vdab;

import javax.persistence.*;
import java.util.List;

public class BookRepositoryBean implements BookRepository {
    private EntityManager em;
    public BookRepositoryBean(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Book> findAllBooks() {
        return em.createQuery("select b from Book b", Book.class).getResultList();
    }
}