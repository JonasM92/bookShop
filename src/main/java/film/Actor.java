package film;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jeansmits on 27/05/15.
 */

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="actor_id")
    int id;
    String firstName;
    String lastName;
    @Enumerated(EnumType.STRING)
    public Gender g;

    @ManyToMany(mappedBy = "filmActors") private List<Film> films;

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public Actor(String firstName, String lastName,Gender g) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.g = g;
    }


}
