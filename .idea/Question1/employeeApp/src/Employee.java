public class Employee {

    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 1000) {
            this.salary = salary + (salary * 0.2);
        } else if (salary > 1000 && salary <= 2000) {
            this.salary = salary + (salary * 0.1);

        } else if (salary > 2000) {
            this.salary = salary - (salary * 0.1);
        }
    }
}
