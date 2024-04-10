import java.util.*;

public class Management {


    Student[] students = new Student[20];

    int capacity = students.length;


    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int input;


        do {

            System.out.println("Menu:\n" + "1.Add New Student\n" + "2.Update Student Grade\n" + "3.Remove a Student\n" + "4.Display Students\n" + "5.Exit\n" + "Please select 1-5");
            input = scanner.nextInt();

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

        int studentId;
        String studentName;
        System.out.println("Enter your ID: ");
        studentId = scanner.nextInt();
        System.out.println("Enter your name: ");
        studentName = scanner.next();

        if (capacity > 0) {

            for (int i = 0; i <= students.length - 1; i++) {


                //check if user exists
                if (students[i] != null && studentId == students[i].id) {
                    System.out.println("User already exists. Cannot add student.");
                    break;
                }

            }
            //search for null index at array to save student info
            for (int j = 0; j <= students.length - 1; j++) {
                if (students[j] == null) {
                    students[j] = new Student(); //instantiate and then add
                    students[j].id = studentId;
                    students[j].name = studentName;
                    capacity--; //reduce capacity at each save
                    break;
                }
            }


        } else
            System.out.println("Database is full. Cannot add student."); // if capacity is full can't register new student

    }


    public void updateGrade(Scanner scanner) {

        int studentId;
        double studentGrade;

        System.out.println("Enter your ID: ");
        studentId = scanner.nextInt();
        do {
            System.out.println("Enter your grade: ");
            studentGrade = scanner.nextDouble();
        } while (studentGrade < 1 || studentGrade > 10); //repeat if Grade is not accepted

        for (int i = 0; i <= students.length; i++) {
            if (students[i] != null && studentId == students[i].id) { //if student exists update Grade
                students[i].grade = studentGrade;
                System.out.println("User with id " + students[i].id + " updated its grade to " + students[i].grade);
                break;
            } else System.out.println("User is not registered.Cannot update your Grade.");
            break;
        }

    }

    public void removingStudent(Scanner scanner) {

        System.out.println("Enter your user Id.");
        int studentId = scanner.nextInt();

        for (int i = 0; i <= students.length - 1; i++) {
            if (students[i] != null && studentId == students[i].id) {
                students[i] = null;
                capacity++;
                System.out.println("User with id: " + studentId + " removed from database");
                break;
            } else System.out.println("User not registered.Cannot delete user that is not registered.");
            break;
        }

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
            str.append("ID: ").append(students[i].id).append(" ").append("Name: ").append(students[i].name).append(" ")
                    .append("Grade: ").append(students[i].grade).append("\n");
        }
        return str.toString();

    }
}

