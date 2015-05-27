package passenger;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeansmits on 27/05/15.
 */
public class PassengerTest extends AbstractPassengerTest{
    @Test
    public void generalTest() {
        PassengerRepository pr = new PassengerRepositoryBean(em);
        List<Passenger> passengers = pr.findAllPassengers();
        assertEquals(3, passengers.size());
    }


    @Test
    public void findAllBooksReturnsExactlyXPassengers() {
        List<Passenger> p= em.createQuery("select p from Passenger p", Passenger.class).getResultList();
        assertEquals(3,p.size());
    }


}
