import java.util.Objects;

public class Car extends Vehicle {

    String type;

    public Car(double pricePerDay, String licencePlate, String type) {
        super(pricePerDay, licencePlate);
        this.type = type;
    }

    String getVehicleInfo() {
        return type + " car with licence plate " + licencePlate + " and price per day " + getPricePerDay();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
