public class Rental {

    public static void main(String[] args) {
        Agency agency = new Agency();

        Customer customerJon = new Customer(327, "Jon Dee");
        Customer customerAnn = new Customer(33, "Ann Lee");

        agency.addCustomer(customerJon);
        agency.addCustomer(customerAnn);

        Car carJeep = new Car(80.0, "ABC-1234", "Jeep");
        Motorcycle motorBmw = new Motorcycle("BMW", "DEF-4567", 60.0);

        System.out.println(agency.addVehicle(carJeep));
        System.out.println(agency.addVehicle(motorBmw));

        agency.displayAvailableVehicles();

        System.out.println(agency.rentVehicle(327, "ABC-1234")); // try to rent an available vehicle first customer
        System.out.println(agency.rentVehicle(327, "ABC-1234")); // try to rent a non-available vehicle
        System.out.println(agency.returnVehicle(327, "ABC-1234")); // try to return a vehicle

        System.out.println(agency.rentVehicle(33, "DEF-4567")); // try to rent an available vehicle second customer
        System.out.println(agency.returnVehicle(33, "DEF-4567")); // try to return a vehicle second customer

        System.out.println(agency.rentVehicle(328, "ABC-1234")); // try to rent an available vehicle with a non-existing customer id
        System.out.println(agency.rentVehicle(33, "DEF-4568"));  // try to rent a non-existing vehicle with an existing customer id

    }
}
