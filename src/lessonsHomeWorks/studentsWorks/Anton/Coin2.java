package lessonsHomeWorks.studentsWorks.Anton;

public class Coin2 implements Comparable<Coin2>{
    private int nominal;
    private int yaer;
    private Metall metall = new Metall();

    public Coin2() {
    }

    public Coin2(int nominal, int yaer, Metall metal) {
        this.nominal = nominal;
        this.yaer = yaer;
        this.metall = metal;
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

    public Metall getMetall() {
        return metall;
    }

    public void setMetall(Metall metall) {
        this.metall = metall;
    }

    public String toString() {
        return "Монета{" +
                "номинал=" + nominal +
                ", год выпуска=" + yaer +
                ", металл='" + metall.getName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin2 o) {
        int returnValue = 0;
        if (this.getNominal() != o.getNominal()){
            returnValue = o.getNominal() - this.getNominal();
        }
        else if (returnValue == 0 && this.getYaer() != o.getYaer()){
            returnValue = o.getYaer() - this.getYaer();
        }
        else {
            returnValue = o.metall.getValue() - this.metall.getValue();
        }
        return returnValue;
    }
}
