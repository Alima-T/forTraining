package daytelsJava.OOP_Inheritance9;

public class BasePlusCommissionEmployee5 extends CommissionEmployee4 {

    private double baseSalary; //объявление переменной, которой нет в суперклассе

    //наследование конструктора с 5 аргументами из род.класса + добавляем 6-й аргумент double salary
    public BasePlusCommissionEmployee5(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate); // наследование инициализированных переменных из родительского класса
        setBaseSalary (salary); //validate and store BaseSalary, которой нет в род.классе

        System.out.printf("\nBasePlusCommissionEmployee5 constructor: \n%s\n", this);
    }// end 6-arg. constructor

    public double getBaseSalary() {
                return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if (salary > 0.0) {
            this.baseSalary = salary;
        } else throw new IllegalArgumentException("Base salary must be more than 0.0");
    }

    @Override
    public double earnings() {
        return getBaseSalary()+super.earnings();
    }

    public String toString(){
        return String.format("%s %s \n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }

    public static void main(String[] args) {
        CommissionEmployee4 employee1 = new CommissionEmployee4("Bob", "Lewis", "333-33-3333", 5000, .04);
        System.out.println();
        BasePlusCommissionEmployee5 employee2 = new BasePlusCommissionEmployee5("Lise", "Jones", "555-55-555", 2000, .06, 800);
        System.out.println();
        BasePlusCommissionEmployee5 employee3 = new BasePlusCommissionEmployee5("Mark", "Sands", "888-88-8888", 8000, .15, 2000);
    }
}
