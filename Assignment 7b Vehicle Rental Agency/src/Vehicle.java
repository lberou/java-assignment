import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(licencePlate, vehicle.licencePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licencePlate);
    }


}
