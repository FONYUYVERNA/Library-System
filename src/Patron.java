import java.util.ArrayList;


/*This class represents someone who can borrow books*/
public class Patron  {
    private String name;
    private int id;
    private ArrayList<Book> books = new ArrayList<>();


    //constructor
     Patron(int id, String name){
        this.id = id;
        this.name = name;
    }



    /*Methods*/
/*setters*/
    public void setName(String name){
        this.name=name;
    }


    /*getters*/
   public String getName(){
       return this.name;
    }
    public int getId(){
        return this.id;
    }

    // allows book to be borrowed
    public void borrowBook(Book book){
       if(book.isAvailable){
           books.add(book);
       }

    }
    //returns list of books currently borrowed by the patron
    public String getBorrowedBooks(){
    return this.books.toString();
    }
    //allows for return of book
    void returnBook(Book book) {
        if(books.contains(book)){
            books.remove(book);
            book.isAvailable=true;
        }
          else{
              book.isAvailable=false;
        }
    }



    @Override
    public String toString() {
        return String.format("%d. %s ",this.id, this.name);
    }
}
