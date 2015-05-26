package be.vdab;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private String isbn;
    // Also add getters, setters and a default constructor

    public String toString() {
        String bookInfo = "Title: " + this.title + ", Author: " + this.author;
        return bookInfo;
    }
}