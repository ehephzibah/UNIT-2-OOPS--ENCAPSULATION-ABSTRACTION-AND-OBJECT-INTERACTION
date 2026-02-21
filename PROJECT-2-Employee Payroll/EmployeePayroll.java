import java.util.*;

abstract class Employee {

    protected String name;
    protected String empId;
    protected double basicSalary;

    Employee(String name, String empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, String empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    double calculateSalary() {
        double hra = basicSalary * 0.20;
        double da  = basicSalary * 0.10;
        return basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Total Salary  : " + calculateSalary());
        System.out.println("----------------------------");
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---EMPLOYEE PAYROLL---");
        System.out.println();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees[i] = new FullTimeEmployee(name, id, salary);
        }

        System.out.println("\n--- Employee Payroll Details ---");
        for (int i=0;i<n;i++) {
            employees[i].displayDetails();
        }

        sc.close();
    }
}


