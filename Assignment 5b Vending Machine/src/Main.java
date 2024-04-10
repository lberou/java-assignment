public class Main {
    public static void main(String[] args) {

        vendingMachine machine = new vendingMachine();

        // θα δημιουργηθούν 3 προϊόντα: Coca Cola 0.6, Sprite 0.7, Fanta 0.5
        machine.products[0] = new Product("Coca Cola", 0.6);
        machine.products[1] = new Product("Sprite", 0.7);
        machine.products[2] = new Product("Fanta", 0.5);

        //Θα δημιουργηθούν 4 νομίσματα: Ten Cent 0.10, Twenty Cent 0.20, Fifty Cent 0.50, One Euro 1
        machine.coins[0] = new Coin("Ten Cent", 0.10);
        machine.coins[1] = new Coin("Twenty Cent", 0.20);
        machine.coins[2] = new Coin("Fifty Cent", 0.50);
        machine.coins[3] = new Coin("One Euro", 1);


        //Στη συνεχεία θα εκτελείται η μέθοδος sellProducts της κλάσης VentingMachine
        machine.sellProducts();

    }
}
