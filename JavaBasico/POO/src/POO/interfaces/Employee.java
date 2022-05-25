package POO.interfaces;

public class Employee {
    // 1. Attributes
    private String name;
    private int age;
    private double salary;
    private boolean active;

    // 2. Constructors
    public Employee ( ) {
    }

    public Employee (String name, int age, double salary, boolean active) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.active = active;
    }

    // 3. Methods
    @Override
    public String toString ( ) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }

    // 4. Getters, setters
    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getSalary ( ) {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public boolean isActive ( ) {
        return active;
    }

    public void setActive (boolean active) {
        this.active = active;
    }
}
