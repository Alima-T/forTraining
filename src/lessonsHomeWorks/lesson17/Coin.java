package lessonsHomeWorks.lesson17;


public class Coin implements Comparable<Coin> {

    private int year;
    private double diameter;
    private int nominal;
    private String metal;

    public Coin() {
    }

    public Coin(int year, double diameter, int nominal, String metal) {
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
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", diameter=" + diameter +
                ", metal='" + metal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof lessons.lesson14CollectionNew.Coin)) return false;

        final lessons.lesson14CollectionNew.Coin coin = (lessons.lesson14CollectionNew.Coin) o;

        if (getYear() != coin.getYear()) return false;
        if (Double.compare(coin.getDiameter(), getDiameter()) != 0) return false;
        if (getNominal() != coin.getNominal()) return false;
        return getMetal() != null ? getMetal().equals(coin.getMetal()) : coin.getMetal() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getYear();
        temp = Double.doubleToLongBits(getDiameter());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getNominal();
        result = 31 * result + (getMetal() != null ? getMetal().hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(Coin other) {
        if (this.nominal < other.nominal) {
            return 1;
        } else if (this.nominal == other.nominal) {
            if (this.year < other.year) {
                return 1;
            } else if (this.year == other.year) {
                if (this.diameter < other.diameter) {
                    return 1;
                } else if (this.diameter == other.diameter) {
                    return (this.metal.compareTo(other.metal));
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
}


