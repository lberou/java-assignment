public class Floatable extends Planet {
    public Floatable(String name, int diameter) {
        super(name, diameter);
    }

    void floatAroundParent(Planet planet) {
        System.out.println("I float around " + planet.name);

    }

    void changeDistance(Planet planet) {
        System.out.println("I am changing distance from " + planet.name);
    }
}
