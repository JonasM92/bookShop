package passenger;

import java.util.List;

/**
 * Created by jeansmits on 27/05/15.
 */
public interface PassengerRepository {
    List<Passenger> findAllPassengers();
}
