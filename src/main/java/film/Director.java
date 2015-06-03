package film;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jeansmits on 03/06/15.
 */

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="director_id")
    int id;
    String firstName;
    String lastName;
    @Enumerated(EnumType.STRING)
    public Gender g;

    @OneToMany
    @JoinTable (name = "directed_films",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id") )
    List<Film> directedFilms;


    public Director(String firstName, String lastName,Gender g) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.g = g;
    }
}
