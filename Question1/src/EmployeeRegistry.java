import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeRegistry {
    private Employee[] employees;
    static Scanner scanner = new Scanner(System.in);


    /**
     * Method for requesting the number of employees to register.
     *
     * @return The number of employees to be registered.
     * @throws InputMismatchException If the entered value is not an integer or is less than or equal to 0.
     */

    public int askEmployeesNumber(){
        System.out.println("How many employees you want to register? ");

        if (scanner.hasNextInt()){
            int employeesNumber = scanner.nextInt();
            if (employeesNumber> 0){
                return employeesNumber;
            }else{
               throw new InputMismatchException("You cant insert a value less than 1");
            }
        }else{
            throw new InputMismatchException("You cant insert a value that is not a int");
        }

    }

    /**
     * Method to list the registered employees.
     */
    public void listinEmployees(){
        for (Employee employe : employees) {
            System.out.println(employe.toString());
        }
    }
    
    /**
     * Method to register employees.
     *
     * @throws InputMismatchException If input  errors occurr during the employees registration.
     */

    public void registerEmployees () {
        try{
            String employeeName;
            double employeeSalary;
            int employeesNumber = askEmployeesNumber();
            employees = new Employee[employeesNumber];

            for (int i = 0; i < employees.length; i++) {
                System.out.println("Write the name of the " + (i + 1) + "º employee");
                 scanner.nextLine();
                 employeeName = scanner.nextLine();
                    if (employeeName.isBlank()) {
                        throw new InputMismatchException("You can't put a blank like a name");
                    }

                System.out.println("Write the salary of the " + (i + 1) + "º employee");
                    if (scanner.hasNextDouble()  ){
                        employeeSalary = scanner.nextDouble();
                        if( employeesNumber <= 0){
                            throw new InputMismatchException("You must put a salary like a double that is more than 0");
                        }
                    } else {
                        throw new InputMismatchException("You must put a double value into the salary");
                    }
                employees[i] = new Employee(employeeName, employeeSalary);
            }
        }catch (InputMismatchException exception){
            System.out.println(exception.getMessage());
            System.out.println("Restarting the App\n");
            scanner.nextLine();
            registerEmployees();

        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            System.out.println("Restarting the App\n");
            scanner.nextLine();
            registerEmployees();
        }
    }



}
