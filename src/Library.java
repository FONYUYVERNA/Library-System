import java.util.ArrayList;


/*This class represents the library itself, which manages
the collection of books and patrons as well as borrowing transactions
 */
public class Library{
   private ArrayList<Book> books = new ArrayList<>();//List of books available in library
    private ArrayList<Patron> patrons = new ArrayList<>();//list of registered patrons


    public ArrayList<Book> getBooks(){
        return new ArrayList<Book>(books);
    }
    public ArrayList<Patron> getPatrons(){
        return new ArrayList<Patron>(patrons);
    }
    /*Methods*/
   //new book is added to library
   void addBook(Book book){
        books.add(book);
        book.isAvailable=true;

    }
   //book is removed from library
    void removeBook(Book book){
      books.remove(book);
      book.isAvailable=false;
    }
   //registers new patron with library
     void addPatron(Patron patron){
       patrons.add(patron);
    }
    //removes patron from library
    void removePatron(Patron patron){
       patrons.remove(patron);
    }

    //handles the borrowing process
    //updating book availability and patron's borrowed book list

    void borrowBook(Patron patron, Book book)
    {
        if(patrons.contains(patron) && book.isAvailable){
            patron.borrowBook(book);
            System.out.println("\nBorrow successful:"+ patron.toString() + "' borrowed '" + book.toString() + "'\n");
            book.borrowBook();
        }
        else
        {
            System.out.println("\nBorrow unsuccessful: either'"+ patron.toString() + "' is no longer a member or book is unavailable\n");
        }

    }
    //handles the return process, updating book availability and patron's borrowed books list
    void returnBook(Patron patron, Book book){
        patron.returnBook(book);

        if(patrons.contains(patron) && book.isAvailable) {
            System.out.println("\nReturn successful: '"+ patron.toString() + "' has returned '" +book.toString()+ "'");
        }
        else
        {
            System.out.println("\nReturn unsuccessful: either '"+ patron.toString() + "' is no longer a member or book is not in library");
        }

    }



}
