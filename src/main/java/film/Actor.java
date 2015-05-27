package film;

import javax.persistence.*;

/**
 * Created by jeansmits on 27/05/15.
 */
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    @Enumerated(EnumType.STRING)
    public Gender g;

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }


}
