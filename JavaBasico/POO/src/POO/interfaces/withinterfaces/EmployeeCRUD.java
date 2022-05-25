package POO.interfaces.withinterfaces;

import POO.interfaces.Employee;

import java.util.List;

public interface EmployeeCRUD {
    public void create(Employee employee);

    public List<Employee> readAll();

    public void delete(Employee employee);
}
