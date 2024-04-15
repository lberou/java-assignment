public class PrintedBook extends Book{
    String isbn;

    public PrintedBook(String title,int id, String isbn){
        this.title = title;
        this.id = id;
        this.isbn=isbn;
    }

    @Override
    public void setAsBorrowed() {
        if (isAvailable) {
            isAvailable = false;
            printBookState(IS_BORROWED);
        } else printBookState(IS_NOT_AVAILABLE);
    }

    @Override
    public void setAsReturned() {
        if (!isAvailable) {
            isAvailable = true;
            printBookState(IS_RETURNED);
        } else printBookState(IS_AVAILABLE);
    }

    @Override
    void displayInfo() {
        System.out.println(title);
        System.out.println(id);
        System.out.println(isbn);
        System.out.println(isAvailable);

    }

    @Override
    public void read() {
        System.out.println("User is reading the book with id " + id + "title " + title + " and isbn: " + isbn);
    }
}
