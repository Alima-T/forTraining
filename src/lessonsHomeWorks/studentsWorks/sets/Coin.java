package lessonsHomeWorks.studentsWorks.sets;

public class Coin implements Comparable<Coin> {
    private int year;
    private int diametr;
    private int nominal;
    private String metall;

    public Coin() {

    }

    public Coin(int year, int diametr, int nominal, String metall) {
        this.year = year;
        this.diametr = diametr;
        this.nominal = nominal;
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", diametr=" + diametr +

                ", metall='" + metall + '\'' +
                '}';
    }



    @Override
    public int compareTo(Coin o) { // Придумать сориторвку.
        if (this.nominal < o.nominal) {
            return -1;
        } else if (this.nominal == o.nominal) {
            if (this.year < o.year) {
                return -1;
            } else if (this.year == o.year) {
                if (this.diametr < o.diametr) {
                    return -1;
                } else if (this.diametr == o.diametr) {
                      return this.metall.compareTo(o.metall);
                } else return 1;
            } else return 1;
        } else return 1;


    }
}
