public class Plate {

    int id;
    String name;
    double price;

    public Plate(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Plate() {
    }

    public String getPlateInfo() {
        return "Plate id: " + id + " Plate name: " + name + " Plate price: " + price + "\n";
    }
}
