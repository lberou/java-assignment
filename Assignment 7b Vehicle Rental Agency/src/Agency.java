import java.util.*;

public class Agency implements AgencyActions {

    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();


    public String addCustomer(Customer customer) {

        for (Customer c : customers) {

            if (c.name.equals(customer.name)) {
                return "Customer already exists. Cannot be added";
            }
        }

        customers.add(customer);
        return "Customer added";

    }

    public void displayAvailableVehicles() {
        for (Vehicle v : vehicles)
            System.out.println(v.getVehicleInfo());

    }

    public String rentVehicle(int customerId, String licencePlate) {

        for (int i = 0; i < customers.size(); i++)  {
            for (int j = 0; j < vehicles.size(); j++)  {

                 if (customers.get(i).id == customerId && vehicles.get(j).licencePlate.equals(licencePlate)) {
                   return  customers.get(i).rentVehicle(vehicles.get(j));
                }

        }

    }
        return "can't rent it wrong id or wrong licence plate";
    }

    public String returnVehicle(int customerId, String licencePlate) {
        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < vehicles.size(); j++) {

                if (customers.get(i).id == customerId && vehicles.get(j).licencePlate.equals(licencePlate)) {
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
