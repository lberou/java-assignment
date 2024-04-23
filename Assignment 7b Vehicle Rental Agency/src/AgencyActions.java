public interface AgencyActions {
    String addCustomer(Customer customer);
    void displayAvailableVehicles();
    String rentVehicle(int customerId, String licencePlate);
    String returnVehicle(int customerId, String licencePlate);
    String addVehicle(Vehicle vehicle);
}
