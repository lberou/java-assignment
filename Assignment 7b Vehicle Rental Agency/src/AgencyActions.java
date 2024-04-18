public interface AgencyActions {
    public String addCustomer(Customer customer);
    public void displayAvailableVehicles();
    public String rentVehicle(int customerId, String licencePlate);
    public String returnVehicle(int customerId, String licencePlate);
    public String addVehicle(Vehicle vehicle);
}
