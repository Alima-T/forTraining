package daytelsJava.OOP_Inheritance9;

//Methods earnings and toString  use the class’s get methods to obtain the values of its instance variables. If we decide to change the instance variable names,
// the earnings and toString declarations will not require modification—only the bodies of the get and set methods that directly manipulate the instance variables will need to change.
// These changes occur solely within the superclass—no changes to the subclass are needed. Localizing the effects of changes like this is a good software engineering practice.
public class CommissionEmployee3 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    //5-argument construction, ssn - Social Security Number // имя, фамилию, номер социального страхования, ставку комиссии и валовую (т. е. общую) сумму продаж.
    public CommissionEmployee3(String first, String last, String ssn, double sales, double rate) { //комиссионный работник
        // implicit call to Object constructor occurs here / неявный вызов конструктора объекта происходит здесь
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // validate and store gross sales/ Проверка и хранение валовых продаж
        setCommissionRate(rate); // validate and store commission rate /Проверка и хранение комиссионной ставки.
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double sales) {
        if (sales >= 0.0) {
            this.grossSales = sales;
        } else
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            this.commissionRate = rate;
        } else
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
    }

    //Methods earnings and toString  use the class’s get methods to obtain the values of its instance variables. If we decide to change the instance variable names,
// the earnings and toString declarations will not require modification—only the bodies of the get and set methods that directly manipulate the instance variables will need to change.
// These changes occur solely within the superclass—no changes to the subclass are needed. Localizing the effects of changes like this is a good software engineering practice.
    public double earning() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
}
/*Class BasePlusCommissionEmployee’s earnings Method
Method earnings (lines 35–39) overrides class CommissionEmployee’s earnings method
(Fig. 9.10, lines 93–96) to calculate a base-salaried commission employee’s earnings. The
new version obtains the portion of the earnings based on commission alone by calling CommissionEmployee’s
earnings method with super.earnings() (line 34), then adds the
base salary to this value to calculate the total earnings. Note the syntax used to invoke an
overridden superclass method from a subclass—place the keyword super and a dot (.) separator
before the superclass method name. This method invocation is a good software engineering
practice—if a method performs all or some of the actions needed by another
method, call that method rather than duplicate its code. By having BasePlusCommission-
Employee’s earnings method invoke CommissionEmployee’s earnings method to calculate
part of a BasePlusCommissionEmployee object’s earnings, we avoid duplicating the
code and reduce code-maintenance problems. If we did not use “super.” then BasePlusCommissionEmployee’s
earnings method would call itself rather than the superclass version.
This would result in infinite recursion, which would eventually cause the method-call stack
to overflow—a fatal runtime error.
Class BasePlusCommissionEmployee’s toString Method
Similarly, BasePlusCommissionEmployee’s toString method (Fig. 9.11, lines 38–43)
overrides class CommissionEmployee’s toString method (Fig. 9.10, lines 91–99) to return a String representation that’s appropriate for a base-salaried commission employee. The
new version creates part of a BasePlusCommissionEmployee object’s String representation
(i.e., the String "commission employee" and the values of class CommissionEmployee’s
private instance variables) by calling CommissionEmployee’s toString method with
the expression super.toString() (Fig. 9.11, line 42). BasePlusCommissionEmployee’s
toString method then outputs the remainder of a BasePlusCommissionEmployee object’s
String representation (i.e., the value of class BasePlusCommissionEmployee’s base salary).
Testing Class BasePlusCommissionEmployee
Class BasePlusCommissionEmployeeTest performs the same manipulations on a Base-
PlusCommissionEmployee object as in Fig. 9.7 and produces the same output, so we do
not show it here. Although each BasePlusCommissionEmployee class you’ve seen behaves
identically, the version in Fig. 9.11 is the best engineered. By using inheritance and by calling
methods that hide the data and ensure consistency, we’ve efficiently and effectively
constructed a well-engineered class.
Summary of the Inheritance Examples in Sections 9.4.1–9.4.5
You’ve now seen a set of examples that were designed to teach good software engineering
with inheritance. You used the keyword extends to create a subclass using inheritance,
used protected superclass members to enable a subclass to access inherited superclass instance
variables, and overrode superclass methods to provide versions that are more appropriate
for subclass objects. In addition, you applied software engineering techniques from
Chapter 8 and this chapter to create classes that are easy to maintain, modify and debug.
Метод заработка Class BasePlusCommissionEmployee
Метод заработка (строки 35-39) переопределяет метод заработка комиссионера класса
(рис. 9.10, строки 93-96) для расчета базового заработка комиссионера.
Новая версия получает часть заработка, основанную только на комиссии, вызывая метод
заработка CommissionEmployee с помощью super.earnings() (строка 34), а затем добавляет
базовую зарплату к этому значению для расчета общей прибыли. Обратите внимание на синтаксис, используемый для вызова
переопределенного метода суперкласса из подкласса—поместите ключевое слово super и разделитель точек (.) .
перед именем метода суперкласса. Этот вызов метода является хорошей
практикой разработки программного обеспечения—если метод выполняет все или некоторые действия, необходимые другому
методу, вызовите этот метод, а не дублируйте его код. Имея BasePlusCommission-
Метод заработка сотрудника вызовите метод заработка CommissionEmployee для расчета
части заработка объекта BasePlusCommissionEmployee, мы избежим дублирования
кода и уменьшим проблемы с обслуживанием кода. Если бы мы не использовали “супер”, то метод
заработка BasePlusCommissionEmployee называл бы себя, а не версию суперкласса.
Это приведет к бесконечной рекурсии, которая в конечном итоге приведет
к переполнению стека вызовов методов-фатальной ошибке времени выполнения.
Метод toString класса BasePlusCommissionEmployee
Аналогично, метод toString BasePlusCommissionEmployee (рис. 9.11, строки 38-43)
переопределяет метод toString класса CommissionEmployee (рис. 9.10, строки 91-99) для возврата строкового представления, подходящего для низкооплачиваемого комиссионера.
Новая версия создает часть строкового представления объекта BasePlusCommissionEmployee
(то есть строка "commission employee" и значения
частных переменных экземпляра класса CommissionEmployee) путем вызова метода toString CommissionEmployee с
выражением super.toString() (рис. 9.11, строка 42). Затем
метод toString BasePlusCommissionEmployee выводит оставшуюся часть объекта BasePlusCommissionEmployee
Строковое представление (т. е. значение базовой зарплаты класса BasePlusCommissionEmployee).
Тестовый класс BasePlusCommissionEmployee
Класс BasePlusCommissionEmployeeTest выполняет те же манипуляции с базой-
Объект PlusCommissionEmployee, как и на рис. 9.7, выдает тот же результат, поэтому мы
его здесь не показываем. Хотя каждый класс BasePlusCommissionEmployee, который вы видели, ведет
себя одинаково, версия на рис. 9.11 лучше всего спроектирована. Используя наследование и вызывая
методы, которые скрывают данные и обеспечивают согласованность, мы эффективно и эффективно
построили хорошо спроектированный класс.
Краткое изложение примеров наследования в разделах 9.4.1–9.4.5
Теперь вы видели набор примеров, которые были разработаны для обучения хорошей программной инженерии
с наследством. Вы использовали ключевое слово extends для создания подкласса с помощью наследования,
использовали защищенные члены суперкласса, чтобы позволить подклассу получить доступ к унаследованным
переменным экземпляра суперкласса, и переопределили методы суперкласса, чтобы предоставить версии, более подходящие
для объектов подкласса. Кроме того, вы применили методы разработки программного обеспечения из
Глава 8 и эта глава предназначены для создания классов, которые легко поддерживать, изменять и отлаживать.
*/