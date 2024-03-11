

/*This class represents the books in the library*/
public class Book {
    //Fields
    private String title;//title of book
    private String author;//author of book
    private int publicationYear;//Year book was publish

    boolean isAvailable;//indicates availability of book for borrowing

    //constructor
    Book(String title, String author, int publicationYear)
    {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    //Methods
    /*setters*/
public void setTitle(String title){
        this.title=title;
}
public void setAuthor (String author){
        this.author=author;
}
public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
}
/*getters*/
    //returns title of book
public String getTitle(){
return this.title;
}
//returns author of book
    public String getAuthor(){
return this.author;
    }
    //returns publication year
    public int getPublicationYear(){
return this.publicationYear;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    //marks book as borrowed
    void borrowBook(){
        isAvailable=false;
    }
    //marks book as returned
    void returnBook(){
        isAvailable=true;
    }

    @Override
    public String toString() {
        return String.format("%s by %s in %d",this.title, this.author, this.getPublicationYear());
    }
}
