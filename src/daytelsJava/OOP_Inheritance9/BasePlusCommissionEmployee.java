package daytelsJava.OOP_Inheritance9;

public class BasePlusCommissionEmployee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private double baseSalary; // base salary per week
    // six-argument constructor/ Эти переменные и методы инкапсулируют все необходимые характеристики низкооплачиваемого комиссионера. Обратите внимание на сходство между этим классом и классом CommissionEmployee
    //(рис. 9.4)—в этом примере мы пока не будем использовать это сходство. Класс BasePlusCommissionEmployee не указывает “extends Object” в строке 5, поэтому класс неявно (cnh 18) расширяет Объект. Кроме того, как и конструктор класса
    //CommissionEmployee (строки 13-22 рис. 9.4), конструктор класса BasePlusCommissionEmployee вызывает класс Конструктор объекта по умолчанию неявно, как отмечено в комментарии в строке 18.
    public BasePlusCommissionEmployee(String first, String last,
                                      String ssn, double sales, double rate, double salary) {
        // implicit call to Object constructor occurs here / неявный вызов конструктора объекта происходит здесь
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // validate and store gross sales
        setCommissionRate(rate); // validate and store commission rate
        setBaseSalary(salary); // validate and store base salary
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double sales) {
        if (sales >= 0) {
            this.grossSales = sales;
        } else throw new IllegalArgumentException("Gross sales must be >= 0.0");

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            this.commissionRate = rate;
        } else
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setBaseSalary(double salary) {
        if (salary >= 0.0) {
            this.baseSalary = salary;
        } else throw new IllegalArgumentException("Base salary must be >= 0.0");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //calculation of earning
    public double earnings() {
        return baseSalary = (grossSales * commissionRate);
    }

    // return String representation of BasePlusCommissionEmployee
    @Override // indicates that this method overrides a superclass method
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f ",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate, "base salary", baseSalary);

    }


    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee( // instantiate BasePlusCommissionEmployee object
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
        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee.toString());//явно вызовите метод toString, чтобы получить строковое представление объекта.

    }

}

