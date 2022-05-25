package POO.interfaces.withinterfaces;

import POO.interfaces.Employee;

public class Main {
    private static final EmployeeCRUD employeeCRUD = new EmployeeCRUDMySQL();

    public static void main (String[] args) {
        employeeCRUD.create(new Employee());
        System.out.println(employeeCRUD.readAll());;
    }
}

