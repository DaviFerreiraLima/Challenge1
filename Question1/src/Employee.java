import java.text.DecimalFormat;

public class Employee {

    private String name;
    private double salary;
    private double netSalary;

    private String  bonusOrDiscount;



    /**
     * Default Constructor.
     */
    public Employee(){
    }

    /**
     * Constructor that initialize an employee with name,salary and netSalary;
     *
     * @param name (String)
     * @param salary (double)
     * */

    public Employee(String name, double salary) {
        this.name = name;
        this.salary= salary;
        setNetSalary(salary);
    }

    /**
     * Gets the employee name.
     *
     * @return The employee name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     *
     * @param name (String)
     * @throws IllegalArgumentException If the String name it's just a blank.
     */
    public void setName(String name) {
        if(!name.isBlank()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("The name cant be blank");
        }

    }

    /**
     * Gets the employee's salary
     *
     * @return the employee's salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     *
     * @param salary (double)
     * @throws IllegalArgumentException If the salary it's less than or equal to 0 .
     */
    public void setSalary(double salary) {
        if(salary > 0 ){
            this.salary = salary;
        }else {
            throw new IllegalArgumentException("You cant register a negative salary.");
        }
    }

    /**
     * Gets the employee's net salary.
     *
     * @return the employee's net salary.
     */
    public double getNetSalary() {
        return netSalary;
    }

    /**
     * This function recieve the salary and ,after that ,sets the net salary .Furthermore,sets  if the employee
     * will recieve a bonus or a discount based in the recieved parameter.
     *
     * @param salary (double)
     */
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
    /**
     * Gets the employee's bonus or discount.
     *
     * @return the employee's bonus or discount.
     */
    public String getBonusOrDiscount() {
        return bonusOrDiscount;
    }

    /**
     * Sets the employee's bonus or discount.
     *
     * @param bonusOrDiscount (String)
     * @throws IllegalArgumentException If the salary it's less than or equal to 0 .
     */
    public void setBonusOrDiscount(String bonusOrDiscount) {
        this.bonusOrDiscount = bonusOrDiscount;
    }

    /**
     * Returns the employee's information in a String;
     *
     * @return The employee's information
     */
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return "Employee: "+getName() + "\n" +
                "Salary: R$ " + decimalFormat.format(getSalary()) + "\n"+
                this.bonusOrDiscount + "\n" +
                "Liquid salary: R$ "+ decimalFormat.format(getNetSalary()) + "\n";
    }
}
