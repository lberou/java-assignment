import java.util.*;

public class Management {


    Student[] students = new Student[20];

    int capacity = students.length;
    static int input;



    public void showMenu() {
        do {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Menu:\n" + "1.Add New Student\n" + "2.Update Student Grade\n" + "3.Remove a Student\n" + "4.Display Students\n" + "5.Exit\n" + "Please select 1-5");
                input = scanner.nextInt();
            } while (input > 5);

            switch (input) {
                case 1:
                    addStudents(scanner);
                    break;
                case 2:
                    updateGrade(scanner);
                    break;
                case 3:
                    removingStudent(scanner);
                    break;
                case 4:
                    System.out.println(displayStudents());
                    break;
                case 5:
                    System.out.println("arrivederci");
            }
        } while (input != 5);

    }

    public void addStudents(Scanner scanner) {
        scanner = new Scanner(System.in);
        int studentId;
        String studentName;
        System.out.println("Enter your ID: ");
        studentId = scanner.nextInt();
        System.out.println("Enter your name: ");
        studentName = scanner.next();

        if (capacity > 0) {

            for (int i = 0; i <= students.length - 1; i++) {
                students[i] = new Student(); //instantiate elements of array

//                if (students[i] == null) {
//                    continue;
//                }
                if (studentId == students[i].id) {
                    System.out.println("User already exists. Cannot add student.");
                    break;
                }

            }
            for (int j = 0; j <= students.length - 1; j++) {
                if (students[j] != null) {
                    students[j].id = studentId;
                    students[j].name = studentName;
                    capacity--;
                }
            }


        } else System.out.println("Database is full. Cannot add student.");
        scanner.close();
    }


    public void updateGrade(Scanner scanner) {
        scanner = new Scanner(System.in);
        int studentId;
        double studentGrade;

        System.out.println("Enter your ID: ");
        studentId = scanner.nextInt();
        do {
            System.out.println("Enter your grade: ");
            studentGrade = scanner.nextDouble();
        } while (studentGrade < 1 || studentGrade > 10); //επανέλαβε αν δώσει λάθος βαθμό

        for (int i = 0; i <= students.length; i++) {
            if (studentId == students[i].id) {
                students[i].grade = studentGrade;
            } else System.out.println("User not registered.Cannot update your Grade.");
        }
        scanner.close();
    }

    public void removingStudent(Scanner scanner) {
        scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();

        for (int i = 0; i <= students.length; i++) {
            if (studentId == students[i].id) {
                students[i] = null;
                capacity++;

            } else System.out.println("User not registered.Cannot delete user that is not registered.");
        }
        scanner.close();
    }


    public String displayStudents() {
        if (students == null) {
            return "There are no students registered to display";
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= students.length - 1; i++) {
            if (students[i] == null) {
                continue;
            }
            str.append(" ").append(students[i]);
        }
        return str.toString();

    }
}

