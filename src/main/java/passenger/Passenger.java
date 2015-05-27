package passenger;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jeansmits on 26/05/15.
 */
@Entity
public class Passenger implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Basic(fetch = FetchType.LAZY)
    public byte[] picture;
    @Column(name="firstName")
    public String firstName;
    @Column(name="lastName")
    public String lastName;
    public Date birthDate;
    @Column(name="frqntflrmls")
    public int frequentFlyerMiles;
    @Transient
    public int age;
    @Enumerated(EnumType.STRING)
    public PType pType;



//    public Passenger(int id,byte[] pic,String fn, String ln,int age, int ffm, Enum pType) {
//        this.id = id;
//        this.picture=pic;
//        this.firstName=fn;
//        this.lastName=ln;
//        this.age=age;
//        this.frequentFlyerMiles=ffm;
//        this.pType=pType;
//    }
}
