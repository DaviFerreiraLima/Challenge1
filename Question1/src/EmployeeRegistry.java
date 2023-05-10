import java.util.Scanner;

public class EmployeeRegistry {
    private Employee[] employees;

    private int Employeesnumber;
    static Scanner scanner = new Scanner(System.in);

    public int askEmployeesNumber(){
        System.out.println("How many employees you want to register? ");
        return scanner.nextInt();
    }
    public void registerEmployees () {
        employees = new Employee[askEmployeesNumber()];
        for (int i = 0; i < employees.length; i++) {

            System.out.println("Write the name of the " + (i + 1) + "º employee");
            scanner.nextLine();
            String employeeName = scanner.nextLine();

            System.out.println("Write the salary of the " + (i + 1) + "º employee");
            double employeeSalary = scanner.nextDouble();

            employees[i] = new Employee(employeeName, employeeSalary);
        }
    }
    public void listinEmployees(){
        for (Employee employe : employees) {
            System.out.println(employe.toString());
        }
    }

}
