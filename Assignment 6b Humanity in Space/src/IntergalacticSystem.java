public class IntergalacticSystem {

    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth", 12756);
        Planet planet2 = new Planet("Mars", 6779);

        planet1.rotateAroundTheSun();
        planet1.rotateAroundYourself();
        planet1.createEarthquake(37, 22);

        planet2.rotateAroundTheSun();
        planet2.rotateAroundYourself();
        planet1.createEarthquake(44, 18);


        Colony colony1 = new Colony("Earth", 12756, "EarthCaptain", 810000);
        Colony colony2 = new Colony("Mars", 6779, "MarsCaptain", 210000);

        colony2.declareWar(colony1);
        colony2.makePeace(colony1);

        colony1.exploreTheUniverse();
        ManMadeSatellite voyager1 = new ManMadeSatellite("Earth", 5, 2020, "ESA", "Voyager I", "explore mars");
        colony1.launchSatellite(voyager1);
        voyager1.floatAroundParent(planet2);
        voyager1.changeDistance(planet2);
        voyager1.printInfo();
        voyager1.selfDestruct();

        DefensiveWeapon antiArm = new DefensiveWeapon("Earth", 2, 2018, "NASA", 327, true);
        antiArm.selfDestruct();

        DefensiveWeapon antiArmNotNuclear = new DefensiveWeapon("Earth", 3, 2023, "ESA", 120, false);
        antiArmNotNuclear.selfDestruct();

        Debris debris1 = new Debris("Earth", 5, 145, "metal");
        debris1.floatAroundParent(planet1);
        debris1.changeDistance(planet1);

        SatellitePlanet moon = new SatellitePlanet("Earth",3475, "Moon");
        moon.floatAroundParent(planet1);
        moon.changeDistance(planet1);


    }
}
