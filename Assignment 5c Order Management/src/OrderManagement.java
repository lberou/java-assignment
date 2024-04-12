import java.util.Random;
import java.util.Scanner;

public class OrderManagement {
    Order[] orders = new Order[4];
    Plate[] plates = new Plate[3];
    Drink[] drinks = new Drink[3];

    public void orderOptions() {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("1. Add New Order\n2. Display Order Info\n3. Pay and Close Order\n4. Exit");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    addOrder(scanner);
                    break;
                case 2:
                    printOrderInfo(scanner);
                    break;
                case 3:
                    deleteOrder(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
            }

        } while (input != 4);

    }

    public int nullIndexOrders() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = new Order();
                return i;
            }
        }
        return -1;
    }

    public void addOrder(Scanner scanner) {
        System.out.println("Hello and welcome. Here are the plates and the drinks: ");
        for (int i = 0; i < plates.length; i++) {
            System.out.println(plates[i].getPlateInfo());
        }
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].getDrinkInfo());
        }
        int idInput;
        int choiceCounterPlates = 0; // to assure 2 plate choices
        int choiceCounterDrinks = 0; //to assure 2 drink choices
        int indexOrder = nullIndexOrders();

        Random random = new Random();
        int random100 = random.nextInt(100);


        System.out.println("What shall we bring you? Please insert the id of two plates and two drinks");
        while (choiceCounterPlates < 2) {
            System.out.println("Please choose plate ids");
            idInput = scanner.nextInt();
            boolean idPresent = false;

            for (int i = 0; i <= plates.length - 1; i++) {
                if (idInput == plates[i].id) {
                    System.out.println("You chose " + plates[i].getPlateInfo());
                    orders[indexOrder].addPlate(plates[i]);
                    choiceCounterPlates++;
                    idPresent = true;
                    break;
                }

            }
            if (!idPresent) {
                System.out.println("The id you have chosen doesn't belong to a plate");
            }

        }


        while (choiceCounterDrinks < 2) {
            System.out.println("Please choose drink ids");
            idInput = scanner.nextInt();
            boolean idPresent = false;

            for (int i = 0; i <= drinks.length - 1; i++) {
                if (idInput == drinks[i].id) {
                    System.out.println("You chose " + drinks[i].getDrinkInfo());
                    orders[indexOrder].addDrink(drinks[i]);
                    choiceCounterDrinks++;
                    idPresent = true;
                    break;
                }
            }
            if (!idPresent) {
                System.out.println("The id you have chosen doesn't belong to a drinks");
            }

        }

        orders[indexOrder].id = random100;
        System.out.println(orders[indexOrder].id);
        orders[indexOrder].printOrderInfo();

    }

    public void printOrderInfo(Scanner scanner) {
        System.out.println("Please enter the id of your order");
        int idInput = scanner.nextInt();

        for (int i = 0; i < orders.length - 1; i++) {
            if (orders[i] != null && orders[i].id == idInput) {
                orders[i].printOrderInfo();
                break;
            } else System.out.println("Your order id is not valid");
            break;
        }
    }

    public void deleteOrder(Scanner scanner) {
        System.out.println("Please enter the id of your order");
        int idInput = scanner.nextInt();

        for (int i = 0; i < orders.length - 1; i++) {
            if (orders[i] != null && orders[i].id == idInput) {
                System.out.println("You have to pay: " + orders[i].calculateTotalPrice() + " euros");
                System.out.println("Your order with id: " + orders[i].id + " is deleted");
                orders[i] = null;
                break;
            } else System.out.println("Your order id is not valid");
            break;
        }

    }

}
