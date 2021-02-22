package lessons.lesson12Interfaces;

import java.util.Objects;

public class FractionNumberImpl implements FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumberImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.dividend = divisor;

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
        return this.dividend + "/" + this.divisor;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumberImpl that = (FractionNumberImpl) o;
        return dividend == that.dividend && divisor == that.divisor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dividend, divisor);
    }
}

