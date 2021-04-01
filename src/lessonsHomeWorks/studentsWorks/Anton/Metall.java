package lessonsHomeWorks.studentsWorks.Anton;

import java.util.Objects;

public class Metall {
   private String name;
   private int value;

    public Metall() {
    }

    public Metall(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metall metall = (Metall) o;
        return value == metall.value && Objects.equals(name, metall.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
