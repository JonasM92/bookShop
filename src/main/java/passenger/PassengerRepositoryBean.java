package passenger;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by jeansmits on 27/05/15.
 */
public class PassengerRepositoryBean implements PassengerRepository {
    private EntityManager em;
    public PassengerRepositoryBean(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Passenger> findAllPassengers() {
        return em.createQuery("select p from Passenger p", Passenger.class).getResultList();
    }
}
