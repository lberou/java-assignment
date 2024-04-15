public class Main {

    public static void main(String[] args) {

        Library myLibrary=new Library();

        Library.displayAllBooksInfo(); // all books info
        myLibrary.borrowBook(327); // try to borrow an e-book that is borrowable
        myLibrary.borrowBook(134); // try to borrow an e-book that is not borrowable
        myLibrary.borrowBook(327); // try to borrow an e-book that is already borrowed
        myLibrary.borrowBook(33);  // try to borrow a printed book
        myLibrary.borrowBook(33);  // try to borrow a printed book that is already borrowed
        myLibrary.returnBook(327); // try to return an ebook that is borrowed
        myLibrary.returnBook(33);  // try to return a printed book that is borrowed
        myLibrary.returnBook(25);  // try to return a printed book that is not borrowed

    }
}
