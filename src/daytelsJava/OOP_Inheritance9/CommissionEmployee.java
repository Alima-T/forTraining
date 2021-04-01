package daytelsJava.OOP_Inheritance9;

public class CommissionEmployee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    //5-argument construction, ssn - Social Security Number // имя, фамилию, номер социального страхования, ставку комиссии и валовую (т. е. общую) сумму продаж.
    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) { //комиссионный работник
        // implicit call to Object constructor occurs here / неявный вызов конструктора объекта происходит здесь
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // validate and store gross sales/ Проверка и хранение валовых продаж
        setCommissionRate(rate); // validate and store commission rate /Проверка и хранение комиссионной ставки.
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        this.firstName = last;
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

    //set gross sales amount
    public void setGrossSales(double sales) {
        if (sales >= 0.0)
            grossSales = sales;
        else
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

//        try {
//        grossSales = (sales < 0.0) ? 0.0 : sales;
//        }catch (IllegalArgumentException e){
//            System.out.println("Gross sales must be >= 0.0");
//        }
    }


    public double getGrossSales() {
        return grossSales;
    }


    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0)
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

//      try {
//        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0; //не вижу необходимости в try catch, ибо в условии прописано что в случае exception  результат - 0.0
//    }catch (IllegalArgumentException e){
//        System.out.println("Commission rate must be > 0.0 and < 1.0");
//    }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //calculate earnings
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }

    public static void main(String[] args) {

        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.06);

        //get commission employee data
        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());

        employee.setGrossSales(500);
        employee.setCommissionRate(0.1);

        System.out.printf("\n%s:\n\n%s\n",
                "Updated employee information obtained by toString", employee);


    }

}
