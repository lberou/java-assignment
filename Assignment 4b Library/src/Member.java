public class Member {
    String name;
    String surname;
    Book book;

    public Member(String name, String surname) {
        this.name = name;
        this.surname = surname;
        book = null;
    }

    public void addBook(Book book) {

        if (book.isAvailable && this.book == null) {
            book.isAvailable = false;
            this.book = new Book(book.title);
        }
    }

    public void returnBook(Book book) {
        if (this.book != null) {
            book.isAvailable = true;
            this.book = null;
        }

    }

    public String getMemberInformation() {
        if (book != null) {
            return "Ο χρήστης " + name + " έχει δανειστεί το βιβλίο " + book.title;
        }
        return "Ο χρήστης " + name + " δεν έχει δανειστεί κάποιο βιβλίο";
    }


}
