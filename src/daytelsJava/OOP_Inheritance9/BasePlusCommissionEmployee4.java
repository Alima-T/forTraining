package daytelsJava.OOP_Inheritance9;

public class BasePlusCommissionEmployee4 extends CommissionEmployee3 {
    private double baseSalary;

    public BasePlusCommissionEmployee4(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if (salary > 0.0) {
            this.baseSalary = salary;
        } else
            throw new IllegalArgumentException("Base salary must be > 0.0");
    }

    public double earning() {
        return getBaseSalary() * super.earning();
    }

    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }

    public static void main(String[] args) {
        BasePlusCommissionEmployee4 employee = new BasePlusCommissionEmployee4(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // get base-salaried commission employee data
        System.out.println(
                "Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000); // set base salary

        System.out.printf("\n%s:\n\n%s\n",
                "Updated employee information obtained by toString",
                employee.toString());

    }
}
