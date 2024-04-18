public abstract class Vehicle implements Rentable {
    double pricePerDay;
    boolean isAvailable;
    String licencePlate;

    public Vehicle(double pricePerDay, String licencePlate) {
        this.pricePerDay = pricePerDay;
        this.licencePlate = licencePlate;
        isAvailable = true;
    }

    abstract String getVehicleInfo();

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;

    }

    //TODO equals and hashcode na rwtisw Panteli

}
