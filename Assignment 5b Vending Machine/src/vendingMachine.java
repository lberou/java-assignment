import java.util.Scanner;
import java.lang.Math;


public class vendingMachine {
    Product[] products = new Product[3];
    Coin[] coins = new Coin[4];

    Scanner scanner = new Scanner(System.in);


    private void printProducts() {
        for (int i = 0; i <= products.length - 1; ++i) {

            System.out.println(i + 1 + ". " + products[i].printProductDetails());

        }

    }

    private void printCoins() {
        for (int i = 0; i <= coins.length - 1; ++i) {
            System.out.println(i + 1 + ". " + coins[i].printCoinDetails());
        }

    }


    public void sellProducts() {


        int input;
        int coin;
        do {
            System.out.println("Are you thirsty? Choose α refreshment");
            printProducts();
            input = scanner.nextInt();
        } while (input < 1 || input > 3); //If user give wrong input

        switch (input) {
            case 1:
                System.out.println("You have chosen: " + products[0].printProductDetails());
                chooseCoin(0);
                break;
            case 2:
                System.out.println("You have chosen: " + products[1].printProductDetails());
                chooseCoin(1);
                break;
            case 3:
                System.out.println("You have chosen: " + products[2].printProductDetails());
                chooseCoin(2);
                break;
        }

    }

    public void chooseCoin(int i) {
        int inputCoins;
        System.out.println("You can enter the following coins to pay " + products[i].price + " for your " + products[i].name);
        do {
            printCoins();
            inputCoins = scanner.nextInt();

            switch (inputCoins) {
                case 1:
                    products[i].price -= 0.1;
                    System.out.println("Remaining: " + products[i].price);
                    break;

                case 2:
                    products[i].price -= 0.2;
                    System.out.println("Remaining: " + products[i].price);
                    break;

                case 3:
                    products[i].price -= 0.5;
                    System.out.println("Remaining: " + products[i].price);
                    break;

                case 4:
                    products[i].price -= 1;
                    System.out.println("Remaining: " + products[i].price);
                    break;
            }

        } while ((inputCoins < 1 || inputCoins > 4) || products[i].price > 0);

        double change;
        if (products[i].price < 0) {
            change = Math.abs(products[i].price);
            String formattedString = String.format("%.02f", change);
            System.out.println("Your change is: " + formattedString);
        }


    }

}
