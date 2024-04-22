import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    static List<Employee> employees = Arrays.asList(
            new Employee("Alice", 25, 50000, "HR", Arrays.asList("Communication", "Teamwork")),
            new Employee("Bob", 32, 60000, "IT", Arrays.asList("Java", "Python")),
            new Employee("Charlie", 28, 55000, "Finance", Arrays.asList("Accounting", "Excel")),
            new Employee("David", 35, 70000, "IT", Arrays.asList("JavaScript", "SQL")),
            new Employee("Eva", 45, 80000, "HR", Arrays.asList("Leadership", "Negotiation")),
            new Employee("Frank", 40, 75000, "Finance", Arrays.asList("Financial Analysis", "Budgeting")),
            new Employee("Grace", 29, 70000, "IT", Arrays.asList("Java", "Python")));


    public static void main(String[] args) {
        System.out.println("EMPLOYEES UNDER 30 YEARS OLD");
        List<Employee> employeesAgeLessThan30 = employees.stream().filter(e -> e.getAge() < 30).toList();
        employeesAgeLessThan30.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("EMPLOYEES WITH SALARY LARGER THAN 60000");
        List<Employee> employeesSalaryMoreThan60K = employees.stream().filter(e -> e.getSalary() > 60000).toList();
        employeesSalaryMoreThan60K.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("EMPLOYEES NAMES");
        List<String> employeesNames = employees.stream().map(Employee::getName).toList();
        employeesNames.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("UNIQUE DEPARTMENTS");
        List<String> uniqueDepartments = employees.stream().map(Employee::getDepartment).map(String::toLowerCase).distinct().toList();
        uniqueDepartments.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("UNIQUE SALARIES");
        List<Integer> uniqueSalaries = employees.stream().map(e -> e.getSalary()).distinct().toList();
        uniqueSalaries.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("MAP OF THE EMPLOYEE'S NAME WITH SALARY");
        Map<String, Integer> nameSalary = employees.stream().collect(Collectors.toMap(Employee::getName,
                Employee::getSalary));
        nameSalary.forEach((name, salary) -> System.out.println(name + ":" + salary));

        System.out.println("======================================");
        System.out.println("MIN AND MAX SALARY");
        Optional<Employee> minSalary = employees.stream().min(Comparator.comparing(Employee::getSalary));
        Optional<Employee> maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary));
        minSalary.ifPresent(e -> System.out.println("min salary: " + e.getName() + " with salary " + e.getSalary()));
        maxSalary.ifPresent(e -> System.out.println("max salary: " + e.getName() + " with salary " + e.getSalary()));

        System.out.println("======================================");
        System.out.println("4 FIRST EMPLOYEES");
        List<Employee> fourFirstEmployees = employees.stream().limit(4).toList();
        fourFirstEmployees.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("EMPLOYEES 30-40 YEARS OLD THAT WORK AT IT");
        List<Employee> employees3040It = employees.stream().filter(e -> (e.getAge() > 30 && e.getAge() < 40) && e.getDepartment().equals("IT")).toList();
        employees3040It.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("EMPLOYEES OVER 50");
        boolean employeeOver50 = employees.stream().anyMatch(employee -> employee.getAge() > 50);
        if (employeeOver50) {
            System.out.println("There is at least an employee over 50 years.");
        } else {
            System.out.println("No employee over 50 years.");
        }

        System.out.println("======================================");
        System.out.println("EMPLOYEES WITH JAVA IN THEIR LIST");
        List<Employee> employeesJavaInList = employees.stream().filter(e -> e.getSkills().contains(("Java"))).toList();
        employeesJavaInList.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("EMPLOYEES THAT KNOWS PYTHON AND WITH SALARY OVER 60000");
        List<Employee> employeesPythonMoreThan60k = employees.stream().filter(e -> (e.getSkills().contains(("Python")) && e.getSalary() > 60000)).toList();
        employeesPythonMoreThan60k.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("AN EMPLOYEE FROM HR");
        Optional<Employee> employeeHr = employees.stream().filter(e -> e.getDepartment().equals("HR"))
                .findFirst();

        System.out.println(employeeHr);

        System.out.println("======================================");
        System.out.println("LIST OF SKILLS FROM Z TO A");
        List<String> skillsZA = employees.stream().flatMap(e -> e.getSkills().stream()).distinct().sorted(Comparator.reverseOrder())
                .toList();
        skillsZA.forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("STRING OF SKILLS WITH COMA IN BETWEEN");
        String skillsWithComa = employees.stream().flatMap(e -> e.getSkills().stream()).distinct().sorted().collect(Collectors.joining(", "));
        System.out.println(skillsWithComa);

    }

}



