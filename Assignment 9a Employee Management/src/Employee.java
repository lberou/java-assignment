import java.util.List;

public class Employee {

    private String name;
    private int age;
    private int salary;

    private String department;
    private List<String> skills;

    public Employee(String name, int age, int salary, String department, List<String> skills) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee:\n" + "name=" + name + "\n" +
                "age= " + age + "\n" +
                "salary= " + salary + "\n" +
                "department= " + department + "\n" +
                "skills= " + skills + "\n";
    }


}