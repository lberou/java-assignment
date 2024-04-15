public class Planet {
    String name;
    int diameter;

    public Planet(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;

    }

    public void rotateAroundTheSun() {
        System.out.println(name + " rotates around the sun");
    }

    public void rotateAroundYourself() {
        System.out.println(name + "rotates around itself");
    }

    public void createEarthquake(int x, int y) {
        System.out.println(name + " created earthquake at " + x + ", " + y);
    }
}
