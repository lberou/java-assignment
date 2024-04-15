public class Colony extends Planet {
    String mayorName;
    long population;

    public Colony(String name, int diameter, String mayorName, long population) {
        super(name, diameter);
        this.mayorName = mayorName;
        this.population = population;
    }

    public void declareWar(Colony colony) {

        System.out.println("I declare war on " + colony.name);
    }

    void makePeace(Colony colony) {

        System.out.println("I make peace with " + colony.name);
    }

    void exploreTheUniverse() {
        System.out.println("I explore the universe");
    }

    void launchSatellite(ManMadeSatellite satellite) {
        System.out.println("I launch satellite " + satellite.name);

    }

}


