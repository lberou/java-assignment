public class EggsFred {
    public static void main(String[] args) {
        int eggsMonday = 100;
        int eggsTuesday = 121;
        int eggsWednesday = 117;

        System.out.println("Την Δευτέρα ο Fred συλλέγει: " + eggsMonday + " αυγά.\nΤην Τρίτη συλλέγει: " + eggsTuesday + " αυγά.\n"
                + "Την Τετάρτη συλλέγει: " + eggsWednesday + " αυγά.\n");
        int dailyAverage = (eggsMonday + eggsTuesday + eggsWednesday) / 3;
        System.out.println("O ημερήσιος αριθμός συλλογής αυγών είναι: " + dailyAverage + " αυγά.");

        // Υποθέτοντας ότι ο Fred συλλέγει αυγά μόνο Δευτέρα με Τετάρτη (3 μέρες τη βδομάδα για 4 βδομάδες)
        int monthlyAverage = dailyAverage * 12;

        System.out.println("O μηνιαίος αριθμός συλλογής αυγών είναι: " + monthlyAverage+ " αυγά.");

        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Tο συνολικό μηνιαίο κέρδος από τα αυγά του αγρότη Fred είναι: " + monthlyProfit + " €");

    }
}

