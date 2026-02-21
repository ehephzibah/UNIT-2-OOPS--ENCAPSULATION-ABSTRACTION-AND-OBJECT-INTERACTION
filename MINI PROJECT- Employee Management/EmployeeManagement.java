import java.util.*;
interface EmployeeOperations {
    void calculateSalary();
    void displayEmployee();
}
class Employee implements EmployeeOperations {

    String empName;
    String empId;
    double basicSalary;
    double totalSalary;

    Employee(String name, String id, double salary) {
        this.empName = name;
        this.empId = id;
        this.basicSalary = salary;
    }

    public void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        totalSalary = basicSalary + hra + da;
    }

    public void displayEmployee() {
        System.out.println("Name   : " + empName);
        System.out.println("ID     : " + empId);
        System.out.println("Salary : " + totalSalary);
        System.out.println("--------------------");
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---EMPLOYEE MANAGEMENT---");
        System.out.println();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        EmployeeOperations[] emp = new EmployeeOperations[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // buffer clear

            emp[i] = new Employee(name, id, salary);
            emp[i].calculateSalary();
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].displayEmployee();
        }

        sc.close();
    }
}



