package lessons.lesson14;

public class CoinHashSet {
    private int year;
    private double diameter;
    private int nominal;
    private String metal;

    public CoinHashSet(int year, double diameter, int nominal, String metal) {
        this.year = year;
        this.diameter = diameter;
        this.nominal = nominal;
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Coin {" +
                "year=" + year +
                ", diameter=" + diameter +
                ", nominal=" + nominal +
                ", metal='" + metal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoinHashSet)) return false;

        CoinHashSet coin = (CoinHashSet) o;

        if (getYear() != coin.getYear()) return false;
        if (Double.compare(coin.getDiameter(), getDiameter()) != 0) return false;
        if (getNominal() != coin.getNominal()) return false;
        return getMetal().equals(coin.getMetal());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getYear();
        temp = Double.doubleToLongBits(getDiameter());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getNominal();
        result = 31 * result + getMetal().hashCode();
        return result;
    }
}
