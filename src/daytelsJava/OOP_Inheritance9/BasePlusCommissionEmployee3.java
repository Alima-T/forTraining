package daytelsJava.OOP_Inheritance9;

public class BasePlusCommissionEmployee3 extends CommissionEmployee2 {
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee3(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);//explicit (явный) call to superclass
        setBaseSalary(salary);// validate and store base salary
    }

    public BasePlusCommissionEmployee3(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn, sales, rate);
    }

    public void setBaseSalary(double salary) {
        if (salary >= 0.0) {
            this.baseSalary = salary;
        } else throw new IllegalArgumentException("Base salary must be >=0.0");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() { //  allowed: grossSales and CommissionRate protected in superclass
        return baseSalary + (grossSales * commissionRate);
    }
    //    return String representation of BasePlusCommissionEmployee
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee( // instantiate BasePlusCommissionEmployee object
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        // get base-salaried commission employee data
        System.out.println( // allowed: variables and toString are protected in superclass
                "Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is", employee.getBaseSalary());
        employee.setBaseSalary(1000); // set base salary
        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee.toString());//явно вызовите метод toString, чтобы получить строковое представление объекта.

    }
}
/*
To enable class BasePlusCommissionEmployee3 to directly access superclass instance variables we can declare those members as protected in the superclass.
A superclass’s protected members are accessible by all subclasses of that superclass.
We could have declared CommissionEmployee’s instance variables public to enable.
However, declaring public instance variables is poor software engineering because/ Однако объявление общедоступных переменных экземпляра является плохой программной инженерией, т.к.
it allows unrestricted access to the these variables, greatly increasing the chance of errors./ дает неограниченный доступ к переменным, что значительно увеличивает вероятность ошибок.
With protected instance variables, the subclass gets access to the instance variables, but classes that are not subclasses and
classes that are not in the same package cannot access these variables directly—recall that protected class members are also visible to other classes in the same package.
Class BasePlusCommissionEmployee3 extends the new version of class CommissionEmployee2 with protected instance variables.  As a result, the compiler does not
generate errors when compiling line 37 of method earnings and lines 46–48 of method toString. If another class extends this version of class BasePlusCommissionEmployee, the
new subclass also can access the protected members.
1
 */
