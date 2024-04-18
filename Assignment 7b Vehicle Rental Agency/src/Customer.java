import java.util.ArrayList;

public class Customer implements CustomerActions {

    int id;
    String name;
    ArrayList<Vehicle> rentedVehicles = new ArrayList<Vehicle>();

    public Customer(int id, String name) {
        this.name = name;
        this.id = id;
    }


    public String rentVehicle(Vehicle vehicle) {
        if (vehicle.isAvailable()) {
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

    //TODO equals and hashcode na rwtisw Panteli

}
