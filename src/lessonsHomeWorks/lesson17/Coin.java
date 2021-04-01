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
        if (this.nominal != other.nominal) { // если два номиналала равны, то переходит к следующему if по году. Если же НЕ равны, то у номинала первой монеты отнимаем второй,
            return this.nominal - other.nominal; // получаем либо + либо -, т.о.достаточно написать return this.nominal - other.nominal
        }
        if (this.year != other.year) {
            return this.year - other.year;
        }
        if (this.diameter != other.diameter) { // при вычитании double получится 0.5 (3.0-2.5 = 0.5), double преобраз. к int, остаток после точки обрежется и будет =0, вторую манету программа не сохранит
            return Double.compare(this.diameter, other.diameter); // первый вариант: if (this.diameter > other.diameter) {return 1} else -1.
            // 2-й вариант подумать: если бы мы положили в Double внтурь TreeSet, то как бы она отсортировала? По возрастанию.
            // Тогда вопрос, а как она знает, что нужно по убыванию? Скорее всего у нее это где-то реализовано. А где рализовано?
            // Мы же храним не примитивный тип double, а ссылочный тип Double, соответственно, может внутри этого ссылочного типа реализован метод compareTo?
            // Может, и он точно там реализован, если его использует TreeSet, значит именно этот метод compareTo в классе Double мы можем переиспользовать.
            // Пишем Double. и выбираем подходящий нам метод, используем метод, чтобы не писать вручную и не заполнять код бесконечными if-else-return...
        }
        return this.metal.compareTo(other.metal);//если все остальные значения были равны остается сравнение по металлу и здесь if неуместно, пишем сразу return и сравнение,
        // т.к. String, то здесь по алфавиту. Пишем String. и упс, не находим метод compare, значит String non-static, в отличие от Double,к которму мы могли обратиться напрямую.
        // Значит обращаемся к переменной this.metal. и ищем метод compare здесь compareTo() возвращает int -1, 0 или 1
    }
}


