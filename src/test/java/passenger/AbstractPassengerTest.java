package passenger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by jeansmits on 26/05/15.
 */
public abstract class AbstractPassengerTest {
    private static EntityManagerFactory emf;
    protected EntityManager em;

    @BeforeClass
    public static void initializeEntityManagerFactory() {
        emf = Persistence.createEntityManagerFactory("books");
    }

    @AfterClass
    public static void destroyEntityManagerFactory() {
        emf.close();
    }

    @Before
    public void initializeEntityManager() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @After
    public void destroyEntityManager() {
        em.getTransaction().commit();
        em.close();
    }
}