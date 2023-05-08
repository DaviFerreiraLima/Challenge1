import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How manny employees do you want to add ?");
        int employeesNumber = scanner.nextInt();

        scanner.nextLine(); //Consumir quebra de Linha

        Employee[] employees= new Employee[employeesNumber];

        for (int i =0 ; i<employees.length; i++){

            System.out.println("Write the name of the "+(i+1)+"º employee");
            String employeeName = scanner.nextLine();

            System.out.println("Write the salary of the "+(i+1)+"º employee");
            double employeeSalary = scanner.nextDouble();

            scanner.nextLine();//Consumir quebra de Linha

            employees[i] = new Employee(employeeName,employeeSalary);

        }

        for (Employee employe : employees) {
            System.out.println("Name: "+employe.getName() + ", salário: "+employe.getSalary());
        }
    }
}
