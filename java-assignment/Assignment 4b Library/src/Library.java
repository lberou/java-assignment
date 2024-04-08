public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Java A Beginner’s Guide");
        Book book2 = new Book("Java for Dummies");

        Member member1 = new Member("John", "Dee");
        Member member2 = new Member("Ann", "Lee");


        System.out.println("Να νοικιάσει ο John και η Ann το πρώτο βιβλιο και \n" +
                "δείτε τι έχει ενοικιάσει ο καθένας\n");
        member1.addBook(book1);
        member2.addBook(book1);

        System.out.println(member1.getMemberInformation());
        System.out.println(member2.getMemberInformation());
        printStatus(book1,book2);


        System.out.println("Να νοικιάσει ο John το δευτερo βιβλιο και τυπώστε τι έχει ενοικιάσει ο John\n");
        member1.addBook(book2);        //Αφού έχει ήδη βιβλίο η addBook δεν αποθηκεύει τίποτα
        System.out.println(member1.getMemberInformation());
        printStatus(book1,book2);


        System.out.println("Να επιστρέψει ο John το βιβλιο και τυπώστε τι έχει ενοικιάσει ο John\n");
        member1.returnBook(book1);
        System.out.println(member1.getMemberInformation());
        printStatus(book1,book2);


        System.out.println("Να νοικιάσει η Ann το πρωτο βιβλιο και τυπώστε τι έχει ενοικιάσει η Ann\n");
        member2.addBook(book1);
        System.out.println(member2.getMemberInformation());
        printStatus(book1,book2);



    }
    public static void printStatus(Book book1, Book book2){
        System.out.println("===========================================");
        System.out.println("Το βιβλίο Java A Beginner’s Guide είναι διαθέσιμο: " + book1.isAvailable);
        System.out.println("Το βιβλίο Java for Dummies: είναι διαθέσιμο: " + book2.isAvailable);
    }
}
