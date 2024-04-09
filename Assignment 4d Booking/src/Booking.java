public class Booking {
    public static void main(String args[]) {

        Hotel hilton = new Hotel(new Room(1, 50), new Room(2, 70));
//        Room room1=new Room(1,50);
//        Room room2=new Room(2,70);

        Client client1 = new Client("John", 25);
        Client client2 = new Client("Alex", 17);


        hilton.createReservation(client1);
        hilton.createReservation(client2);

        hilton.printReceipt(client1);
        System.out.println("\n");
        hilton.printReceipt(client2);
        System.out.println("\n");
        hilton.removeReservation(client1);
        hilton.printReceipt(client1);

    }
}
