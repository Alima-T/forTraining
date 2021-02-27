package lessons.lesson12Interfaces;

public class FractionNumberImpl implements FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumberImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;

    }

    public FractionNumberImpl() {

    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;


    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() { // @return вещественное число для заднной дроби,
        // это число с запятой, поэтому одно из значений преобразовать в double
        return this.dividend / (double) this.divisor;
    }

    @Override
    public String toString() {
        return this.dividend + "/" + this.divisor; //переопределен под нас, было super.toString, где super - это обращение к род. классу: родительский класс, вызови нам toString

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FractionNumberImpl)) return false;

        FractionNumberImpl that = (FractionNumberImpl) o;

        if (getDividend() != that.getDividend()) return false;
        return getDivisor() == that.getDivisor();
    }

    @Override
    public int hashCode() {
        int result = getDividend();
        result = 31 * result + getDivisor();
        return result;
    }
}

