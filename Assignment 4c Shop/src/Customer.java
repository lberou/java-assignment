public class Customer {
    int customerId;
    ShoppingCart shoppingCart;

    public Customer(int customerId, ShoppingCart shoppingCart) {
        this.customerId = customerId;
        this.shoppingCart = shoppingCart;
    }

    public void shoppingOptions(String choice, Product product) {
        if (choice.equals("add")) {
            shoppingCart.addProduct(product);
        } else if (choice.equals("remove")) {
            shoppingCart.removeProduct(product);

        } System.out.println("Λάθος Επιλογή");
    }

    public void checkout() {

        shoppingCart.printCheckout();
        System.out.println("To customerId του πελάτη είναι: " + customerId);
    }
}
