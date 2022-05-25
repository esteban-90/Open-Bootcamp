package POO.interfaces.withoutinterfaces;

import POO.interfaces.Employee;

import java.util.List;

public class Main {
    public static void main (String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        Employee Juan = new Employee("Juan", 30, 4000, true);
        Employee Patricia = new Employee("Patricia", 30, 4500, true);
        Employee Roberto = new Employee("Roberto", 30, 4300, true);

        employeeCRUD.create(Juan);
        employeeCRUD.create(Patricia);
        employeeCRUD.create(Roberto);

        List<Employee> employees = employeeCRUD.readAll();
        System.out.println(employees);
    }
}
