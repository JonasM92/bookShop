package film;

import org.junit.Test;

import javax.persistence.*;


/**
 * Created by jeansmits on 26/05/15.
 */
public class FilmTest {

    @Test
    public void testMain() {
        Film f = new Film("Jurassic World",134,Genre.SCIENCEFICTION);


        Director d = new Director("Colin" , "Trevorrow" , Gender.MALE);


        Actor a = new Actor("Chris" , "Pratt" , Gender.MALE);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("books");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(f);
        tx.commit();




//        f = em.find(Film.class, 1);
//        System.out.println(f);
        em.close();
        emf.close();


    }
}
