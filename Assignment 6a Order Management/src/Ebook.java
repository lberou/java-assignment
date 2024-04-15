public class Ebook extends Book {
    double fileSize;
    boolean canBeBorrowed;

    public Ebook(String title, int id, double fileSize, boolean canBeBorrowed) {
        this.title = title;
        this.id = id;
        this.fileSize = fileSize;
        this.canBeBorrowed = canBeBorrowed;
    }

    @Override
    public void setAsBorrowed() {
        if (isAvailable && canBeBorrowed) {
            isAvailable = false;
            printBookState(IS_BORROWED);
        } else if (!canBeBorrowed) printBookState(CANT_BE_BORROWED);
        else printBookState(IS_NOT_AVAILABLE);
    }

    @Override
    public void setAsReturned() {
        if (!isAvailable) {
            isAvailable = true;
            printBookState(IS_RETURNED);
        } else if (!canBeBorrowed) printBookState(CANT_BE_BORROWED);
        else printBookState(IS_AVAILABLE);
    }

    @Override
    void displayInfo() {
        System.out.println(title);
        System.out.println(id);
        System.out.println(isAvailable);
        System.out.println(fileSize);
        System.out.println(canBeBorrowed);
    }

    @Override
    public void read() {
        System.out.println("User is reading the book with id " + id + ", title " + title + " and with a file size of: " + fileSize);
    }
}
