import java.util.Objects;

public class Motorcycle extends Vehicle {

    String brand;

    public Motorcycle(String brand, String licencePlate, double pricePerDay) {
        super(pricePerDay, licencePlate);
        this.brand = brand;
    }

    String getVehicleInfo() {
        return brand + " motorcycle with licence plate " + licencePlate + " and price per day " + getPricePerDay();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }
}
