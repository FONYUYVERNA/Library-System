

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Book book1 = new Book("Abbot", "Walter Scott", 2024);
        Book book2 = new Book("A Simple Path", "Lucinda Varday", 2017);
        Book book3 = new Book("A Peep into the Past", "Vasant Navrekar", 2010);
        Book book4 = new Book("A tale of Two Gardens", "Octavio Paz", 2022);
        Book book5 = new Book("Romeo And Juliet", "Shakespeare", 2005);
        Book book6 = new Book("Punished by His Love", "Lara Scott", 2020);
        Book book7 = new Book("Dominating CEO","Lana Sarvatore" , 2009);
        Library library = new Library();

        /*Add books to library*/
       library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
     System.out.print("\nList of books found in library:\n");
     System.out.println(library.getBooks());

/*remove book 1,2 and 3*/
        library.removeBook(book1);
        library.removeBook(book2);
        library.removeBook(book3);
        library.removeBook(new Book("Dominating CEO","Lana Sarvatore" , 2009));
     System.out.print("\nNew list of books found in Library after removing some books:\n");
        System.out.println(library.getBooks());

        Patron patron1 = new Patron(1,"Fonyuy Verena");
        Patron patron2 = new Patron(2,"Lami Boris");
        Patron patron3 = new Patron(3,"Burinyuy Cedric");
        Patron patron4 = new Patron(4,"Berinyuy Casilda");
        Patron patron5 = new Patron(5,"Kewir Bertin");

        /*register library members*/
        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
        library.addPatron(patron5);
        System.out.print("\nList of Library members/patrons:\n");
        System.out.println(library.getPatrons());

/*remove library members 1,5 and 3*/
        library.removePatron(patron1);
        library.removePatron(patron5);
        library.removePatron(patron3);
     System.out.print("\nNew list of members/patrons of library after removing some members:\n");
        System.out.println(library.getPatrons());
     System.out.print("\n");

/*Library member wishes to borrow the following books*/

        library.borrowBook(patron2,book4);
        library.borrowBook(patron1,book1);
        library.borrowBook(patron2,book7);
        library.borrowBook(patron4,book4);
        library.borrowBook(patron1,book1);
        library.borrowBook(patron4,book7);
        library.borrowBook(patron4,book6);
        System.out.print("\nPatron1's borrow list:\n");
        System.out.println(patron1.getBorrowedBooks());
        System.out.print("\nPatron2's borrow list:\n");
        System.out.println(patron2.getBorrowedBooks());
        System.out.print("\nPatron4's borrow list:\n");
        System.out.println(patron4.getBorrowedBooks());

     /*returning borrowed books*/
        library.returnBook(patron2,book4);
        library.borrowBook(patron4,book4);
        System.out.print("\nPatron4's borrow list:\n");
        System.out.println(patron4.getBorrowedBooks());
        System.out.print("\nPatron2's borrow list:\n");
        System.out.println(patron2.getBorrowedBooks());

        library.returnBook(patron1,book3);
        library.returnBook(patron4,book5);
        System.out.print("\nPatron1's borrow list:\n");
        System.out.println(patron1.getBorrowedBooks());
        System.out.print("\nPatron4's borrow list:\n");
        System.out.println(patron4.getBorrowedBooks());

    }
}