package LibraryUnits;

public class Magazine extends LibraryUnit {
    int id;
    String user;
    String title;
    String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }



    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
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

    public Magazine(String title, String author) {
        super(title, author);
        this.title = title;
        this.author =author;
    }


}
