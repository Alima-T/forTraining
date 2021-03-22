package lessonsHomeWorks.studentsWorks.Anton;

import java.util.Objects;

public class Coin implements Comparable<Coin> {

    private int diametr;
    private int nominal;
    private int yaer;
    private String matal;

    public Coin(int diametr) {

    }

    public Coin(int diametr, int nominal, int yaer, String matal) {
        this.diametr = diametr;
        this.nominal = nominal;
        this.yaer = yaer;
        this.matal = matal;
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

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    public String getMatal() {
        return matal;
    }

    public void setMatal(String matal) {
        this.matal = matal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return diametr == coin.diametr && nominal == coin.nominal && yaer == coin.yaer && Objects.equals(matal, coin.matal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr, nominal, yaer, matal);
    }

    @Override
    public String toString() {
        return "Монета{" +
                "диаметр=" + diametr +
                ", номинал=" + nominal +
                ", год выпуска=" + yaer +
                ", металл='" + matal + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        int returnValue = 0;
        if (this.getDiametr() != o.getDiametr()) {
            returnValue = o.getDiametr() - this.getDiametr();

        } else if (returnValue == 0 && this.getNominal() != o.getNominal()) {
            returnValue = o.getNominal() - this.getNominal();
        } else if (returnValue == 0 && this.getYaer() != o.getYaer()) {
            returnValue = o.getYaer() - this.getYaer();
        } else {
            returnValue = o.getMatal().compareTo(this.getMatal());
        }
        return returnValue;

    }
}
