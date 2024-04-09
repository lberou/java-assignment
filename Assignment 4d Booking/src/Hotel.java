public class Hotel {
    Room room1;
    Room room2;

    public Hotel(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void createReservation(Client client) {
        if (client.room == null) {
            if (room1.isAvailable) {
                client.room = room1;
                room1.isAvailable = false;
            } else if (room2.isAvailable) {
                client.room = room2;
                room2.isAvailable = false;
            } else System.out.println("No room available");
        }
    }

    public void removeReservation(Client client) {
        if (client.room != null) {
            client.room.isAvailable = true;
            client.room = null;
        }
    }

    public void printReceipt(Client client) {
        if (client.room != null) {
            System.out.println("Client name: " + client.name);
            System.out.println("Client age: " + client.age);
            System.out.println("Room id: " + client.room.id);
            System.out.println("Room price: " + client.room.price);
            double touristTax = (client.age >= 18) ? (0.05 * client.room.price) : 0;
            System.out.println("Tourist tax: " + touristTax);
            System.out.println("Total: " + (client.room.price + touristTax));

        } else System.out.println("Client " + client.name + " has no rooms booked under his name");

    }
}
