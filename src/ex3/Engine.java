package ex3;

import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable {
    private int power;
private String producer;


    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public Engine() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && Objects.equals(producer, engine.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, producer);
    }

    @Override
    public java.lang.String toString() {
        return "\nPower: " + getPower()+"\nProducer: "+getProducer();
    }
}
