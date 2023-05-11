import java.text.DecimalFormat;

public class Employee {

    private String name;
    private double salary;
    private double netSalary;

    private String  bonusOrDiscount;


    public Employee(){
    }


    public Employee(String name, double salary) {
        this.name = name;
        this.salary= salary;
        setNetSalary(salary);
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
            this.salary = salary;
    }


    public double getNetSalary() {
        return netSalary;
    }


    public void setNetSalary(double salary) {

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (salary > 0 && salary <= 1000){
            this.netSalary = salary + (salary * 0.2);
            this.bonusOrDiscount = "Bonus:  R$ " +decimalFormat.format((this.netSalary - this.salary));
        }
        else if( salary > 1000 && salary <= 2000 ){
            this.netSalary  = salary + (salary * 0.1);
            this.bonusOrDiscount = "Bonus:  R$ " +decimalFormat.format((this.netSalary - this.salary));

        }else if( salary > 2000 ){
            this.netSalary = salary - (salary * 0.1);
            this.bonusOrDiscount = "Discount:  R$ " +decimalFormat.format((this.salary - this.netSalary));
        }

    }

    public String getBonusOrDiscount() {
        return bonusOrDiscount;
    }


    public void setBonusOrDiscount(String bonusOrDiscount) {
        this.bonusOrDiscount = bonusOrDiscount;
    }


    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return "Employee: "+getName() + "\n" +
                "Salary: R$ " + decimalFormat.format(getSalary()) + "\n"+
                this.bonusOrDiscount + "\n" +
                "Liquid salary: R$ "+ decimalFormat.format(getNetSalary()) + "\n";
    }
}
