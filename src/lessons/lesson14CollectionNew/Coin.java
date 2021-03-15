package lessons.lesson14CollectionNew;

public class Coin implements Comparable<Coin> { // для соритировки в TreeSet имплементируем в данном классе Coin интерфейс Comparable в <Coin> (тип, с которым будем сравниваться тоже Coin), что значит сравнивать себя c ...
    //и имплементируем единственный метод compareTo
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
        if (!(o instanceof Coin)) return false;

        final Coin coin = (Coin) o;

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
        if (this.nominal > other.nominal) {
            return -1;
        } else if (this.nominal == other.nominal) {
            if (this.year > other.year) {
                return -1;
            } else if (this.year == other.year) {
                if (this.diameter > other.diameter) {
                    return -1;
                } else if (this.diameter == other.diameter) {
                    return (this.metal.compareTo(other.metal));
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }
}
//       if (this.nominal>other.nominal) return 1;
//        if (this.year> other.year) return 1;
//        if (this.diameter>other.diameter) return 1;
//        if (this.metal.equals(other.metal)) return 1;



//    public int compareTo(Pet other){
//        if(width < other.width) return -1;
//        if(width > other.width) return 1;
//        return 0;
//    }
//        if (this.nominal>other.nominal) return 1;
//        if (this.year> other.year) return 1;
//        if (this.diameter>other.diameter) return 1;
//        if (this.metal.equals(other.metal)) return 1;

//  return o.nominal.compareTo(this.nominal);

//        int result1 = this.nominal.compareTo(o.nominal);
//        int result2 = this.year.compareTo(o.year);
//        int result3 = this.diameter.compareTo(o.diameter);
//        int result4 = this.metal.compareTo(o.metal);

// прописать способ сортировки сравнения
//по номиналу
//по году
//по диаметру
//по металлу
//
//        return result1;
//    }






