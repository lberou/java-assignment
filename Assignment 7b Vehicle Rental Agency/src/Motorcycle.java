public class Motorcycle extends Vehicle {

    String brand;

    public Motorcycle(String brand, String licencePlate, double pricePerDay) {
        super(pricePerDay, licencePlate);
        this.brand = brand;
    }

    String getVehicleInfo() {
        return brand + " motorcycle with licence plate " + licencePlate + " and price per day " + getPricePerDay();
    }

    //TODO equals and hashcode na rwtisw Panteli
}
