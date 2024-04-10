public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String printProductDetails() {

        return "Product name: " + name + "\nProduct price: " + price + "\n";
    }
}
