package film;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jeansmits on 27/05/15.
 */

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="film_id")
    private Integer id;
    String title;
    int duration;
    @Enumerated(EnumType.STRING)
    public Genre g;

    @ManyToMany
    @JoinTable(name = "join_film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Actor> filmActors;



    public Film(String title,int duration,Genre g) {
        this.title=title;
        this.duration=duration;
        this.g = g;
    }

}
