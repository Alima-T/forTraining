package daytelsJava.OOP_Inheritance9;
// This example revisits (пересматривает) its commission employee hierarchy by declaring a CommissionEmployee4  and a BasePlusCommissionEmployee5.
//Each class's constructor print a message when invoked, enabling us to observe the order in which the constructors in hierarchy execute
//Конструктор каждого класса выводит сообщение при вызове, что позволяет нам наблюдать порядок выполнения конструкторов в иерархии
public class CommissionEmployee4 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public CommissionEmployee4(String first, String last, String ssn, double sales, double rate) { //комиссионный работник
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
            throw new IllegalArgumentException("Gross sales must be more or equals than 0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        if (rate >0.0&&rate< 1.0)//&& = at the same time = simultaneously [siml'teiniəsli] brit./[saiml'teiniəsli] am.- одновременно
        {this.commissionRate = rate;}
        else throw new IllegalArgumentException("Commission rate must be more than 0.0 and simultaniosly less than 1.0");
    }

    public double earnings(){
        return getGrossSales()*getCommissionRate(); //the product of numbers- произведение чисел/ multiplication - умножение
    }
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
/*
9.5 Constructors in Subclasses
As we explained in the preceding ( предыдыущем) section, instantiating (создание) a subclass object begins a chain (цепочка) of
constructor calls in which the subclass constructor, before performing its own tasks, invokes (calls)
its direct superclass’s constructor either explicitly via the super reference or implicitly calling (либо явно через супер ссылку)
the superclass’s default constructor or no-argument constructor. Similarly, if the superclass is derived from another class—as is,
of course, every class except Object—the superclass constructor invokes the constructor of the next class up the hierarchy, and
so on. The last constructor called in the chain is always the constructor for class Object.
The original subclass constructor’s body finishes executing last. Each superclass’s constructor
manipulates the superclass instance variables that the subclass object inherits. For example,
consider again the CommissionEmployee3 – BasePlusCommissionEmployee4 hierarchy
from Fig. 9.10 and Fig. 9.11. When a program creates a BasePlusCommissionEmployee4 object, its constructor is called. That constructor calls CommissionEmployee3’s constructor,
which in turn calls Object’s constructor. Class Object’s constructor has an empty body,
so it immediately returns control to CommissionEmployee3’s constructor, which then initializes the CommissionEmployee private instance variables that are part of the Base-
PlusCommissionEmployee4 object. When CommissionEmployee3’s constructor completes
execution, it returns control to BasePlusCommissionEmployee4’s constructor, which initializes
the BasePlusCommissionEmployee4 object’s baseSalary.
9.6 Software Engineering with Inheritance
When you extend a class, the new class inherits the superclass’s members—though the
private superclass members are hidden in the new class. You can customize the new class
to meet your needs by including additional members and by overriding superclass members.
Doing this does not require the subclass programmer to change (or even have access to)
the superclass’s source code. Java simply requires access to the superclass’s .class file so it
can compile and execute any program that uses or extends the superclass. This powerful
capability is attractive to independent software vendors (ISVs), who can develop proprietary
classes for sale or license and make them available to users in bytecode format. Users
then can derive new classes from these library classes rapidly and without accessing the
ISVs’ proprietary source code.
It’s sometimes difficult to appreciate the scope of the problems faced by designers who
work on large-scale software projects. People experienced with such projects say that effective
software reuse improves the software-development process. Object-oriented programming
facilitates software reuse, often significantly shortening development time.
The availability of substantial and useful class libraries delivers the maximum benefits
of software reuse through inheritance. The standard Java class libraries that are shipped
with Java tend to be rather general purpose, encouraging broad software reuse.Many other
class libraries exist.
Reading subclass declarations can be confusing, because inherited members are not
declared explicitly in the subclasses but are nevertheless present in them. A similar problem
exists in documenting subclass members.
Software Engineering Observation 9.6
Java ensures that even if a constructor does not assign a value to an instance variable, the
variable is still initialized to its default value (e.g., 0 for primitive numeric types, false
for booleans, null for references).
Software Engineering Observation 9.7
Although inheriting from a class does not require access to the class’s source code,
developers often insist on seeing the source code to understand how the class is
implemented. Developers in industry want to ensure that they’re extending a solid class—
for example, a class that performs well and is implemented robustly and securely.
Software Engineering Observation 9.8
At the design stage in an object-oriented system, you’ll often find that certain classes are
closely related. You should “factor out” common instance variables and methods and place
them in a superclass. Then use inheritance to develop subclasses, specializing them with
capabilities beyond those inherited from the superclass. Software Engineering Observation 9.9
Declaring a subclass does not affect its superclass’s source code. Inheritance preserves the
integrity of the superclass.
Software Engineering Observation 9.10
Designers of object-oriented systems should avoid class proliferation. Such proliferation
creates management problems and can hinder software reusability, because in a huge class
library it becomes difficult to locate the most appropriate classes. The alternative is to
create fewer classes that provide more substantial functionality, but such classes might
prove cumbersome.
9.5 Конструкторы в подклассах
Как мы объяснили в предыдущем разделе, создание экземпляра объекта подкласса начинает цепочку
вызовов конструктора, в которой конструктор подкласса, прежде чем выполнять свои собственные задачи, вызывает
конструктор своего прямого суперкласса либо явно через супер ссылку, либо неявно
вызывая конструктор суперкласса по умолчанию или конструктор без аргумента. Аналогично, если
суперкласс является производным от другого класса—как, конечно, каждый класс, кроме Объекта—
конструктор суперкласса вызывает конструктор следующего класса вверх по иерархии, и
так далее. Последний конструктор, вызываемый в цепочке, всегда является конструктором объекта класса.
Тело исходного конструктора подкласса завершает выполнение последним. Конструктор каждого суперкласса
управляет переменными экземпляра суперкласса, которые наследует объект подкласса. Например,
рассмотрим еще раз иерархию
CommissionEmployee–BasePlusCommissionEmployee из рис. 9.10 и рис. 9.11. Когда программа создает
объект BasePlusCommissionEmployee, вызывается его конструктор. Этот конструктор вызывает конструктор CommissionEmployee,
который, в свою очередь, вызывает конструктор объекта. Конструктор объекта класса имеет пустое тело,
поэтому он немедленно возвращает управление конструктору CommissionEmployee, который затем инициализирует переменные частного экземпляра CommissionEmployee,
являющиеся частью базы- Объект PlusCommissionEmployee. Когда конструктор CommissionEmployee завершает
выполнение, он возвращает управление конструктору BasePlusCommissionEmployee, который инициализирует
baseSalary объекта BasePlusCommissionEmployee.
9.6 Разработка программного обеспечения с наследованием
Когда вы расширяете класс, новый класс наследует члены суперкласса, хотя
частные члены суперкласса скрыты в новом классе. Вы можете настроить новый класс
в соответствии с вашими потребностями, включив дополнительные члены и переопределив члены суперкласса.
Для этого не требуется, чтобы программист подкласса изменял (или даже имел доступ)
исходный код суперкласса. Java просто требует доступа к файлу суперкласса .class, чтобы он
мог компилировать и выполнять любую программу, которая использует или расширяет суперкласс. Это мощное
возможность привлекательна для независимых поставщиков программного обеспечения (ISV), которые могут разрабатывать проприетарные
классы для продажи или лицензирования и предоставлять их пользователям в формате байт-кода.
Затем пользователи могут быстро получать новые классы из этих библиотечных классов, не обращаясь
к проприетарному исходному коду ISV.
Иногда трудно оценить масштаб проблем, с которыми сталкиваются дизайнеры,
работающие над крупномасштабными программными проектами. Люди, имеющие опыт работы с такими проектами, говорят, что эффективное
повторное использование программного обеспечения улучшает процесс разработки программного обеспечения. Объектно-ориентированное программирование
облегчает повторное использование программного обеспечения, часто значительно сокращая время разработки.
Наличие значительных и полезных библиотек классов обеспечивает максимальные преимущества
повторного использования программного обеспечения посредством наследования. Стандартные библиотеки классов Java, поставляемые
с Java, как правило, имеют довольно общее назначение, поощряя широкое повторное использование
 */
