public class Car extends Vehicle {

    String type;

    public Car(double pricePerDay, String licencePlate, String type) {
        super(pricePerDay, licencePlate);
        this.type = type;
    }

    String getVehicleInfo() {
        return type + " car with licence plate " + licencePlate + " and price per day " + getPricePerDay();
    }
    //TODO equals and hashcode na rwtisw Panteli
}
