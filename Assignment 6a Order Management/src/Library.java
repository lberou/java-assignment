public class Library {
    static Ebook[] ebooks = new Ebook[2];
    static PrintedBook[] printedBooks = new PrintedBook[2];

    static {

        ebooks[0] = new Ebook("War and Peace", 327, 50.75, true);
        ebooks[1] = new Ebook("The Call of the Wild", 134, 20.15, false);

        printedBooks[0] = new PrintedBook("Life a User's Manual", 25, "0-345-24223-8");
        printedBooks[1] = new PrintedBook("The Papess Joanne", 33, "0-245-22743-9");

    }

    void borrowBook(int id) {

        for (int i = 0; i < ebooks.length; i++) {
            if (ebooks[i].id == id) ebooks[i].setAsBorrowed();
        }

        for (int j = 0; j < printedBooks.length; j++) {
            if (printedBooks[j].id == id) printedBooks[j].setAsBorrowed();
        }

    }

    void returnBook(int id) {
        for (int i = 0; i < ebooks.length; i++) {
            if (ebooks[i].id == id) ebooks[i].setAsReturned();
        }

        for (int j = 0; j < printedBooks.length; j++) {
            if (printedBooks[j].id == id) printedBooks[j].setAsReturned();
        }

    }

    public static void displayAllBooksInfo() {

        for (int i = 0; i < ebooks.length; i++) {
            ebooks[i].displayInfo();
        }

        for (int j = 0; j < printedBooks.length; j++) {
            printedBooks[j].displayInfo();
        }

    }

}
