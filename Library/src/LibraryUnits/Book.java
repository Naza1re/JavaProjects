package LibraryUnits;

import java.io.Serializable;
import java.util.Comparator;

public class Book extends LibraryUnit implements Serializable,Comparable {
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUser() {
        return User;
    }
    public void setUser(String user) {
        User = user;
    }
    private String User;
    private String title;
    private String author;

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    String population;

    @Override
    public String toString() {
        return title;


    }
    public Book(String title, String author, String id, String user, String population){
        super(title,author);
        this.id = id;
        this.User = user;
        this.author =author;
        this.title = title;
        this.population=population;
    }
    public Book(){
        super();

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.valueOf(this.population)-Integer.valueOf(population);
    }
}
