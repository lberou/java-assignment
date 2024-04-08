public class Eggs {
    public static void main(String[] args) {

        System.out.println("Ο αγρότης Brown στην πρώτη περίπτωση συνέλεξε: " + totalEggs(5, 3) + " αυγά");
        System.out.println("Ο αγρότης Brown στην δεύτερη περίπτωση συνέλεξε: " + totalEggs(4, 8) + " αυγά");

    }

    public static int totalEggs(int eggsPerChicken, int chickenCount) {
        int sumEggs;
        //Δευτέρα
        sumEggs = eggsPerChicken * chickenCount;
        //Τρίτη
        sumEggs += eggsPerChicken * (++chickenCount);
        //Τετάρτη
        sumEggs += eggsPerChicken * (chickenCount / 2);


        return sumEggs;
        //Δευτέρα
    }


}
