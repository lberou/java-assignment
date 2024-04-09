public class Book {
    String title;
    boolean isAvailable;


    public Book(String title) {
        this.title = title;
        isAvailable = true;

    }


    public void printAvailability(boolean isAvailable) {
        if (isAvailable) {
            System.out.println(title + "Διαθέσιμο για ενοικίαση");
        } else System.out.println(title + "Μη Διαθέσιμο για ενοικίαση");
    }
}
