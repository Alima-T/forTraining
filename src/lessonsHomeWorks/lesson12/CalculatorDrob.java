package lessonsHomeWorks.lesson12;

public class CalculatorDrob implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        //a = 1/5
        //b = 2/3

        int resultDivisor = a.getDivisor() * b.getDivisor();
        int resultDividend = a.getDividend() * b.getDivisor() + b.getDividend() * a.getDivisor();

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(resultDivisor);
        result.setDividend(resultDividend);
        return result;

    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
