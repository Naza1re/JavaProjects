package LibraryUnits;

import java.io.Serializable;

public abstract class LibraryUnit implements Serializable {

    String title;
    String author;

    public LibraryUnit(String title,String author){
        this.author = author;
        this.title = title;
    }
    public LibraryUnit(){

    }





}
