package lessons.lesson12Interfaces;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl drob1 = new FractionNumberImpl(1, 5);
        FractionNumberImpl drob2 = new FractionNumberImpl(2, 3);

        double result = drob1.value();
        System.out.println(result);
        System.out.println(drob1.toString());

        CalculatorDrob calculator = new CalculatorDrob();

        FractionNumber resultAdd = calculator.add(drob1, drob2);
        System.out.println((resultAdd));

        FractionNumber resultSub = calculator.sub(drob1,drob2);
        System.out.println(resultSub);

        FractionNumber resultMul = calculator.mul(drob1, drob2);
        System.out.println((resultMul));

        FractionNumber resultDiv = calculator.div(drob1,drob2);
        System.out.println(resultDiv);


    }
}
