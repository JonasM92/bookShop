package film;

import javax.persistence.*;

/**
 * Created by jeansmits on 27/05/15.
 */

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String title;
    int duration;
    @Enumerated(EnumType.STRING)
    public Genre g;

    public Film(String title,int duration,Genre g) {
        this.title=title;
        this.duration=duration;
        this.g = g;
    }

}
