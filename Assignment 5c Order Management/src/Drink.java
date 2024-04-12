public class Drink {
    int id;
    String name;
    double price;

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Drink() {
    }

    public String getDrinkInfo() {
        return "Drink id: " + id + " Drink name: " + name + " Drink price: " + price + "\n";
    }
}
