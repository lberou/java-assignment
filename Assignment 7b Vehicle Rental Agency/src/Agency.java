import java.util.*;

public class Agency implements AgencyActions {

    private List<Customer> customers;
    private List<Vehicle> vehicles;

    public Agency() {
        customers = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public String addCustomer(Customer customer) {

        for (Customer c : customers) {

            if (c.getName().equals(customer.getName())) {
                return "Customer already exists. Cannot be added";
            }
        }

        customers.add(customer);
        return "Customer added";

    }

    public void displayAvailableVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available for rent.");
        } else {
            for (Vehicle v : vehicles) {
                if (v.isAvailable()) {
                    System.out.println(v.getVehicleInfo());
                }

            }
        }
    }

    public String rentVehicle(int customerId, String licencePlate) {

        if (customers == null) {
            System.out.println("Customer List empty");
        }

        if (vehicles == null) {
            System.out.println("Vehicle List empty");
        }


        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < vehicles.size(); j++) {
                if (customers.get(i).getId() == customerId && vehicles.get(j).licencePlate.equals(licencePlate)) {
                    return customers.get(i).rentVehicle(vehicles.get(j));
                }
            }
        }
        return "can't rent it wrong id or wrong licence plate";
    }

    public String returnVehicle(int customerId, String licencePlate) {
        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < vehicles.size(); j++) {
                if (customers.get(i).getId() == customerId && vehicles.get(j).licencePlate.equals(licencePlate)) {
                    return customers.get(i).returnVehicle(vehicles.get(j));
                }
            }
        }
        return "can't return it wrong id or wrong licence plate";
    }

    public String addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle.getVehicleInfo() + " added to Agency!";
    }


}
