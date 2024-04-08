public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
    }

    public String getName() {
        return name;
    }
}
