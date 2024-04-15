public class Spacetech extends Floatable {
    int yearOfCreation;
    String companyName;

    public Spacetech(String name, int diameter, int yearOfCreation, String companyName) {
        super(name, diameter);
        this.companyName = companyName;
        this.yearOfCreation=yearOfCreation;
    }

    public void selfDestruct() {
        System.out.println("I can self destruct");
    }
}
