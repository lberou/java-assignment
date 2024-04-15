public class DefensiveWeapon extends Spacetech {
    int weaponId;
    boolean isNuclear;

    public DefensiveWeapon(String name, int diameter, int yearOfCreation, String companyName, int weaponId, boolean isNuclear) {
        super(name, diameter, yearOfCreation, companyName);
        this.weaponId = weaponId;
        this.isNuclear = isNuclear;
    }

    public void selfDestruct() {
        if (isNuclear) System.out.println("I am a nuclear weapon. I can't self destruct!");
        else System.out.println("I can self destruct");

    }
}
