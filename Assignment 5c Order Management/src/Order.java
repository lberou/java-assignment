public class Order {
    int id;
    Plate[] plates = new Plate[2];
    Drink[] drinks = new Drink[2];

    public void addPlate(Plate plate) {
        for (int i = 0; i < plates.length; i++) {
            if (plates[i] == null) {
                plates[i] = new Plate();
                plates[i] = plate;
                break;
            }

        }


    }

    public void addDrink(Drink drink) {
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] == null) {
                drinks[i] = new Drink();
                drinks[i] = drink;
                break;
            }

        }
    }

    //που θα τυπώνει ότι εχει η παραγγελία
    public void printOrderInfo() {
        System.out.println("Your order is: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(plates[i].getPlateInfo());
            System.out.println(drinks[i].getDrinkInfo());
        }
        System.out.println("And your order id is: " + id);
    }

    public double calculateTotalPrice() {

        double total = 0;
        for (int i = 0; i < 2; i++) {
            total += (plates[i].price + drinks[i].price);
        }
        return total;
    }

}
