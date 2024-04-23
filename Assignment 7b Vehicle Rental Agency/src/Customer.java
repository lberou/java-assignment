import java.util.*;

public class Customer implements CustomerActions {

    private int id;
    private String name;
    private List<Vehicle> rentedVehicles;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    public Customer(int id, String name) {
        this.name = name;
        this.id = id;
        rentedVehicles = new ArrayList<>();
    }


    public String rentVehicle(Vehicle vehicle) {
        if (!rentedVehicles.contains(vehicle) && vehicle.isAvailable()) {
            rentedVehicles.add(vehicle);
            vehicle.setAvailable(false);
            return vehicle.getVehicleInfo() + " rented by customer with id: " + id;
        } else return vehicle.getVehicleInfo() + " cannot be rented because is not available";
    }


    public String returnVehicle(Vehicle vehicle) {
        rentedVehicles.remove(vehicle);
        vehicle.setAvailable(true);
        return vehicle.getVehicleInfo() + " returned by customer with id: " + id;
    }



}
