import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static String gameResult;
    int userSelection;

    public RockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ας παίξουμε. Διάλεξε 0 για την Πέτρα, 1 για το Χαρτί, 2 για τo Ψαλίδι: ");
        userSelection = scanner.nextInt();
        System.out.println("Επιλέξατε: " + userSelection);
        scanner.close();
    }

    public static void main(String[] args) {
        RockPaperScissors player = new RockPaperScissors();
        gameResult = playGame(player.userSelection);
        player.printResult(gameResult);
    }

    public static String playGame(int selection) {
        Random random = new Random();
        int pcSelection = random.nextInt(3);
        System.out.println("Το Pc Επέλεξε: " + pcSelection);

        // Τιμές μη αποδεκτές
        if (selection < 0 || selection > 2) {
            return "Error";
        }
        // Χρήστης επιλέγει Πέτρα
        else if (selection == 0) {
            // PC Χαρτί
            if (pcSelection == 1) {
                return "PC";
            }
            // PC Ψαλίδι
            else if (pcSelection == 2) {
                return "User";
            }
            // PC Πέτρα
            else return "None";
        }
        // Χρήστης επιλέγει Χαρτί
        else if (selection == 1) {
            // PC Πέτρα
            if (pcSelection == 0) {
                return "User";
            }
            // PC Ψαλίδι
            else if (pcSelection == 2) {
                return "PC";
            }
            // PC Χαρτί
            else return "None";

        }
        // Χρήστης επιλέγει Ψαλίδι
        else {
            // PC Πέτρα
            if (pcSelection == 0) {
                return "PC";
            }
            // PC Χαρτί
            else if (pcSelection == 1) {
                return "USER";
            }
            // PC Ψαλίδι
            else return "None";

        }
    }
    public void printResult(String result) {
        if (result.equals("None")) {
            System.out.println("Ισοπαλία");
        } else if (result.equals("User")) {
            System.out.println("Ο νικητής είναι: User");
        } else if (result.equals("PC")) {
            System.out.println("Ο νικητής είναι: PC");
        } else {
            System.out.println("Λάθος επιλογή");
        }

    }

}