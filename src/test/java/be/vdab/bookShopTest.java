package be.vdab;

import org.junit.*;
import static org.junit.Assert.assertEquals;

import java.util.List;


/**
 * Created by jeansmits on 26/05/15.
 */
public class BookShopTest extends AbstractBookShopTest {

    @Test
    public void testOurLogic() {

        logger.debug("Hello World, this is the debug log");
//
//        // Set up
//        EntityManager em;
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("books");
//        em = entityManagerFactory.createEntityManager();
//        em.getTransaction().begin();

        // Ready to do stuff!
        BookRepository bookRepository = new BookRepositoryBean(em);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(3, books.size());

//        // Tear down
//        em.getTransaction().commit();
//        em.close();
//        entityManagerFactory.close();// Set up
    }

    @Test
    public void findAllBooksReturnsExactlyXBooks() {
        List<Book> books = em.createQuery("select b from Book b", Book.class).getResultList();
        assertEquals(3,books.size());
    }


}
