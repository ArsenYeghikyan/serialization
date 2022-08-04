package ex2;

import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public Engine() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "\nPower: " + power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power);
    }
}
