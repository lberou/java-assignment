public class ManMadeSatellite extends Spacetech {
    String name;
    String purpose;

    public ManMadeSatellite(String name, int diameter, int yearOfCreation, String companyName, String nameManMadeSatellite, String purpose) {
        super(name, diameter, yearOfCreation, companyName);
        this.name = nameManMadeSatellite;
        this.purpose = purpose;
    }


    public void printInfo() {
        System.out.println("Man-made satellite name is " + name + " and purpose is to " + purpose + ".The year" +
                " of creation is " + yearOfCreation + " by company " + companyName);
    }
}
