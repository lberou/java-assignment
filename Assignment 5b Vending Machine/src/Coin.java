public class Coin {

    String name;
    double value;

    public Coin(String name, double value) {

        this.name = name;
        this.value = value;
    }

    public String printCoinDetails() {
       return "Coin name: " + name + " Coin value: " + value + "\n";
    }
}
