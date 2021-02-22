package lessonsHomeWorks.lesson1;

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
        return this.dividend = dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return this.divisor = divisor;
    }

    @Override
    public double value() {
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

