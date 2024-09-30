package pe.edu.cibertec.angel.reynoso.model;


import pe.edu.cibertec.angel.reynoso.model.Employee;
import pe.edu.cibertec.angel.reynoso.model.Dao;

import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) {
    	Dao employeeDAO = new Dao();

        Employee newEmployee = new Employee();
        newEmployee.setEmployeeName("Carlos Perez");
        newEmployee.setHireDate(new Date());
        employeeDAO.insertEmployee(newEmployee);

        Employee employee = employeeDAO.getEmployeeById(1);
        System.out.println("Empleado ID 1: " + employee.getEmployeeName());

        employee.setEmployeeName("Carlos Pérez Actualizado");
        employeeDAO.updateEmployee(employee);

        employeeDAO.deleteEmployee(2);

        List<Employee> employees = employeeDAO.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println("Empleado: " + emp.getEmployeeName());
        }
    }
}