package POO.interfaces.withoutinterfaces;

import POO.interfaces.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    private final List<Employee> employees = new ArrayList<>();

    public void create (Employee employee) {
        employees.add(employee);
    }

    public List<Employee> readAll ( ) {
        return employees;
    }
}
